package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
class FocusStrategy {

    /* loaded from: classes.dex */
    public interface BoundsAdapter<T> {
        void obtainBounds(T t2, Rect rect);
    }

    /* loaded from: classes.dex */
    public interface CollectionAdapter<T, V> {
        V get(T t2, int i2);

        int size(T t2);
    }

    private static int getWeightedDistanceFor(int i2, int i3) {
        return (i2 * 13 * i2) + (i3 * i3);
    }

    public static <L, T> T findNextFocusInRelativeDirection(L l2, CollectionAdapter<L, T> collectionAdapter, BoundsAdapter<T> boundsAdapter, T t2, int i2, boolean z2, boolean z3) {
        int size = collectionAdapter.size(l2);
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(collectionAdapter.get(l2, i3));
        }
        Collections.sort(arrayList, new SequentialComparator(z2, boundsAdapter));
        if (i2 != 1) {
            if (i2 == 2) {
                return (T) getNextFocusable(t2, arrayList, z3);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) getPreviousFocusable(t2, arrayList, z3);
    }

    private static <T> T getNextFocusable(T t2, ArrayList<T> arrayList, boolean z2) {
        int size = arrayList.size();
        int lastIndexOf = (t2 == null ? -1 : arrayList.lastIndexOf(t2)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z2 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T getPreviousFocusable(T t2, ArrayList<T> arrayList, boolean z2) {
        int size = arrayList.size();
        int indexOf = (t2 == null ? size : arrayList.indexOf(t2)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z2 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* loaded from: classes.dex */
    private static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1 = new Rect();
        private final Rect mTemp2 = new Rect();

        SequentialComparator(boolean z2, BoundsAdapter<T> boundsAdapter) {
            this.mIsLayoutRtl = z2;
            this.mAdapter = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(T t2, T t3) {
            Rect rect = this.mTemp1;
            Rect rect2 = this.mTemp2;
            this.mAdapter.obtainBounds(t2, rect);
            this.mAdapter.obtainBounds(t3, rect2);
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                return this.mIsLayoutRtl ? 1 : -1;
            } else if (rect.left > rect2.left) {
                return this.mIsLayoutRtl ? -1 : 1;
            } else if (rect.bottom < rect2.bottom) {
                return -1;
            } else {
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right < rect2.right) {
                    return this.mIsLayoutRtl ? 1 : -1;
                } else if (rect.right > rect2.right) {
                    return this.mIsLayoutRtl ? -1 : 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(L l2, CollectionAdapter<L, T> collectionAdapter, BoundsAdapter<T> boundsAdapter, T t2, Rect rect, int i2) {
        Rect rect2 = new Rect(rect);
        if (i2 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i2 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i2 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i2 == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t3 = null;
        int size = collectionAdapter.size(l2);
        Rect rect3 = new Rect();
        for (int i3 = 0; i3 < size; i3++) {
            T t4 = collectionAdapter.get(l2, i3);
            if (t4 != t2) {
                boundsAdapter.obtainBounds(t4, rect3);
                if (isBetterCandidate(i2, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t3 = t4;
                }
            }
        }
        return t3;
    }

    private static boolean isBetterCandidate(int i2, Rect rect, Rect rect2, Rect rect3) {
        if (isCandidate(rect, rect2, i2)) {
            if (isCandidate(rect, rect3, i2) && !beamBeats(i2, rect, rect2, rect3)) {
                return !beamBeats(i2, rect, rect3, rect2) && getWeightedDistanceFor(majorAxisDistance(i2, rect, rect2), minorAxisDistance(i2, rect, rect2)) < getWeightedDistanceFor(majorAxisDistance(i2, rect, rect3), minorAxisDistance(i2, rect, rect3));
            }
            return true;
        }
        return false;
    }

    private static boolean beamBeats(int i2, Rect rect, Rect rect2, Rect rect3) {
        boolean beamsOverlap = beamsOverlap(i2, rect, rect2);
        if (beamsOverlap(i2, rect, rect3) || !beamsOverlap) {
            return false;
        }
        return !isToDirectionOf(i2, rect, rect3) || i2 == 17 || i2 == 66 || majorAxisDistance(i2, rect, rect2) < majorAxisDistanceToFarEdge(i2, rect, rect3);
    }

    private static boolean isCandidate(Rect rect, Rect rect2, int i2) {
        if (i2 == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        } else if (i2 == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        } else if (i2 == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        } else if (i2 == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean beamsOverlap(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    private static boolean isToDirectionOf(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            return rect.left >= rect2.right;
        } else if (i2 == 33) {
            return rect.top >= rect2.bottom;
        } else if (i2 == 66) {
            return rect.right <= rect2.left;
        } else if (i2 == 130) {
            return rect.bottom <= rect2.top;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static int majorAxisDistance(int i2, Rect rect, Rect rect2) {
        return Math.max(0, majorAxisDistanceRaw(i2, rect, rect2));
    }

    private static int majorAxisDistanceRaw(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else if (i2 == 130) {
            i3 = rect2.top;
            i4 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i3 - i4;
    }

    private static int majorAxisDistanceToFarEdge(int i2, Rect rect, Rect rect2) {
        return Math.max(1, majorAxisDistanceToFarEdgeRaw(i2, rect, rect2));
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.left;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.top;
        } else if (i2 == 66) {
            i3 = rect2.right;
            i4 = rect.right;
        } else if (i2 == 130) {
            i3 = rect2.bottom;
            i4 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i3 - i4;
    }

    private static int minorAxisDistance(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    private FocusStrategy() {
    }
}
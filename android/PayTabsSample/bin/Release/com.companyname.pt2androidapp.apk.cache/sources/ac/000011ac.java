package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class OneofInfo {
    private final Field caseField;
    private final int id;
    private final Field valueField;

    public OneofInfo(int id, Field caseField, Field valueField) {
        this.id = id;
        this.caseField = caseField;
        this.valueField = valueField;
    }

    public int getId() {
        return this.id;
    }

    public Field getCaseField() {
        return this.caseField;
    }

    public Field getValueField() {
        return this.valueField;
    }
}
package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public interface JsonSerializer<T> {
    JsonElement serialize(T t2, Type type, JsonSerializationContext jsonSerializationContext);
}
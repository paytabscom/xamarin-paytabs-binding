package com.google.gson;

/* loaded from: classes.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l2) {
            if (l2 == null) {
                return JsonNull.INSTANCE;
            }
            return new JsonPrimitive(l2);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l2) {
            if (l2 == null) {
                return JsonNull.INSTANCE;
            }
            return new JsonPrimitive(l2.toString());
        }
    };

    public abstract JsonElement serialize(Long l2);
}
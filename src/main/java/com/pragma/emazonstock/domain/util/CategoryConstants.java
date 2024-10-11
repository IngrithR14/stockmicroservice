package com.pragma.emazonstock.domain.util;

public final class CategoryConstants {
    private CategoryConstants() {
        throw new IllegalStateException("Utility class");
    }

    public enum Field {
        NAME,
        DESCRIPTION
    }

    public static final String FIELD_NAME_EMPTY_MESSAGE = "Field 'name' cannot be empty";
    public static final String FIELD_DESCRIPTION_EMPTY_MESSAGE = "Field 'description' cannot be empty";

}


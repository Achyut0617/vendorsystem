
package com.vendorsystem.common;

public final class ValidationMessages {

    private ValidationMessages() {
    }

    public static final String REQUIRED = "This field is required";

    public static final String INVALID_EMAIL =
            "Please provide a valid email address";

    public static final String INVALID_PHONE =
            "Please provide a valid phone number";

    public static final String INVALID_NAME =
            "Name must contain between 2 and 100 characters";
}

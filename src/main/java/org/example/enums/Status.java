package org.example.enums;

public enum Status {
    INSTOCK("IN STOCK"),
    UPCOMING("UPCOMING"),
    BORROWED("BORROWED");

    private final String value;

    Status(String status) {
        this.value = status;
    }

    public String getValue(){
        return this.value;
    }
}

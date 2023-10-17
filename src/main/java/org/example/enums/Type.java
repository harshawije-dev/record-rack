package org.example.enums;

public enum Type {
    SINGER("Singer"),
    WRITER("Writer"),
    COMPOSER("Composer"),
    SINGERNWRITER("Singer & Writer"),
    SIGERNWRITERNCOMPOSER("Singer & Writer & Composer");

    private String type;

    Type(String types) {
        this.type = types;
    }
}

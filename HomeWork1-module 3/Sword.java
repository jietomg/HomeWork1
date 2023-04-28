package org.future.code.homework.metal;

public class Sword<T extends Metal> {
    private final T type;

    public Sword(T metal) {
        this.type = metal;
    }

    public boolean isOk() {
        return type.getEndurance() > 49;
    }
}

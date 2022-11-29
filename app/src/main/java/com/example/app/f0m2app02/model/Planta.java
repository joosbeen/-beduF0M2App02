package com.example.app.f0m2app02.model;

public class Planta {

    private int stringResourceint;

    public Planta(int stringResourceint) {
        this.stringResourceint = stringResourceint;
    }

    public int getStringResourceint() {
        return stringResourceint;
    }

    public void setStringResourceint(int stringResourceint) {
        this.stringResourceint = stringResourceint;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "stringResourceint=" + stringResourceint +
                '}';
    }
}

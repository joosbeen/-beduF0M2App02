package com.example.app.f0m2app02.model.weather;

public class Rain {
    private float h;

    public Rain() {
    }

    public Rain(float h) {
        this.h = h;
    }

// Getter Methods

    public float get1h() {
        return h;
    }

    // Setter Methods

    public void set1h(float h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "h=" + h +
                '}';
    }
}

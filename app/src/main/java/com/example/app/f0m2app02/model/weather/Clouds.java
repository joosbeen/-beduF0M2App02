package com.example.app.f0m2app02.model.weather;

public class Clouds {

    private float all;

    public Clouds() {
    }

    public Clouds(float all) {
        this.all = all;
    }

    // Getter Methods

    public float getAll() {
        return all;
    }

    // Setter Methods

    public void setAll(float all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}

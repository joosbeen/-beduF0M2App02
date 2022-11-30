package com.example.app.f0m2app02.model.weather;

public class Wind {
    private float speed;
    private float deg;
    private float gust;

    public Wind() {
    }

    public Wind(float speed, float deg, float gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

// Getter Methods

    public float getSpeed() {
        return speed;
    }

    public float getDeg() {
        return deg;
    }

    public float getGust() {
        return gust;
    }

    // Setter Methods

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }

    public void setGust(float gust) {
        this.gust = gust;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                ", gust=" + gust +
                '}';
    }
}

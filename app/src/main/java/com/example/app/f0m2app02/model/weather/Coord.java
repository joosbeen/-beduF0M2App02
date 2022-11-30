package com.example.app.f0m2app02.model.weather;

public class Coord {
    private float lon;
    private float lat;

    public Coord() {
    }

    public Coord(float lon, float lat) {
        this.lon = lon;
        this.lat = lat;
    }

// Getter Methods

    public float getLon() {
        return lon;
    }

    public float getLat() {
        return lat;
    }

    // Setter Methods

    public void setLon(float lon) {
        this.lon = lon;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}

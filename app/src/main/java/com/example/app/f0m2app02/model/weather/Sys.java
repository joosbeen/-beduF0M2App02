package com.example.app.f0m2app02.model.weather;

public class Sys {
    private String country;
    private float sunrise;
    private float sunset;

    public Sys() {
    }

    public Sys(String country, float sunrise, float sunset) {
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }
// Getter Methods

    public String getCountry() {
        return country;
    }

    public float getSunrise() {
        return sunrise;
    }

    public float getSunset() {
        return sunset;
    }

    // Setter Methods

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSunrise(float sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(float sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "Sys{" +
                "country='" + country + '\'' +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }
}

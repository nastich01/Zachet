package com.example.fiztestsapp;

public class Car {
    private String marka;
    private String country;
    private int imgResource;
    private String capital;

    public Car(String logo, String country, int imgResource, String capital) {
        this.marka = logo;
        this.country = country;
        this.imgResource = imgResource;
        this.capital = capital;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}

package com.springapp.mvc;

import org.springframework.data.annotation.Id;

/**
 * Created by benny on 08.09.15.
 */
public class Vare {

    @Id
    private String id;

    private String navn;
    private double pris;

    public Vare(){}

    public Vare(String navn, double pris) {
        this.navn = navn;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

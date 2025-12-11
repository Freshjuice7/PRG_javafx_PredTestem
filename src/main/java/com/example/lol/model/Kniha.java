package com.example.lol.model;

public class Kniha {
    private String titul;
    private String autor;
    private int rokVydani;

    public Kniha(String titul, String autor, int rokVydani) {
        this.titul = titul;
        this.autor = autor;
        this.rokVydani = rokVydani;
    }

    public String getTitul() {
        return titul;
    }

    public void setTitul(String titul) {
        this.titul = titul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(int rokVydani) {
        this.rokVydani = rokVydani;
    }

    @Override
    public String toString() {

        return titul;
    }
}

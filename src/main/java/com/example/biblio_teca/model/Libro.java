package com.example.biblio_teca.model;

public class Libro {
    private int id;
    private String title;
    private  String autor;


public Libro (){
}

public Libro(int id, String title, String autor){
    this.id = id;
    this.title = title;                                                 //Declaramos las variables mejor
    this.autor = autor;
}
    public int getNumeroLibro() {
        return id;
    }

    public void setNumeroLibro(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return title;
    }

    public void setTitulo(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Número: " + id + " | Título: " + title + " | Autor: " + autor;
    }
}
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
}
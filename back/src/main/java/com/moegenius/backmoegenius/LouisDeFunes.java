package com.moegenius.backmoegenius;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="louisdefunes")
public class LouisDeFunes {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String citation;
    private String film;
    
    public LouisDeFunes(){

    }

    public void setCitation (String citation){
        this.citation = citation;
    }

    public String getCitation (){
        return this.citation;
    }

    public void setFilm(String film){
        this.film = film;
    }

    public String getFilm(){
        return this.film;
    }


}

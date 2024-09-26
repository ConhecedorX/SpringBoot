package com.github.conhecedorx.springtrap.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.conhecedorx.springtrap.enums.Genero;
import jakarta.persistence.*;
import lombok.Data;

@Entity (name = "games")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    private String nomeJogo;
    private double nota;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    private String player;

    public Game(long id, String nomeJogo, double nota, Genero genero, String player) {
        this.id = id;
        this.nomeJogo = nomeJogo;
        this.nota = nota;
        this.genero = genero;
        this.player = player;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Game() {

    }
}

// Game game = new Game(id = 1, nomeJogo = "CrashBandicoot", nota = 8.6, genero = "RPG" , player = "Lucas" );
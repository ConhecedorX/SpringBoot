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
}

// Game game = new Game(id = 1, nomeJogo = "CrashBandicoot", nota = 8.6, genero = "RPG" , player = "Lucas" );
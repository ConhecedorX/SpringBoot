package com.github.conhecedorx.springtrap.controllers;

import com.github.conhecedorx.springtrap.models.Game;
import com.github.conhecedorx.springtrap.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Game")
public class GameController {
    @Autowired
    GameServices service;

    @GetMapping
    public List<Game> getGameList() {
        return service.getGameList();
    }
    @GetMapping("/{id}")
    public Game getGameId(@PathVariable Long id) {
        return service.getGameId(id);
    }
    @DeleteMapping("/{id}")
    public void deleteGameById (@PathVariable long id) {
        service.deleteById(id);
    }
    @PostMapping
    public Game addGameById(@RequestBody Game genero) {
        return service.addGameById(genero);
    }
}

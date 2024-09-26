package com.github.conhecedorx.springtrap.services;

import com.github.conhecedorx.springtrap.models.Game;
import com.github.conhecedorx.springtrap.repositories.GamesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServices {
    @Autowired
    GamesRepositories repository;

    public List<Game> getGameList() {
        return repository.findAll();
    }
    public Game getGameId(Long id) {
        return repository.getReferenceById(id);
    }
    public void deleteById (long id) {
        repository.deleteById(id);
    }
    public Game addGameById(Game genero) {
        return repository.save(genero);
    }
}
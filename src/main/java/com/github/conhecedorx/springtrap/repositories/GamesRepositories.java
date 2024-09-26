package com.github.conhecedorx.springtrap.repositories;

import com.github.conhecedorx.springtrap.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GamesRepositories extends JpaRepository <Game, Long> {

}

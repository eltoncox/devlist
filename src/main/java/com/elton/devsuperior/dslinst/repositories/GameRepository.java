package com.elton.devsuperior.dslinst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elton.devsuperior.dslinst.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

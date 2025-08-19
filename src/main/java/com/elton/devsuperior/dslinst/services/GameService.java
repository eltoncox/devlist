package com.elton.devsuperior.dslinst.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elton.devsuperior.dslinst.dto.GameMinDTO;
import com.elton.devsuperior.dslinst.entities.Game;
import com.elton.devsuperior.dslinst.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){		
		var result = gameRepository.findAll();		
		return result.stream().map(x -> new GameMinDTO(x)).toList();	
	}

}

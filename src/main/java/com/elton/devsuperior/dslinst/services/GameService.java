package com.elton.devsuperior.dslinst.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elton.devsuperior.dslinst.dto.GameDTO;
import com.elton.devsuperior.dslinst.dto.GameMinDTO;
import com.elton.devsuperior.dslinst.entities.Game;
import com.elton.devsuperior.dslinst.projections.GameMinProjection;
import com.elton.devsuperior.dslinst.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;	
	
	@Transactional(readOnly = true) // nao vou fazer nenhuma operação de escrita
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);		 
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){		
		var result = gameRepository.findAll();		
		return result.stream().map(x -> new GameMinDTO(x)).toList();	
	} // searchByList
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){		
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();	
	}
	

}

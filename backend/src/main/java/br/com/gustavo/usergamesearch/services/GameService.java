package br.com.gustavo.usergamesearch.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.gustavo.usergamesearch.dto.GameDTO;
import br.com.gustavo.usergamesearch.entities.Game;
import br.com.gustavo.usergamesearch.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)//avoiding locking in database because is just a simple read.
	public List<GameDTO> findAll() {
		List<Game> list = gameRepository.findAll();
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}

}

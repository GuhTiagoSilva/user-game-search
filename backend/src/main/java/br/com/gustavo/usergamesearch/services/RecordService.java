package br.com.gustavo.usergamesearch.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.gustavo.usergamesearch.dto.RecordDTO;
import br.com.gustavo.usergamesearch.dto.RecordInsertDTO;
import br.com.gustavo.usergamesearch.entities.Game;
import br.com.gustavo.usergamesearch.entities.Record;
import br.com.gustavo.usergamesearch.repositories.GameRepository;
import br.com.gustavo.usergamesearch.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository recordRepository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());

		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);

		entity = recordRepository.save(entity);

		return new RecordDTO(entity);

	}

}

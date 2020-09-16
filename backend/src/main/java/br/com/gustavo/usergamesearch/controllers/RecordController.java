package br.com.gustavo.usergamesearch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavo.usergamesearch.dto.RecordDTO;
import br.com.gustavo.usergamesearch.dto.RecordInsertDTO;
import br.com.gustavo.usergamesearch.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordController {

	@Autowired
	private RecordService recordService;
	
	@PostMapping
	public ResponseEntity<RecordDTO>insert(@RequestBody RecordInsertDTO recordInsertDTO){
		RecordDTO recordDTO = recordService.insert(recordInsertDTO);
		return ResponseEntity.ok().body(recordDTO);
	}
	
	
	
}

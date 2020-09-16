package br.com.gustavo.usergamesearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustavo.usergamesearch.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}

package br.com.gustavo.usergamesearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavo.usergamesearch.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}

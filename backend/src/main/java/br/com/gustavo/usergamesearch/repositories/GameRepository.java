package br.com.gustavo.usergamesearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavo.usergamesearch.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}

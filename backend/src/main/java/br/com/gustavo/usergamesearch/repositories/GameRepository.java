package br.com.gustavo.usergamesearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustavo.usergamesearch.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

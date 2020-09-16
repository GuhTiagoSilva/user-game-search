package br.com.gustavo.usergamesearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustavo.usergamesearch.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}

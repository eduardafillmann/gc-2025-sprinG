package com.duda.fillmann.repository;

import com.duda.fillmann.entities.TipoPokemon;
import com.duda.fillmann.exceptions.TipoPokemonException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<TipoPokemonException, Long> {
}

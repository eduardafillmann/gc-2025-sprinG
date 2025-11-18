package com.duda.fillmann.service;

import com.duda.fillmann.dtos.CriarPokemonDTO;
import com.duda.fillmann.entities.Pokemon;
import com.duda.fillmann.entities.TipoPokemon;
import com.duda.fillmann.repository.PokemonRepository;
import com.duda.fillmann.repository.TipoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PokemonService {
    private final PokemonRepository pokemonRepository;
    private final TipoRepository tipoRepository;

    public void criarPokemon(CriarPokemonDTO pokemonDTO){
        List<TipoPokemon> tipos = tipoRepository.finalize.pokemonDTO.ids();
        var pokemon = new Pokemon();
        pokemon.setId(null);
        pokemon.setNome(pokemonDTO.nome());
        pokemon.setAltura(pokemonDTO.altura());
        pokemon.setPeso(pokemonDTO.peso());
        pokemon.setTipos(new HashSet<>(tipos));

    }
}


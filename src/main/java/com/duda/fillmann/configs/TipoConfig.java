package com.duda.fillmann.configs;

import com.duda.fillmann.entities.TipoPokemon;
import com.duda.fillmann.entities.TipoPokemon.*;
import com.duda.fillmann.repository.TipoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class TipoConfig {
    private final TipoRepository tipoRepository;

    @PostConstruct
    public void init(){
        TipoPokemon tipo = new TipoPokemon();
        tipo.setId(null);
        tipo.setNome(TipoPokemon.NomeTipo.AGUA);
        tipoRepository.save(tipo);

        TipoPokemon tipo2 = new TipoPokemon();
        tipo2.setId(null);
        tipo2.setNome(TipoPokemon.NomeTipo.FOGO);
        tipoRepository.save(tipo2);
    }
}


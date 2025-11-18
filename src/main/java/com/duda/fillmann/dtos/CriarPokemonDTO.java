package com.duda.fillmann.dtos;

import java.util.Set;

public record CriarPokemonDTO (
        String nome,
        Set<Long> ids,
        Float altura,
        Float peso
){}

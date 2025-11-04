package com.duda.fillmann.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class TipoPokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private NomeTipo nome;

    private Set<Pokemon> pokemons;




    enum NomeTipo{
        AGUA,
        VENENOSO,
        FOGO
    }
}

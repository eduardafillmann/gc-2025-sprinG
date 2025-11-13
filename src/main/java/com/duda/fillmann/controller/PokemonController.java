package com.duda.fillmann.controller;
import com.duda.fillmann.entities.TipoPokemon;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Setter
@Getter
@Entity
public class PokemonController {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="tipo_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private NomeTipo nome;

    @ManyToMany(mappedBy="tipo")
    private Set<TipoPokemon> pokemonTipo = new HashSet<>();

    enum NomeTipo{
        AGUA,
        VENENOSO,
        FOGO,
        GELO;
    }

    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        com.duda.fillmann.entities.TipoPokemon tipo = (com.duda.fillmann.entities.TipoPokemon) o;
        return Objects.equals(id, tipo.getPokemonTipo());
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
}

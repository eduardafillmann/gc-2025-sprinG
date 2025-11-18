package com.duda.fillmann.entities;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import jakarta.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity
public class TipoPokemon {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="tipo_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private NomeTipo nome;

    @ManyToMany(mappedBy="tipo")
    private Set<Pokemon> pokemonTipo = new HashSet<>();

    public enum NomeTipo{
        AGUA,
        VENENOSO,
        FOGO,
        GELO;
    }

    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        TipoPokemon tipo = (TipoPokemon) o;
        return Objects.equals(id, tipo.id);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
}
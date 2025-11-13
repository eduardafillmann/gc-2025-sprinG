package com.duda.fillmann.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name= "tabela_pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pokemon_id")
    private Long id;
    private String nome;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name= "tipo_pokemon",
            joinColumns = @JoinColumn(name= "pokemon_id"),
            inverseJoinColumns = @JoinColumn(name= "tipo_id")
    )
    private Set<TipoPokemon> tipo = new HashSet<>();
    //como sao muitos tipos, precisa ser colecao, se nao poderia ser só private TipoPokemon
    private Float altura;
    private Float peso;

    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }

}



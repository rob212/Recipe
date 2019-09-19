package com.woita.recipe.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author mcbrydr on 13/09/19
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToOne(fetch = FetchType.EAGER)
    private Ingredient ingredient;

}

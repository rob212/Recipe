package com.woita.recipe.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author mcbrydr on 13/09/19
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure unm;

    @ManyToOne
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure unm) {
        this.description = description;
        this.amount = amount;
        this.unm = unm;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure unm, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.unm = unm;
        this.recipe = recipe;
    }

}

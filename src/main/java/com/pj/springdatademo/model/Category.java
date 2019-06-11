package com.pj.springdatademo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "category")
@NamedStoredProcedureQuery(name = "getAllCategoriesThroughStoredProcedure",procedureName = "get_all_categories",resultClasses = Category.class)
public class Category implements Serializable
{
    private static final long serialVersionUID = -6699422774799518217L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;
}

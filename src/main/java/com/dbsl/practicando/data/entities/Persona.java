package com.dbsl.practicando.data.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 Es una clase que representa una tabla en una base de datos relacional.
 La entidad es utilizada para mapear los datos almacenados en la base de datos con objetos Java.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Persona {
    @Id
    @Column(name = "id_persona")
    private int id;
    @Column(name = "nombre", length = 100)
    private String nombre;
}

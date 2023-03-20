package com.dbsl.practicando.web.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/*
@Builder es una anotación de Lombok que se utiliza para generar un constructor
que utiliza el patrón de diseño de Builder. Este patrón es útil cuando tenemos un objeto
con muchos campos y queremos crear instancias de ese objeto de una manera más legible y fácil de mantener.
Un DTO (Data Transfer Object) es un objeto que se utiliza para transferir datos entre capas o componentes
de una aplicación. Es una clase que encapsula los datos y proporciona una representación
estructurada de los mismos, que puede ser transportada de manera eficiente a
través de la red o entre componentes de una aplicación.

Un DTO se utiliza típicamente en una arquitectura de capas,
donde tenemos una capa de presentación (UI), una capa de servicio y una capa de persistencia.
En esta arquitectura, la capa de presentación no debería conocer los detalles
de la capa de persistencia y viceversa. En cambio, se utiliza un
DTO para transferir datos entre estas capas de manera estructurada y eficiente.

El DTO suele contener campos correspondientes a los datos que se van a transferir
y sus correspondientes getters y setters. A menudo, también puede contener métodos
adicionales para realizar operaciones específicas relacionadas con los datos.

En resumen, un DTO es una clase que se utiliza para transferir datos entre
componentes de una aplicación de manera estructurada y eficiente,
con el objetivo de separar las capas y mejorar la mantenibilidad y escalabilidad de la aplicación.
*/
@Builder
@Getter
@Setter
public class PersonDto implements Serializable {
    private int idPersonDTO;
    private String name;
}

package com.dbsl.practicando.web.rest;

import com.dbsl.practicando.service.impls.PersonServiceImpl;
import com.dbsl.practicando.web.dtos.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
un "Controller REST" es un tipo específico de controlador que se utiliza en el diseño de servicios web RESTful.
Los servicios web RESTful se basan en el protocolo HTTP y utilizan los verbos HTTP (GET, POST, PUT, DELETE, etc.)
para definir las operaciones que se pueden realizar en los recursos que ofrece el servicio.
El Controlador REST debe procesar la solicitud y devolver los datos correspondientes
en el formato de intercambio de datos adecuado, como JSON o XML en el contexto de una API RESTfull.
Esto permite que las aplicaciones se comuniquen entre sí de manera eficiente y estandarizada,
lo que facilita la integración y la escalabilidad de los sistemas.
*/
@RestController
@RequestMapping("/api/personas")
public class PersonRestController {
    private PersonServiceImpl personService;
    @Autowired
    public PersonRestController(PersonServiceImpl personService) {
        this.personService = personService;
    }
    @GetMapping()
    public List<PersonDto> llamarPersonas(){
        return personService.listarPersonas();
    }
}

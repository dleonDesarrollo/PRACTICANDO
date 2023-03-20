package com.dbsl.practicando.web.controllers;

import com.dbsl.practicando.service.impls.PersonServiceImpl;
import com.dbsl.practicando.web.dtos.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
Un "Controller" es una clase en un patrón de arquitectura de software que se encarga de recibir
las solicitudes de los usuarios, procesarlas y enviar las respuestas correspondientes.
Es una parte importante en la construcción de aplicaciones web y móviles.
*/
@Controller
@RequestMapping("/")
public class PersonController {
    private PersonServiceImpl personService;

    private static final String VIEW_LIST_PERSON = "view-general/moduloPersonView";

    @Autowired
    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }
    @GetMapping("/modulo-personas")
    public String llamarVistaPersona(Model model){
        List<PersonDto> persons = personService.listarPersonas();
        model.addAttribute("personas", persons);
        return VIEW_LIST_PERSON;
    }
    @GetMapping("/inicio")
    public String llamarVistaIndex(Model model){
        return "view-general/index";
    }
}

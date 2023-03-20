package com.dbsl.practicando.service;

import com.dbsl.practicando.web.dtos.PersonDto;

import java.util.List;

public interface PersonService {
    PersonDto guardarPersona(PersonDto personDto);
    List<PersonDto> listarPersonas();
}

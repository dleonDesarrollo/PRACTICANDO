package com.dbsl.practicando.service.impls;

import com.dbsl.practicando.data.mappers.PersonaMapper;
import com.dbsl.practicando.data.repositories.PersonaRepository;
import com.dbsl.practicando.service.PersonService;
import com.dbsl.practicando.web.dtos.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/*
Al implementar servicios utilizando la interfaz "implements",
se asegura que su código esté siguiendo el principio de inversión de dependencia,
que es una práctica sólida de programación orientada a objetos.
También permite una fácil integración con otras clases y componentes de su aplicación.
Todo dependerá del alcance y complejidad de la aplicación.
Inversión de dependencias:
Este principio es importante porque ayuda a reducir la rigidez y la fragilidad del código
y facilita el mantenimiento y la evolución de la aplicación a largo plazo.
Al utilizar abstracciones en lugar de dependencias concretas,
se pueden cambiar las implementaciones de los módulos de nivel inferior
sin afectar a los módulos de nivel superior.

En el contexto de Spring Boot, el principio de inversión de dependencia
se aplica mediante la inyección de dependencias.
En lugar de instanciar directamente los objetos que necesita una clase,
Spring Boot permite inyectar las dependencias en la clase a través de la configuración de Spring,
utilizando abstracciones y separando la lógica del código de los detalles de implementación.

En resumen, el principio de inversión de dependencia es un principio fundamental de diseño de software
 que establece que las dependencias deben ser invertidas para reducir la rigidez y la fragilidad del código
 y facilitar el mantenimiento y la evolución de la aplicación a largo plazo.
 */
@Service
public class PersonServiceImpl implements PersonService {
    private final PersonaRepository personaRepository;
    private final PersonaMapper personaMapper;

    @Autowired
    public PersonServiceImpl(PersonaRepository personaRepository, PersonaMapper personaMapper) {
        this.personaRepository = personaRepository;
        this.personaMapper = personaMapper;
    }
    @Override
    public PersonDto guardarPersona(PersonDto personDto) {
        return personaMapper.personaToPersonDTO(personaRepository.save(personaMapper.personDTOToPersona(personDto)));
    }
    @Override
    public List<PersonDto> listarPersonas() {
        List<PersonDto> personDtoList = personaRepository
                .findAll()
                .stream()
                .map(personaMapper::personaToPersonDTO)
                .collect(Collectors.toList());
        return personDtoList;
    }

}

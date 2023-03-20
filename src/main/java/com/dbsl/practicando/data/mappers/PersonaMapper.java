package com.dbsl.practicando.data.mappers;

import com.dbsl.practicando.data.entities.Persona;
import com.dbsl.practicando.web.dtos.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/*
 Componente que se utiliza para convertir o mapear datos de un formato o estructura a otro.
 una herramienta importante en el desarrollo de software para convertir
 datos de un formato o estructura a otro. Esto ayuda a mantener el código más organizado y fácil de mantener.
*/

@Mapper(componentModel = "spring", uses = {Persona.class})
public interface PersonaMapper {
    @Mappings({
            @Mapping(source = "id",target = "idPersonDTO"),
            @Mapping(source = "nombre",target = "name")
    })
    PersonDto personaToPersonDTO(Persona persona);
    Persona personDTOToPersona(PersonDto personDto);
}

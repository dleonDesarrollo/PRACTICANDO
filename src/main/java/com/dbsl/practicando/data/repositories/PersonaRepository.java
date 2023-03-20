package com.dbsl.practicando.data.repositories;

import com.dbsl.practicando.data.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*La idea detrás de la interfaz DAO es que la lógica de negocio de la aplicación no necesita
  conocer los detalles de cómo se accede a los datos. En su lugar, la lógica de negocio
  puede trabajar con una interfaz común y delegar el acceso a los datos a una clase que
  implementa la interfaz DAO.
  Esto hace que el código sea más modular y más fácil de mantener,
  ya que los cambios en la fuente de datos no afectarán directamente a la lógica de negocio.*/
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {
    /*
        Aquí podemos agregar métodos que jpaRepository no provee, pero podemos utilizar palabras claves
        que nos provee Spring Data JPA, por ejemplo:

        -And: utilizada para concatenar dos o más condiciones en una consulta, por ejemplo: findByNombreAndPrecio.

        -Or: utilizada para especificar que se busquen registros que cumplan una condición o la otra,
        por ejemplo: findByNombreOrDescripcion.

        -Equals: utilizada para buscar registros con un valor exacto en un atributo, por ejemplo: findByNombreEquals.

        -GreaterThan: utilizada para buscar registros con un valor mayor que el especificado en un atributo,
        por ejemplo: findByPrecioGreaterThan.

        -Like: utilizada para buscar registros que contengan un valor especificado en un atributo,
        por ejemplo: findByNombreLike.

        -OrderBy: utilizada para especificar la ordenación de los resultados de una consulta,
        por ejemplo: findByNombreOrderByPrecioDesc.
    */
}

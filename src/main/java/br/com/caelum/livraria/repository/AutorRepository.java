package br.com.caelum.livraria.repository;

import br.com.caelum.livraria.model.Autor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nando on 24/03/17.
 */
public interface AutorRepository extends CrudRepository<Autor, Long> {
}

package br.com.caelum.livraria;

import br.com.caelum.livraria.model.Autor;
import br.com.caelum.livraria.model.Livro;
import br.com.caelum.livraria.repository.AutorRepository;
import br.com.caelum.livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

/**
 * Created by nando on 24/03/17.
 */
@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



    @Autowired
    private LivroRepository bookRepository;

    @Autowired
    private AutorRepository authorRepository;

    @PostConstruct
    @Transactional
    public void onLoad(){

        Autor alberto = new Autor();
        alberto.setNome("Alberto");
        authorRepository.save(alberto);

        Livro book = new Livro();
        book.setTitulo("Spring MVC");
        book.setSumario("Domine o principal framework web Java");
        book.setNumeroDePaginas(237);

        book.add(alberto);

        bookRepository.save(book);

    }
}

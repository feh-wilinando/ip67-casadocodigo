package br.com.caelum.livraria.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nando on 24/03/17.
 */
@Entity
public class Livro {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String sumario;

    @Min(50)
    private Integer numeroDePaginas;

    @Valid
    @ManyToMany(fetch= FetchType.EAGER)
    private Set<Autor> autores = new HashSet<>();

    public void add(Autor author) {
        autores.add(author);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSumario() {
        return sumario;
    }

    public void setSumario(String sumario) {
        this.sumario = sumario;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
}

package org.example.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "libros") // Nombre de la tabla en plural
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;

    // Constructor vacío (obligatorio para JPA/Hibernate)
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters y Setters corregidos
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

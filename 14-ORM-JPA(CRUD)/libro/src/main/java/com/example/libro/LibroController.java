package com.example.libro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    // Redirige la raíz a la lista de libros
    @GetMapping("/")
    public String index() {
        return "redirect:/libros";
    }

    @GetMapping("/libros")
    public String listarLibros(Model model) {
        List<Libro> libros = libroRepository.findAll();
        model.addAttribute("libros", libros);
        return "lista-libros";
    }

    @GetMapping("/libros/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("libro", new Libro());
        return "formulario-libro";
    }

    @PostMapping("/libros/guardar")
    public String guardarLibro(@ModelAttribute Libro libro) {
        libroRepository.save(libro);
        return "redirect:/libros";
    }
}

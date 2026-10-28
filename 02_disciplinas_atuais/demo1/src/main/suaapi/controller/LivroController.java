package com.suaapi.controller;

import com.suaapi.model.Livro;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final List<Livro> livros = new ArrayList<>();

    public LivroController() {
        livros.add(new Livro(1, "Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro(2, "O Cortiço", "Aluísio Azevedo", 1890));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Livro> listar() {
        return livros;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Livro cadastrar(@RequestBody Livro livro) {
        livro.setId(livros.size() + 1); // simula a geração do ID
        livros.add(livro);
        return livro;
    }
}

package com.example.flyway.controller;

import com.example.flyway.model.Autor;
import com.example.flyway.service.AutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping("/add")
    public ResponseEntity<Autor> addAutor(@RequestBody Autor autor) {
        Autor newAutor = autorService.addAutor(autor);
        return new ResponseEntity<>(newAutor, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Autor>> findAll() {
        List<Autor> autores = autorService.findAll();
        return new ResponseEntity<>(autores, HttpStatus.OK);
    }
}

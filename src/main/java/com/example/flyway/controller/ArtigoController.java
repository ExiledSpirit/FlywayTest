package com.example.flyway.controller;

import com.example.flyway.model.Artigo;
import com.example.flyway.service.ArtigoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artigo")
public class ArtigoController {
    private final ArtigoService artigoService;

    public ArtigoController(ArtigoService artigoService) {
        this.artigoService = artigoService;
    }

    @PostMapping("/add")
    public ResponseEntity<Artigo> addArtigo(Artigo artigo) {
        Artigo newArtigo = artigoService.addArtigo(artigo);
        return new ResponseEntity<>(newArtigo, HttpStatus.CREATED);
    }

    @PutMapping("/{artigoId}/autor/{autorId}")
    public ResponseEntity<Artigo> addAutor(
            @PathVariable Long artigoId,
            @PathVariable Long autorId
    ) {
        Artigo artigo = artigoService.addAutor(artigoId, autorId);
        return new ResponseEntity<>(artigo, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Artigo>> findAll() {
        List<Artigo> artigos = artigoService.findAll();
        return new ResponseEntity<>(artigos, HttpStatus.OK);
    }
}

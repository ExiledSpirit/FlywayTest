package com.example.flyway.service;

import com.example.flyway.exception.idNotFoundException;
import com.example.flyway.model.Artigo;
import com.example.flyway.model.Autor;
import com.example.flyway.repository.ArtigoRepository;
import com.example.flyway.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtigoService {
    private final ArtigoRepository artigoRepository;
    private final AutorRepository autorRepository;

    public ArtigoService(ArtigoRepository artigoRepository, AutorRepository autorRepository) {
        this.artigoRepository = artigoRepository;
        this.autorRepository = autorRepository;
    }

    public Artigo addAutor(Long artigoId, Long autorId) {
        Artigo artigo= artigoRepository.findById(artigoId)
                .orElseThrow(() -> new idNotFoundException("Id " + artigoId + " was not found"));
        Autor autor= autorRepository.findById(autorId)
                .orElseThrow(() -> new idNotFoundException("Id " + autorId + " was not found"));
        artigo.setAutor(autor);
        return artigoRepository.save(artigo);
    }

    public Artigo addArtigo(Artigo artigo) {
        return artigoRepository.save(artigo);
    }

    public List<Artigo> findAll() {
        return artigoRepository.findAll();
    }

    public Artigo findById(Long id) {
        return artigoRepository.findById(id)
                .orElseThrow(() -> new idNotFoundException("Id " + id + " was not found"));
    }

    public void deleteArtigo(Long id) {
        artigoRepository.deleteById(id);
    }

    public Artigo updateArtigo(Artigo artigo) {
        return artigoRepository.save(artigo);
    }
}

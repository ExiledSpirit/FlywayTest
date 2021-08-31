package com.example.flyway.service;

import com.example.flyway.exception.idNotFoundException;
import com.example.flyway.model.Autor;
import com.example.flyway.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor addAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Autor findById(Long id) {
        return autorRepository.findById(id)
                .orElseThrow(() -> new idNotFoundException("Id " + id + " was not found"));
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }

    public Autor updateAutor(Autor autor) {
        return autorRepository.save(autor);
    }


}

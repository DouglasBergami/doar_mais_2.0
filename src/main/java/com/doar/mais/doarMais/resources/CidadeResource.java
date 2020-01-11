package com.doar.mais.doarMais.resources;

import com.doar.mais.doarMais.domains.Cidade;
import com.doar.mais.doarMais.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {

    @Autowired
    CidadeService cidadeService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cidade> find(@PathVariable Long id) {

        Cidade obj = cidadeService.findById(id);

        return ResponseEntity.ok().body(obj);
    }
}

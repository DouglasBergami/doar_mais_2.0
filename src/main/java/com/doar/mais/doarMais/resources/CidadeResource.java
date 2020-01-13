package com.doar.mais.doarMais.resources;

import com.doar.mais.doarMais.domains.Cidade;
import com.doar.mais.doarMais.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import javax.xml.ws.Response;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {

    @Autowired
    CidadeService cidadeService;

    @GetMapping()
    public ResponseEntity<List<Cidade>> findAll(){

        List<Cidade> obj = cidadeService.findAll();

        return ResponseEntity.ok().body(obj);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cidade> find(@PathVariable Long id) {

        Cidade obj = cidadeService.findById(id);

        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        cidadeService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@Valid @RequestBody Cidade cidade){
        Cidade obj = cidadeService.update(cidade);
        return ResponseEntity.noContent().build();
    }

    @PostMapping()
    public ResponseEntity<Void> insert(@Valid @RequestBody Cidade cidade){
        Cidade obj = cidadeService.insert(cidade);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

}

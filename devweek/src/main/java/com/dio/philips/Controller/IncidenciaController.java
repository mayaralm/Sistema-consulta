package com.dio.philips.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.philips.Entity.IncidenciaExame;
import com.dio.philips.Repository.IncidenciaRepository;

@RestController
@RequestMapping("/incidencias")
public class IncidenciaController {
	
	private final IncidenciaRepository repository;

    public IncidenciaController(IncidenciaRepository repository) {
        this.repository = repository;
    }

    
    @GetMapping
    public ResponseEntity<List<IncidenciaExame>> findOcorrencias(){
        List<IncidenciaExame> listaIncidencia = repository.findAll();
        if (listaIncidencia.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return new ResponseEntity<>(listaIncidencia, HttpStatus.OK);
    }

    @GetMapping("/ocorrencia/{id}")
    public ResponseEntity<IncidenciaExame> findOcorrenciasById(@PathVariable Long id){
        Optional<IncidenciaExame> incidenciaOptional = repository.findById(id);
        if (incidenciaOptional.isPresent()){
            IncidenciaExame incidenciaUnid = incidenciaOptional.get();
            return new ResponseEntity<>(incidenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

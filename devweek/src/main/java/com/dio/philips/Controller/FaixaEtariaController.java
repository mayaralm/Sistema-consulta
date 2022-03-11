package com.dio.philips.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.philips.Entity.FaixaEtaria;
import com.dio.philips.Repository.FaixaEtariaRepository;

@RestController
@RequestMapping("/faixaetaria")
public class FaixaEtariaController {

	private final FaixaEtariaRepository repository;

    public FaixaEtariaController(FaixaEtariaRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    public ResponseEntity<?> findAllFaixaEtaria(){
        try{
           List<FaixaEtaria> lista = repository.findAll();
           return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<FaixaEtaria> findByIdFaixaEtaria(@PathVariable Long id){
        try{
            Optional<FaixaEtaria> unidOptional = repository.findById(id);
            if (unidOptional.isPresent()){
                FaixaEtaria faixaEtariaUnid = unidOptional.get();
                return new ResponseEntity<>(faixaEtariaUnid, HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/novo")
    public FaixaEtaria newFaixaEtaria(@RequestBody FaixaEtaria newFaixa){
        return repository.save(newFaixa);
    }

    @DeleteMapping("/remover/{id}")
    public void deleteFaixaEtaria(@PathVariable long id){
        repository.deleteById(id);
    }

}

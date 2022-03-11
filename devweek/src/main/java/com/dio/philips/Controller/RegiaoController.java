package com.dio.philips.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.philips.Entity.Regiao;
import com.dio.philips.Repository.RegiaoRepository;

@RestController
@RequestMapping("/regioes")
public class RegiaoController {

	private final RegiaoRepository repository;

	public RegiaoController(RegiaoRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public ResponseEntity<?> findAllRegioes() {
		try {
			List<Regiao> allRegioes = repository.findAll();
			System.out.println("Achou");
			if (allRegioes.isEmpty())
				System.out.println("Vazia");
			return new ResponseEntity<>(allRegioes, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	 @GetMapping("/{id}")
	    public ResponseEntity<Regiao> findRegioesById(@PathVariable Long id){
	        Optional<Regiao> regiaoOptional = repository.findById(id);
	        if (regiaoOptional.isPresent()){
	            Regiao regiaoUnid = regiaoOptional.get();
	            return new ResponseEntity<>(regiaoUnid, HttpStatus.OK);
	        }
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

}

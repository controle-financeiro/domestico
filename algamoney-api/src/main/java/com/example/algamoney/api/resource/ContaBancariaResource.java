package com.example.algamoney.api.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.algamoney.api.model.ContaBancaria;
import com.example.algamoney.api.repository.ContaBancariaRepository;

@RestController
@RequestMapping("/contabancaria")
public class ContaBancariaResource {

	@Autowired
	private ContaBancariaRepository contaBancariaRepository; 
	
	@GetMapping
	public List<ContaBancaria> listar(){
	    return contaBancariaRepository.findAll();	
	}
	
	
	
@PostMapping
public ResponseEntity<ContaBancaria> criar(@RequestBody ContaBancaria contaBancaria, HttpServletResponse response) {
	ContaBancaria contaBancariaSalva = contaBancariaRepository.save(contaBancaria);
	
	URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{idContaBancaria}")
			.buildAndExpand(contaBancariaSalva.getIdContaBancaria()).toUri();
	response.setHeader("Location", uri.toASCIIString());
	
	return ResponseEntity.created(uri).body(contaBancariaSalva);
	
}

@GetMapping("/{idContaBanaria}")
public ContaBancaria bucarPeloId(@PathVariable Long idContaBanaria) {
	return contaBancariaRepository.findOne(idContaBanaria);
	

	
}

	
	
	
	
	
	
	/*
	@GetMapping("/{idContaBancaria}")
	public ResponseEntity<ContaBancaria> buscarPeloCodigo(@PathVariable Long idContaBancaria) {
		ContaBancaria contaBancaria = ContaBancariaRepository.findOne(idContaBancaria);
		 return contaBancaria != null ? ResponseEntity.ok(contaBancaria) : ResponseEntity.notFound().build();
	}
	*/
}

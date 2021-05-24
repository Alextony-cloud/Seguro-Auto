package br.com.seguroauto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.seguroauto.Services.CadastroService;
import br.com.seguroauto.entities.Cadastro;

/**
 * Classe Controller responsável pelos endpoints e requisições web
 * @author Alextony Rodrigues Teixeira
 * @version 1.0
 */

@RestController
@RequestMapping(value = "/cadastros")
public class CadastroResource {
	
	@Autowired
	private CadastroService service;
	
	/** Método responsável por retornar uma requisição HTTP do tipo get 
	 * para buscar todos usuários
	 * @param Cadastro 
	 * @return list
	 */
	@GetMapping
	public ResponseEntity<Iterable<Cadastro>> findAll() {
		Iterable<Cadastro> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	

}

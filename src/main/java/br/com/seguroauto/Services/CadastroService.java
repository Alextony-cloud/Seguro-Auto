package br.com.seguroauto.Services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.seguroauto.Repositories.CadastroRepository;
import br.com.seguroauto.entities.Cadastro;

/**Classe responsável pela regra de negócio
 * @author Alextony Rodrigues Teixeira
 * @version 1.0
 */

@Service
public class CadastroService {
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	public Iterable<Cadastro> findAll() {
	return cadastroRepository.findAll();
		
	}
	
	public Optional<Cadastro> findById(Long id) {
		return cadastroRepository.findById(id);
	}
	
	

}

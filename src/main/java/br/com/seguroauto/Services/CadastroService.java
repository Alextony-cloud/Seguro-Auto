package br.com.seguroauto.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.seguroauto.Repositories.CadastroRepository;
import br.com.seguroauto.Services.exceptions.ResourceNotFoundException;
import br.com.seguroauto.entities.Cadastro;
import br.com.seguroauto.resources.exceptions.DataBaseException;

/**
 * Classe responsável pela regra de negócio
 * 
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

	public Cadastro findById(Long id) {
		Optional<Cadastro> obj = cadastroRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Cadastro insert(Cadastro cad) {
		return cadastroRepository.save(cad);
	}

	public void delete(Long id) {
		try {
			cadastroRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}
}

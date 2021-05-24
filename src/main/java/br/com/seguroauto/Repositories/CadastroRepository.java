package br.com.seguroauto.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.seguroauto.entities.Cadastro;

@Repository
public interface CadastroRepository  extends CrudRepository<Cadastro, Long>{

}
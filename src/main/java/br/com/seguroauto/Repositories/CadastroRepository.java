package br.com.seguroauto.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.seguroauto.entities.Cadastro;
/**
 * interface responsável por extender os métodos CRUD pré definidos para cadastro
 * @author Alextony Rodrigues
 *
 */
@Repository
public interface CadastroRepository  extends CrudRepository<Cadastro, Long>{

}
package br.com.seguroauto.configuration;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.seguroauto.Repositories.CadastroRepository;
import br.com.seguroauto.entities.Cadastro;


/**Classe para testes em memoria através do h2
 * @author Alextony Rodrigues
 *@version 1.0
 *@since release 01 da aplicação
 */

@Configuration
public class Config implements CommandLineRunner{

	@Autowired
	private CadastroRepository cadastroRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		cadastroRepository.deleteAll();
		
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		Cadastro c1 =  new Cadastro(null, "02089425480", "J", dataFormatada.parse("24/05/2021"));
		
		cadastroRepository.save(c1);
		
		

	
		
	}

}

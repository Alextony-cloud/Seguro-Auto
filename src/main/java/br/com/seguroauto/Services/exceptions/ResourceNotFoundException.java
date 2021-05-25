package br.com.seguroauto.Services.exceptions;

/** Classe responsável  por lançar exceção na camada service
 * caso id não seja localizado
 * @author Alextony Rodrigues Teixeira
 */
public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}

	
}

package br.com.seguroauto.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.seguroauto.Services.exceptions.ResourceNotFoundException;

/**Classe responsável pelo tratamento de exceções na camada resource
 * @author Alextony Rodrigues Teixeira
 *
 */

@ControllerAdvice
public class ResourceExceptionHandler {
	
	/** Metodo responsável por retornar código de status de resposta HTTP "404 NOT FOUND"
	 * @param ResourceNotFoundException e
	 * @param HttpServletRequest request
	 * @return standardError err
	 */
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}

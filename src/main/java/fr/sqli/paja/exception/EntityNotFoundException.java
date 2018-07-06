package fr.sqli.paja.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Si cette exception est levée, le code status retourné sera 412
@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class EntityNotFoundException extends RuntimeException {
	
	public EntityNotFoundException() {
		super("Identifiant introuvable.");
	}
	
	public EntityNotFoundException(String message) {
		super(message);
	}
	
	public EntityNotFoundException(Throwable throwable) {
		super(throwable);
	}
}

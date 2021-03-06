package telran.ashkelon2018.mishpahug.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EmptyProfileException extends RuntimeException {

	int code;
	String message;
	
	public EmptyProfileException() {
		this.code = 409;
		this.message= "User has empty profile!";
	}

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

}
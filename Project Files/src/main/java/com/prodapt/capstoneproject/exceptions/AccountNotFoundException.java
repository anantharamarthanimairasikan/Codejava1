package com.prodapt.capstoneproject.exceptions;

public class AccountNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public AccountNotFoundException() {
		super();

	}

	public AccountNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccountNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountNotFoundException(String message) {
		super(message);
	}

	public AccountNotFoundException(Throwable cause) {
		super(cause);
	}
	
}

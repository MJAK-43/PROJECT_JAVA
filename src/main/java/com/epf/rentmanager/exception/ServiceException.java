package com.epf.rentmanager.exception;

public class ServiceException extends Exception {

	public ServiceException() {
		super("Erreur dans la couche service");
	}
}

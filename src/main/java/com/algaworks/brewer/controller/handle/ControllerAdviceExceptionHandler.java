package com.algaworks.brewer.controller.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;

import com.algaworks.brewer.service.exception.NomeEstiloJaCadastradoException;

@ControllerAdvice
class ControllerAdviceExceptionHandler {

	public void handlerNomeEstiloJaCadastradoException(NomeEstiloJaCadastradoException e) {
		
	}
	
}

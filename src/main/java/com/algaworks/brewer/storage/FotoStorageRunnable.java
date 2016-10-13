package com.algaworks.brewer.storage;

import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

import com.algaworks.brewer.dto.FotoDTO;

public class FotoStorageRunnable implements Runnable {

	private MultipartFile[] files;
	private DeferredResult<FotoDTO> resultado;
	private FotoStorage fotoStorage;

	public FotoStorageRunnable(MultipartFile[] files, DeferredResult<FotoDTO> resultado, FotoStorage fotoStorage) {
		super();
		this.files = files;
		this.resultado = resultado;
		this.fotoStorage = fotoStorage;
	}

	@Override
	public void run() {
		//TODO: Salvar a foto no sistema de arquivos [TEMPORARIO] e retorno novo nome		
		String nomeFoto = this.fotoStorage.salvarTemporariamente(files);
		String contentType = files[0].getContentType();
		
		resultado.setResult(new FotoDTO(nomeFoto, contentType));
	}

}

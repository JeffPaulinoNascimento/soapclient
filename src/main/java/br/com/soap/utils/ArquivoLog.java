package br.com.soap.utils;

import br.com.caelum.vraptor.observer.upload.UploadedFile;

import java.io.File;
import java.io.IOException;

public class ArquivoLog {

    public void uploadDeLog(UploadedFile log) throws IOException {
        if(log != null) {
            File uploadFile = new File("C:\\Users\\Jefferson\\Documents\\Intelij\\Workspace\\logProject\\src\\main\\resources\\arquivoLog\\arquivo.soap"); //serviço
//            File uploadFile = new File("C:\\Users\\JeffRapha\\Documents\\intelij\\workspace\\logProject\\src\\main\\resources\\arquivoLog\\arquivo.soap");
            log.writeTo(uploadFile);
        }else{

        }
    }
}

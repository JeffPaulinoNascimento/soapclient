package br.com.soap.infra;

import br.com.caelum.vraptor.observer.upload.DefaultMultipartConfig;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Specializes;

@Specializes
@ApplicationScoped
public class CustomMultipartConfig extends DefaultMultipartConfig {

    // tamanho total do upload para 50MB
    public long getSizeLimit() {
        return 50 * 1024 * 1024;
    }

    // tamanho do upload de cada arquivo para 25MB
    public long getFileSizeLimit() {
        return 50 * 1024 * 1024;
    }
}

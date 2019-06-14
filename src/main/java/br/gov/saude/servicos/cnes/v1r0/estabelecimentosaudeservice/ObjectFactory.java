
package br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseLocalizarEstabelecimentoSaude }
     * 
     */
    public ResponseLocalizarEstabelecimentoSaude createResponseLocalizarEstabelecimentoSaude() {
        return new ResponseLocalizarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link ResponseConsultarEstabelecimentoSaude }
     * 
     */
    public ResponseConsultarEstabelecimentoSaude createResponseConsultarEstabelecimentoSaude() {
        return new ResponseConsultarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link RequestLocalizarEstabelecimentoSaude }
     * 
     */
    public RequestLocalizarEstabelecimentoSaude createRequestLocalizarEstabelecimentoSaude() {
        return new RequestLocalizarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link RequestConsultarPrecadastroCNES }
     * 
     */
    public RequestConsultarPrecadastroCNES createRequestConsultarPrecadastroCNES() {
        return new RequestConsultarPrecadastroCNES();
    }

    /**
     * Create an instance of {@link RequestConsultarEstabelecimentoSaude }
     * 
     */
    public RequestConsultarEstabelecimentoSaude createRequestConsultarEstabelecimentoSaude() {
        return new RequestConsultarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link ResponseConsultarPrecadastroCNES }
     * 
     */
    public ResponseConsultarPrecadastroCNES createResponseConsultarPrecadastroCNES() {
        return new ResponseConsultarPrecadastroCNES();
    }

}

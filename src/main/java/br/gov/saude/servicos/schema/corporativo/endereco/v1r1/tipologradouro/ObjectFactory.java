
package br.gov.saude.servicos.schema.corporativo.endereco.v1r1.tipologradouro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.endereco.v1r1.tipologradouro package. 
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

    private final static QName _TipoLogradouro_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/tipologradouro", "TipoLogradouro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.endereco.v1r1.tipologradouro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoLogradouroType }
     * 
     */
    public TipoLogradouroType createTipoLogradouroType() {
        return new TipoLogradouroType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoLogradouroType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/tipologradouro", name = "TipoLogradouro")
    public JAXBElement<TipoLogradouroType> createTipoLogradouro(TipoLogradouroType value) {
        return new JAXBElement<TipoLogradouroType>(_TipoLogradouro_QNAME, TipoLogradouroType.class, null, value);
    }

}

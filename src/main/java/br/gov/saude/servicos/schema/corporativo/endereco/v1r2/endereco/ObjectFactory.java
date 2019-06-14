
package br.gov.saude.servicos.schema.corporativo.endereco.v1r2.endereco;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.endereco.v1r2.endereco package. 
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

    private final static QName _Endereco_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco", "Endereco");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.endereco.v1r2.endereco
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnderecoType }
     * 
     */
    public EnderecoType createEnderecoType() {
        return new EnderecoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco", name = "Endereco")
    public JAXBElement<EnderecoType> createEndereco(EnderecoType value) {
        return new JAXBElement<EnderecoType>(_Endereco_QNAME, EnderecoType.class, null, value);
    }

}

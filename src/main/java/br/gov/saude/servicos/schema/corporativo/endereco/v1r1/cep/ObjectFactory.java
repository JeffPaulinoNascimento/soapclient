
package br.gov.saude.servicos.schema.corporativo.endereco.v1r1.cep;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.endereco.v1r1.cep package. 
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

    private final static QName _CEP_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/cep", "CEP");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.endereco.v1r1.cep
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CEPType }
     * 
     */
    public CEPType createCEPType() {
        return new CEPType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CEPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/cep", name = "CEP")
    public JAXBElement<CEPType> createCEP(CEPType value) {
        return new JAXBElement<CEPType>(_CEP_QNAME, CEPType.class, null, value);
    }

}

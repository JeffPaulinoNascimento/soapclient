
package br.gov.saude.servicos.schema.corporativo.v1r2.pais;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.v1r2.pais package. 
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

    private final static QName _Pais_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/v1r2/pais", "Pais");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.v1r2.pais
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaisType }
     * 
     */
    public PaisType createPaisType() {
        return new PaisType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r2/pais", name = "Pais")
    public JAXBElement<PaisType> createPais(PaisType value) {
        return new JAXBElement<PaisType>(_Pais_QNAME, PaisType.class, null, value);
    }

}

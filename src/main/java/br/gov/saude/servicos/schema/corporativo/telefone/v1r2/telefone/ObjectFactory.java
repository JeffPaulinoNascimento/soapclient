
package br.gov.saude.servicos.schema.corporativo.telefone.v1r2.telefone;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.telefone.v1r2.telefone package. 
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

    private final static QName _Telefone_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone", "Telefone");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.telefone.v1r2.telefone
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TelefoneType }
     * 
     */
    public TelefoneType createTelefoneType() {
        return new TelefoneType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone", name = "Telefone")
    public JAXBElement<TelefoneType> createTelefone(TelefoneType value) {
        return new JAXBElement<TelefoneType>(_Telefone_QNAME, TelefoneType.class, null, value);
    }

}

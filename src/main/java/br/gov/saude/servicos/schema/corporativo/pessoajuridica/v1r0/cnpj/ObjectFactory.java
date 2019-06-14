
package br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.cnpj;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.cnpj package. 
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

    private final static QName _CNPJ_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj", "CNPJ");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.cnpj
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CNPJType }
     * 
     */
    public CNPJType createCNPJType() {
        return new CNPJType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CNPJType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj", name = "CNPJ")
    public JAXBElement<CNPJType> createCNPJ(CNPJType value) {
        return new JAXBElement<CNPJType>(_CNPJ_QNAME, CNPJType.class, null, value);
    }

}

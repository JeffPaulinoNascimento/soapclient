
package br.gov.saude.servicos.schema.cnes.v1r0.codigounidade;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cnes.v1r0.codigounidade package. 
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

    private final static QName _CodigoUnidade_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/codigounidade", "CodigoUnidade");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cnes.v1r0.codigounidade
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CodigoUnidadeType }
     * 
     */
    public CodigoUnidadeType createCodigoUnidadeType() {
        return new CodigoUnidadeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoUnidadeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigounidade", name = "CodigoUnidade")
    public JAXBElement<CodigoUnidadeType> createCodigoUnidade(CodigoUnidadeType value) {
        return new JAXBElement<CodigoUnidadeType>(_CodigoUnidade_QNAME, CodigoUnidadeType.class, null, value);
    }

}

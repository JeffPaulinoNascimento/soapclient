
package br.gov.saude.servicos.schema.corporativo.v1r2.municipio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.v1r2.municipio package. 
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

    private final static QName _Municipio_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio", "Municipio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.v1r2.municipio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MunicipioType }
     * 
     */
    public MunicipioType createMunicipioType() {
        return new MunicipioType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MunicipioType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio", name = "Municipio")
    public JAXBElement<MunicipioType> createMunicipio(MunicipioType value) {
        return new JAXBElement<MunicipioType>(_Municipio_QNAME, MunicipioType.class, null, value);
    }

}

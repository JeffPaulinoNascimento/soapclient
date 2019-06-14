
package br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.nomejuridico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.nomejuridico package. 
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

    private final static QName _NomeJuridico_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/nomejuridico", "NomeJuridico");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.nomejuridico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NomeJuridicoType }
     * 
     */
    public NomeJuridicoType createNomeJuridicoType() {
        return new NomeJuridicoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NomeJuridicoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/nomejuridico", name = "NomeJuridico")
    public JAXBElement<NomeJuridicoType> createNomeJuridico(NomeJuridicoType value) {
        return new JAXBElement<NomeJuridicoType>(_NomeJuridico_QNAME, NomeJuridicoType.class, null, value);
    }

}

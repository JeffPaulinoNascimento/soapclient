
package br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprecadastrocnes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprecadastrocnes package. 
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

    private final static QName _FiltroPesquisaPrecadastroCnes_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", "FiltroPesquisaPrecadastroCnes");
    private final static QName _FiltroPesquisaPrecadastroCnesTypeSituacao_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", "situacao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprecadastrocnes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FiltroPesquisaPrecadastroCnesType }
     * 
     */
    public FiltroPesquisaPrecadastroCnesType createFiltroPesquisaPrecadastroCnesType() {
        return new FiltroPesquisaPrecadastroCnesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroPesquisaPrecadastroCnesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", name = "FiltroPesquisaPrecadastroCnes")
    public JAXBElement<FiltroPesquisaPrecadastroCnesType> createFiltroPesquisaPrecadastroCnes(FiltroPesquisaPrecadastroCnesType value) {
        return new JAXBElement<FiltroPesquisaPrecadastroCnesType>(_FiltroPesquisaPrecadastroCnes_QNAME, FiltroPesquisaPrecadastroCnesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", name = "situacao", scope = FiltroPesquisaPrecadastroCnesType.class)
    public JAXBElement<String> createFiltroPesquisaPrecadastroCnesTypeSituacao(String value) {
        return new JAXBElement<String>(_FiltroPesquisaPrecadastroCnesTypeSituacao_QNAME, String.class, FiltroPesquisaPrecadastroCnesType.class, value);
    }

}

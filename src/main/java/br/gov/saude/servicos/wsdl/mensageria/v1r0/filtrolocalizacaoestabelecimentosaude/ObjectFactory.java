
package br.gov.saude.servicos.wsdl.mensageria.v1r0.filtrolocalizacaoestabelecimentosaude;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.wsdl.mensageria.v1r0.filtrolocalizacaoestabelecimentosaude package. 
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

    private final static QName _FiltroLocalizacaoEstabelecimentoSaude_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude", "FiltroLocalizacaoEstabelecimentoSaude");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.wsdl.mensageria.v1r0.filtrolocalizacaoestabelecimentosaude
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FiltroLocalizacaoEstabelecimentoSaudeType }
     * 
     */
    public FiltroLocalizacaoEstabelecimentoSaudeType createFiltroLocalizacaoEstabelecimentoSaudeType() {
        return new FiltroLocalizacaoEstabelecimentoSaudeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroLocalizacaoEstabelecimentoSaudeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude", name = "FiltroLocalizacaoEstabelecimentoSaude")
    public JAXBElement<FiltroLocalizacaoEstabelecimentoSaudeType> createFiltroLocalizacaoEstabelecimentoSaude(FiltroLocalizacaoEstabelecimentoSaudeType value) {
        return new JAXBElement<FiltroLocalizacaoEstabelecimentoSaudeType>(_FiltroLocalizacaoEstabelecimentoSaude_QNAME, FiltroLocalizacaoEstabelecimentoSaudeType.class, null, value);
    }

}

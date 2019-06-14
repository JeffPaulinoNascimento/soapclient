
package br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtrolocalizacaoestabelecimentosaude.FiltroLocalizacaoEstabelecimentoSaudeType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude}FiltroLocalizacaoEstabelecimentoSaude"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filtroLocalizacaoEstabelecimentoSaude"
})
@XmlRootElement(name = "requestLocalizarEstabelecimentoSaude")
public class RequestLocalizarEstabelecimentoSaude {

    @XmlElement(name = "FiltroLocalizacaoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude", required = true)
    protected FiltroLocalizacaoEstabelecimentoSaudeType filtroLocalizacaoEstabelecimentoSaude;

    /**
     * Filtro de Localização.
     * 
     * @return
     *     possible object is
     *     {@link FiltroLocalizacaoEstabelecimentoSaudeType }
     *     
     */
    public FiltroLocalizacaoEstabelecimentoSaudeType getFiltroLocalizacaoEstabelecimentoSaude() {
        return filtroLocalizacaoEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade filtroLocalizacaoEstabelecimentoSaude.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroLocalizacaoEstabelecimentoSaudeType }
     *     
     */
    public void setFiltroLocalizacaoEstabelecimentoSaude(FiltroLocalizacaoEstabelecimentoSaudeType value) {
        this.filtroLocalizacaoEstabelecimentoSaude = value;
    }

}

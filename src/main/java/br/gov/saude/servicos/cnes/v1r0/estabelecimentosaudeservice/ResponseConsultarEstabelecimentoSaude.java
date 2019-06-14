
package br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.dadosgeraiscnes.DadosGeraisEstabelecimentoSaudeType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes}DadosGeraisEstabelecimentoSaude" minOccurs="0"/>
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
    "dadosGeraisEstabelecimentoSaude"
})
@XmlRootElement(name = "responseConsultarEstabelecimentoSaude")
public class ResponseConsultarEstabelecimentoSaude {

    @XmlElement(name = "DadosGeraisEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes")
    protected DadosGeraisEstabelecimentoSaudeType dadosGeraisEstabelecimentoSaude;

    /**
     * Obtém o valor da propriedade dadosGeraisEstabelecimentoSaude.
     * 
     * @return
     *     possible object is
     *     {@link DadosGeraisEstabelecimentoSaudeType }
     *     
     */
    public DadosGeraisEstabelecimentoSaudeType getDadosGeraisEstabelecimentoSaude() {
        return dadosGeraisEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade dadosGeraisEstabelecimentoSaude.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosGeraisEstabelecimentoSaudeType }
     *     
     */
    public void setDadosGeraisEstabelecimentoSaude(DadosGeraisEstabelecimentoSaudeType value) {
        this.dadosGeraisEstabelecimentoSaude = value;
    }

}

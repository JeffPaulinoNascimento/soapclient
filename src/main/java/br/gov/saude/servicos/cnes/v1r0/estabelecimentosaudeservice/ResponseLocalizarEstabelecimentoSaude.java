
package br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadoslocalizacaoestabelecimentosaude.ResultadosLocalizacaoEstabelecimentoSaudeType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadoslocalizacaoestabelecimentosaude}ResultadosLocalizacaoEstabelecimentoSaude" minOccurs="0"/>
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
    "resultadosLocalizacaoEstabelecimentoSaude"
})
@XmlRootElement(name = "responseLocalizarEstabelecimentoSaude")
public class ResponseLocalizarEstabelecimentoSaude {

    @XmlElement(name = "ResultadosLocalizacaoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadoslocalizacaoestabelecimentosaude")
    protected ResultadosLocalizacaoEstabelecimentoSaudeType resultadosLocalizacaoEstabelecimentoSaude;

    /**
     * Resultado localização de estabelecimentos.
     * 
     * @return
     *     possible object is
     *     {@link ResultadosLocalizacaoEstabelecimentoSaudeType }
     *     
     */
    public ResultadosLocalizacaoEstabelecimentoSaudeType getResultadosLocalizacaoEstabelecimentoSaude() {
        return resultadosLocalizacaoEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade resultadosLocalizacaoEstabelecimentoSaude.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadosLocalizacaoEstabelecimentoSaudeType }
     *     
     */
    public void setResultadosLocalizacaoEstabelecimentoSaude(ResultadosLocalizacaoEstabelecimentoSaudeType value) {
        this.resultadosLocalizacaoEstabelecimentoSaude = value;
    }

}

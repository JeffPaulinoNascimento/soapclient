
package br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.dadosprecadastrocnes.DadosPreCadastroCNESType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosprecadastrocnes}DadosPreCadastroCNES" minOccurs="0"/>
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
    "dadosPreCadastroCNES"
})
@XmlRootElement(name = "responseConsultarPrecadastroCNES")
public class ResponseConsultarPrecadastroCNES {

    @XmlElement(name = "DadosPreCadastroCNES", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosprecadastrocnes")
    protected DadosPreCadastroCNESType dadosPreCadastroCNES;

    /**
     * Resultado com os dados de precadastro do Estabelecimento de Saúde.
     * 
     * @return
     *     possible object is
     *     {@link DadosPreCadastroCNESType }
     *     
     */
    public DadosPreCadastroCNESType getDadosPreCadastroCNES() {
        return dadosPreCadastroCNES;
    }

    /**
     * Define o valor da propriedade dadosPreCadastroCNES.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosPreCadastroCNESType }
     *     
     */
    public void setDadosPreCadastroCNES(DadosPreCadastroCNESType value) {
        this.dadosPreCadastroCNES = value;
    }

}

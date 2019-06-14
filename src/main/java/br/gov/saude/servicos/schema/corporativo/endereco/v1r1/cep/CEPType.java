
package br.gov.saude.servicos.schema.corporativo.endereco.v1r1.cep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Número do CEP.
 * 
 * <p>Classe Java de CEPType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CEPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroCEP" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/cep}NumeroCEPType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CEPType", propOrder = {
    "numeroCEP"
})
public class CEPType {

    @XmlElement(required = true)
    protected String numeroCEP;

    /**
     * Obtém o valor da propriedade numeroCEP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCEP() {
        return numeroCEP;
    }

    /**
     * Define o valor da propriedade numeroCEP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCEP(String value) {
        this.numeroCEP = value;
    }

}

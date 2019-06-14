
package br.gov.saude.servicos.schema.corporativo.documento.v1r2.cpf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Número do CPF.
 * 
 * <p>Classe Java de CPFType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CPFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroCPF" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf}NumeroCPFType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPFType", propOrder = {
    "numeroCPF"
})
public class CPFType {

    @XmlElement(required = true)
    protected String numeroCPF;

    /**
     * Obtém o valor da propriedade numeroCPF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCPF() {
        return numeroCPF;
    }

    /**
     * Define o valor da propriedade numeroCPF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCPF(String value) {
        this.numeroCPF = value;
    }

}

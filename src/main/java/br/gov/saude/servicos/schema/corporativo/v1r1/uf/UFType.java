
package br.gov.saude.servicos.schema.corporativo.v1r1.uf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UFType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="siglaUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRegiao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFType", propOrder = {
    "codigoUF",
    "siglaUF",
    "codigoRegiao",
    "nomeUF"
})
public class UFType {

    @XmlElement(required = true)
    protected String codigoUF;
    protected String siglaUF;
    protected String codigoRegiao;
    protected String nomeUF;

    /**
     * Obtém o valor da propriedade codigoUF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUF() {
        return codigoUF;
    }

    /**
     * Define o valor da propriedade codigoUF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUF(String value) {
        this.codigoUF = value;
    }

    /**
     * Obtém o valor da propriedade siglaUF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaUF() {
        return siglaUF;
    }

    /**
     * Define o valor da propriedade siglaUF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaUF(String value) {
        this.siglaUF = value;
    }

    /**
     * Obtém o valor da propriedade codigoRegiao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegiao() {
        return codigoRegiao;
    }

    /**
     * Define o valor da propriedade codigoRegiao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegiao(String value) {
        this.codigoRegiao = value;
    }

    /**
     * Obtém o valor da propriedade nomeUF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUF() {
        return nomeUF;
    }

    /**
     * Define o valor da propriedade nomeUF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUF(String value) {
        this.nomeUF = value;
    }

}

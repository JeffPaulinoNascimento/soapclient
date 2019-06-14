
package br.gov.saude.servicos.schema.corporativo.v1r2.email;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EmailType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EmailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="descricaoEmail">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipoEmail" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/email}TipoEmailType"/>
 *         &lt;element name="validado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailType", propOrder = {
    "identificador",
    "descricaoEmail",
    "tipoEmail",
    "validado"
})
public class EmailType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    @XmlElement(required = true)
    protected String descricaoEmail;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoEmailType tipoEmail;
    protected Boolean validado;

    /**
     * Obtém o valor da propriedade identificador.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificador() {
        return identificador;
    }

    /**
     * Define o valor da propriedade identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificador(BigInteger value) {
        this.identificador = value;
    }

    /**
     * Obtém o valor da propriedade descricaoEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoEmail() {
        return descricaoEmail;
    }

    /**
     * Define o valor da propriedade descricaoEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoEmail(String value) {
        this.descricaoEmail = value;
    }

    /**
     * Obtém o valor da propriedade tipoEmail.
     * 
     * @return
     *     possible object is
     *     {@link TipoEmailType }
     *     
     */
    public TipoEmailType getTipoEmail() {
        return tipoEmail;
    }

    /**
     * Define o valor da propriedade tipoEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEmailType }
     *     
     */
    public void setTipoEmail(TipoEmailType value) {
        this.tipoEmail = value;
    }

    /**
     * Obtém o valor da propriedade validado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidado() {
        return validado;
    }

    /**
     * Define o valor da propriedade validado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidado(Boolean value) {
        this.validado = value;
    }

}

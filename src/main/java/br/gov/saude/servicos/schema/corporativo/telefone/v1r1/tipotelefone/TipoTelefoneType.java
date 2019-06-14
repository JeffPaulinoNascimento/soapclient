
package br.gov.saude.servicos.schema.corporativo.telefone.v1r1.tipotelefone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoTelefoneType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TipoTelefoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipoTelefone">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *               &lt;pattern value="[0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descricaoTipoTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoTelefoneType", propOrder = {
    "codigoTipoTelefone",
    "descricaoTipoTelefone"
})
public class TipoTelefoneType {

    @XmlElement(required = true)
    protected String codigoTipoTelefone;
    protected String descricaoTipoTelefone;

    /**
     * Obtém o valor da propriedade codigoTipoTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoTelefone() {
        return codigoTipoTelefone;
    }

    /**
     * Define o valor da propriedade codigoTipoTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoTelefone(String value) {
        this.codigoTipoTelefone = value;
    }

    /**
     * Obtém o valor da propriedade descricaoTipoTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoTipoTelefone() {
        return descricaoTipoTelefone;
    }

    /**
     * Define o valor da propriedade descricaoTipoTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoTipoTelefone(String value) {
        this.descricaoTipoTelefone = value;
    }

}

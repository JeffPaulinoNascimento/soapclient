
package br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.naturezajuridica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.tiponaturezajuridica.TipoNaturezaJuridicaType;


/**
 * <p>Classe Java de NaturezaJuridicaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NaturezaJuridicaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoNaturezaJuridica">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descricaoNaturezaJuridica">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigoNaturezaJuridicaConcla">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipoNaturezaJuridica" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/tiponaturezajuridica}TipoNaturezaJuridicaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturezaJuridicaType", propOrder = {
    "codigoNaturezaJuridica",
    "descricaoNaturezaJuridica",
    "codigoNaturezaJuridicaConcla",
    "tipoNaturezaJuridica"
})
public class NaturezaJuridicaType {

    @XmlElement(required = true)
    protected String codigoNaturezaJuridica;
    @XmlElement(required = true)
    protected String descricaoNaturezaJuridica;
    @XmlElement(required = true)
    protected String codigoNaturezaJuridicaConcla;
    @XmlElement(required = true)
    protected TipoNaturezaJuridicaType tipoNaturezaJuridica;

    /**
     * Obtém o valor da propriedade codigoNaturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNaturezaJuridica() {
        return codigoNaturezaJuridica;
    }

    /**
     * Define o valor da propriedade codigoNaturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNaturezaJuridica(String value) {
        this.codigoNaturezaJuridica = value;
    }

    /**
     * Obtém o valor da propriedade descricaoNaturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoNaturezaJuridica() {
        return descricaoNaturezaJuridica;
    }

    /**
     * Define o valor da propriedade descricaoNaturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoNaturezaJuridica(String value) {
        this.descricaoNaturezaJuridica = value;
    }

    /**
     * Obtém o valor da propriedade codigoNaturezaJuridicaConcla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNaturezaJuridicaConcla() {
        return codigoNaturezaJuridicaConcla;
    }

    /**
     * Define o valor da propriedade codigoNaturezaJuridicaConcla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNaturezaJuridicaConcla(String value) {
        this.codigoNaturezaJuridicaConcla = value;
    }

    /**
     * Obtém o valor da propriedade tipoNaturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link TipoNaturezaJuridicaType }
     *     
     */
    public TipoNaturezaJuridicaType getTipoNaturezaJuridica() {
        return tipoNaturezaJuridica;
    }

    /**
     * Define o valor da propriedade tipoNaturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNaturezaJuridicaType }
     *     
     */
    public void setTipoNaturezaJuridica(TipoNaturezaJuridicaType value) {
        this.tipoNaturezaJuridica = value;
    }

}

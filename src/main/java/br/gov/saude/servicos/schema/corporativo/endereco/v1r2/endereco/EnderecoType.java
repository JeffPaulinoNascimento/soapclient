
package br.gov.saude.servicos.schema.corporativo.endereco.v1r2.endereco;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.corporativo.endereco.v1r1.bairro.BairroType;
import br.gov.saude.servicos.schema.corporativo.endereco.v1r1.cep.CEPType;
import br.gov.saude.servicos.schema.corporativo.endereco.v1r1.tipologradouro.TipoLogradouroType;
import br.gov.saude.servicos.schema.corporativo.v1r2.municipio.MunicipioType;
import br.gov.saude.servicos.schema.corporativo.v1r2.pais.PaisType;


/**
 * <p>Classe Java de EnderecoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EnderecoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TipoEndereco" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco}TipoEnderecoType" minOccurs="0"/>
 *         &lt;element name="TipoLogradouro" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/tipologradouro}TipoLogradouroType" minOccurs="0"/>
 *         &lt;element name="nomeLogradouro" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="250"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numero" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="complemento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Bairro" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/bairro}BairroType" minOccurs="0"/>
 *         &lt;element name="CEP" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/cep}CEPType" minOccurs="0"/>
 *         &lt;element name="Municipio" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio}MunicipioType" minOccurs="0"/>
 *         &lt;element name="Pais" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/pais}PaisType" minOccurs="0"/>
 *         &lt;element name="municipioInternacional" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnderecoType", propOrder = {
    "identificador",
    "tipoEndereco",
    "tipoLogradouro",
    "nomeLogradouro",
    "numero",
    "complemento",
    "bairro",
    "cep",
    "municipio",
    "pais",
    "municipioInternacional"
})
public class EnderecoType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    @XmlElement(name = "TipoEndereco")
    protected String tipoEndereco;
    @XmlElement(name = "TipoLogradouro")
    protected TipoLogradouroType tipoLogradouro;
    protected String nomeLogradouro;
    protected String numero;
    protected String complemento;
    @XmlElement(name = "Bairro")
    protected BairroType bairro;
    @XmlElement(name = "CEP")
    protected CEPType cep;
    @XmlElement(name = "Municipio")
    protected MunicipioType municipio;
    @XmlElement(name = "Pais")
    protected PaisType pais;
    protected String municipioInternacional;

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
     * Obtém o valor da propriedade tipoEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEndereco() {
        return tipoEndereco;
    }

    /**
     * Define o valor da propriedade tipoEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEndereco(String value) {
        this.tipoEndereco = value;
    }

    /**
     * Obtém o valor da propriedade tipoLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link TipoLogradouroType }
     *     
     */
    public TipoLogradouroType getTipoLogradouro() {
        return tipoLogradouro;
    }

    /**
     * Define o valor da propriedade tipoLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLogradouroType }
     *     
     */
    public void setTipoLogradouro(TipoLogradouroType value) {
        this.tipoLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade nomeLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    /**
     * Define o valor da propriedade nomeLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeLogradouro(String value) {
        this.nomeLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link BairroType }
     *     
     */
    public BairroType getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link BairroType }
     *     
     */
    public void setBairro(BairroType value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link CEPType }
     *     
     */
    public CEPType getCEP() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link CEPType }
     *     
     */
    public void setCEP(CEPType value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade municipio.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioType }
     *     
     */
    public MunicipioType getMunicipio() {
        return municipio;
    }

    /**
     * Define o valor da propriedade municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioType }
     *     
     */
    public void setMunicipio(MunicipioType value) {
        this.municipio = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link PaisType }
     *     
     */
    public PaisType getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link PaisType }
     *     
     */
    public void setPais(PaisType value) {
        this.pais = value;
    }

    /**
     * Obtém o valor da propriedade municipioInternacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioInternacional() {
        return municipioInternacional;
    }

    /**
     * Define o valor da propriedade municipioInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioInternacional(String value) {
        this.municipioInternacional = value;
    }

}


package br.gov.saude.servicos.wsdl.mensageria.v1r0.paginacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PaginacaoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PaginacaoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="posicaoRegistroInicio" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}numero"/>
 *         &lt;element name="quantidadeRegistrosPorPagina" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}numero"/>
 *         &lt;element name="quantidadeRegistros" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}numero" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginacaoType", propOrder = {
    "posicaoRegistroInicio",
    "quantidadeRegistrosPorPagina",
    "quantidadeRegistros"
})
public class PaginacaoType {

    @XmlElement(required = true)
    protected String posicaoRegistroInicio;
    @XmlElement(required = true)
    protected String quantidadeRegistrosPorPagina;
    protected String quantidadeRegistros;

    /**
     * Obtém o valor da propriedade posicaoRegistroInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicaoRegistroInicio() {
        return posicaoRegistroInicio;
    }

    /**
     * Define o valor da propriedade posicaoRegistroInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicaoRegistroInicio(String value) {
        this.posicaoRegistroInicio = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeRegistrosPorPagina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantidadeRegistrosPorPagina() {
        return quantidadeRegistrosPorPagina;
    }

    /**
     * Define o valor da propriedade quantidadeRegistrosPorPagina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantidadeRegistrosPorPagina(String value) {
        this.quantidadeRegistrosPorPagina = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeRegistros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Define o valor da propriedade quantidadeRegistros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantidadeRegistros(String value) {
        this.quantidadeRegistros = value;
    }

}

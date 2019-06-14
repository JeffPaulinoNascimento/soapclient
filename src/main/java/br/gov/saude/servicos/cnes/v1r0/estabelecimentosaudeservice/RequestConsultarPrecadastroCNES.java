
package br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprecadastrocnes.FiltroPesquisaPrecadastroCnesType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes}FiltroPesquisaPrecadastroCnes"/>
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
    "filtroPesquisaPrecadastroCnes"
})
@XmlRootElement(name = "requestConsultarPrecadastroCNES")
public class RequestConsultarPrecadastroCNES {

    @XmlElement(name = "FiltroPesquisaPrecadastroCnes", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", required = true)
    protected FiltroPesquisaPrecadastroCnesType filtroPesquisaPrecadastroCnes;

    /**
     * Filtro Pesquisa Precadastro CNES.
     * 
     * @return
     *     possible object is
     *     {@link FiltroPesquisaPrecadastroCnesType }
     *     
     */
    public FiltroPesquisaPrecadastroCnesType getFiltroPesquisaPrecadastroCnes() {
        return filtroPesquisaPrecadastroCnes;
    }

    /**
     * Define o valor da propriedade filtroPesquisaPrecadastroCnes.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroPesquisaPrecadastroCnesType }
     *     
     */
    public void setFiltroPesquisaPrecadastroCnes(FiltroPesquisaPrecadastroCnesType value) {
        this.filtroPesquisaPrecadastroCnes = value;
    }

}

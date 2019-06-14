
package br.gov.saude.servicos.schema.cnes.v1r0.dadosprecadastrocnes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.cnes.v1r0.codigocnes.CodigoCNESType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.cpf.CPFType;
import br.gov.saude.servicos.schema.corporativo.endereco.v1r2.endereco.EnderecoType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.cnpj.CNPJType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.naturezajuridica.NaturezaJuridicaType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.nomejuridico.NomeJuridicoType;
import br.gov.saude.servicos.schema.corporativo.telefone.v1r2.telefone.TelefoneType;
import br.gov.saude.servicos.schema.corporativo.v1r2.email.EmailType;


/**
 * <p>Classe Java de DadosPreCadastroCNESType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosPreCadastroCNESType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes}CodigoCNES"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf}CPF" minOccurs="0"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj}CNPJ" minOccurs="0"/>
 *         &lt;element name="NomeFantasia" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/nomejuridico}NomeJuridicoType" minOccurs="0"/>
 *         &lt;element name="NomeEmpresarial" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/nomejuridico}NomeJuridicoType" minOccurs="0"/>
 *         &lt;element name="NaturezaJuridica" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/naturezajuridica}NaturezaJuridicaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CNPJMantenedora" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj}CNPJType" minOccurs="0"/>
 *         &lt;element name="NaturezaJuridicaMantenedora" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/naturezajuridica}NaturezaJuridicaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco}Endereco" minOccurs="0"/>
 *         &lt;element name="Telefones" type="{http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone}TelefoneType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/corporativo/v1r2/email}Email" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosPreCadastroCNESType", propOrder = {
    "codigoCNES",
    "cpf",
    "cnpj",
    "nomeFantasia",
    "nomeEmpresarial",
    "naturezaJuridica",
    "cnpjMantenedora",
    "naturezaJuridicaMantenedora",
    "dataAtualizacao",
    "endereco",
    "telefones",
    "email"
})
public class DadosPreCadastroCNESType {

    @XmlElement(name = "CodigoCNES", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes", required = true)
    protected CodigoCNESType codigoCNES;
    @XmlElement(name = "CPF", namespace = "http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf")
    protected CPFType cpf;
    @XmlElement(name = "CNPJ", namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj")
    protected CNPJType cnpj;
    @XmlElement(name = "NomeFantasia")
    protected NomeJuridicoType nomeFantasia;
    @XmlElement(name = "NomeEmpresarial")
    protected NomeJuridicoType nomeEmpresarial;
    @XmlElement(name = "NaturezaJuridica")
    protected List<NaturezaJuridicaType> naturezaJuridica;
    @XmlElement(name = "CNPJMantenedora")
    protected CNPJType cnpjMantenedora;
    @XmlElement(name = "NaturezaJuridicaMantenedora")
    protected List<NaturezaJuridicaType> naturezaJuridicaMantenedora;
    @XmlElement(name = "DataAtualizacao")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAtualizacao;
    @XmlElement(name = "Endereco", namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco")
    protected EnderecoType endereco;
    @XmlElement(name = "Telefones")
    protected List<TelefoneType> telefones;
    @XmlElement(name = "Email", namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r2/email")
    protected List<EmailType> email;

    /**
     * Código do Estabelecimento de Saúde.
     * 
     * @return
     *     possible object is
     *     {@link CodigoCNESType }
     *     
     */
    public CodigoCNESType getCodigoCNES() {
        return codigoCNES;
    }

    /**
     * Define o valor da propriedade codigoCNES.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoCNESType }
     *     
     */
    public void setCodigoCNES(CodigoCNESType value) {
        this.codigoCNES = value;
    }

    /**
     * CPF do Estabelecimento de Saúde.
     * 
     * @return
     *     possible object is
     *     {@link CPFType }
     *     
     */
    public CPFType getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link CPFType }
     *     
     */
    public void setCPF(CPFType value) {
        this.cpf = value;
    }

    /**
     * CNPJ do Estabelecimento de Saúde.
     * 
     * @return
     *     possible object is
     *     {@link CNPJType }
     *     
     */
    public CNPJType getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link CNPJType }
     *     
     */
    public void setCNPJ(CNPJType value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade nomeFantasia.
     * 
     * @return
     *     possible object is
     *     {@link NomeJuridicoType }
     *     
     */
    public NomeJuridicoType getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Define o valor da propriedade nomeFantasia.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeJuridicoType }
     *     
     */
    public void setNomeFantasia(NomeJuridicoType value) {
        this.nomeFantasia = value;
    }

    /**
     * Obtém o valor da propriedade nomeEmpresarial.
     * 
     * @return
     *     possible object is
     *     {@link NomeJuridicoType }
     *     
     */
    public NomeJuridicoType getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    /**
     * Define o valor da propriedade nomeEmpresarial.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeJuridicoType }
     *     
     */
    public void setNomeEmpresarial(NomeJuridicoType value) {
        this.nomeEmpresarial = value;
    }

    /**
     * Gets the value of the naturezaJuridica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naturezaJuridica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaturezaJuridica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturezaJuridicaType }
     * 
     * 
     */
    public List<NaturezaJuridicaType> getNaturezaJuridica() {
        if (naturezaJuridica == null) {
            naturezaJuridica = new ArrayList<NaturezaJuridicaType>();
        }
        return this.naturezaJuridica;
    }

    /**
     * Obtém o valor da propriedade cnpjMantenedora.
     * 
     * @return
     *     possible object is
     *     {@link CNPJType }
     *     
     */
    public CNPJType getCNPJMantenedora() {
        return cnpjMantenedora;
    }

    /**
     * Define o valor da propriedade cnpjMantenedora.
     * 
     * @param value
     *     allowed object is
     *     {@link CNPJType }
     *     
     */
    public void setCNPJMantenedora(CNPJType value) {
        this.cnpjMantenedora = value;
    }

    /**
     * Gets the value of the naturezaJuridicaMantenedora property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naturezaJuridicaMantenedora property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaturezaJuridicaMantenedora().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturezaJuridicaType }
     * 
     * 
     */
    public List<NaturezaJuridicaType> getNaturezaJuridicaMantenedora() {
        if (naturezaJuridicaMantenedora == null) {
            naturezaJuridicaMantenedora = new ArrayList<NaturezaJuridicaType>();
        }
        return this.naturezaJuridicaMantenedora;
    }

    /**
     * Obtém o valor da propriedade dataAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Define o valor da propriedade dataAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacao(XMLGregorianCalendar value) {
        this.dataAtualizacao = value;
    }

    /**
     * Endereço do Estabelecimetno de Saúde.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoType }
     *     
     */
    public EnderecoType getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoType }
     *     
     */
    public void setEndereco(EnderecoType value) {
        this.endereco = value;
    }

    /**
     * Gets the value of the telefones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelefoneType }
     * 
     * 
     */
    public List<TelefoneType> getTelefones() {
        if (telefones == null) {
            telefones = new ArrayList<TelefoneType>();
        }
        return this.telefones;
    }

    /**
     * Email(s) do Estabelecimento de Saúde Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

}

package br.com.soap.modelos;

public class EnderecoDatasus {
    private String tipoEndereco;
    private TipoLogradouroDatasus tipoLogradouro;
    private String nomeLogradouro;
    private String numero;
    private String complemento;
    private BairroDatasus bairro;
    private String cep;
    private MunicipioDatasus municipio;
    private PaisDatasus pais;
    private String municipioInternacional;

    public String getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public TipoLogradouroDatasus getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouroDatasus tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public BairroDatasus getBairro() {
        return bairro;
    }

    public void setBairro(BairroDatasus bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public MunicipioDatasus getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDatasus municipio) {
        this.municipio = municipio;
    }

    public PaisDatasus getPais() {
        return pais;
    }

    public void setPais(PaisDatasus pais) {
        this.pais = pais;
    }

    public String getMunicipioInternacional() {
        return municipioInternacional;
    }

    public void setMunicipioInternacional(String municipioInternacional) {
        this.municipioInternacional = municipioInternacional;
    }
}

package br.com.soap.dto;

import br.com.soap.modelos.*;
import java.util.Calendar;
import java.util.List;

public class DadosEstabelecimentoSaudeDTO {

    private String codigoCnes;
    private String codigoUnidade;
    private String nomeFantasia;
    private String nomeEmpresarial;
    private String cnpj;
    private EnderecoDatasus logradouro;
    private Calendar dataAtualizacao;
    private DiretorDatasus diretor;
    private TipoUnidadeDatasus tipoUnidade;
    private EsferaAdministrativaDatasus esferaAdministrativa;
    private MunicipioDatasus municipioGestor;
    private List<TelefoneDatasus> telefones;
    private EmailDatasus email;
    private LocalizacaoDatasus localizacao;
    private Boolean perteceSistemaSUS;

    public String getCodigoCnes() {
        return codigoCnes;
    }

    public void setCodigoCnes(String codigoCnes) {
        this.codigoCnes = codigoCnes;
    }

    public String getCodigoUnidade() {
        return codigoUnidade;
    }

    public void setCodigoUnidade(String codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public EnderecoDatasus getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(EnderecoDatasus logradouro) {
        this.logradouro = logradouro;
    }

    public Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public DiretorDatasus getDiretor() {
        return diretor;
    }

    public void setDiretor(DiretorDatasus diretor) {
        this.diretor = diretor;
    }

    public TipoUnidadeDatasus getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(TipoUnidadeDatasus tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public EsferaAdministrativaDatasus getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    public void setEsferaAdministrativa(EsferaAdministrativaDatasus esferaAdministrativa) {
        this.esferaAdministrativa = esferaAdministrativa;
    }

    public MunicipioDatasus getMunicipioGestor() {
        return municipioGestor;
    }

    public void setMunicipioGestor(MunicipioDatasus municipioGestor) {
        this.municipioGestor = municipioGestor;
    }

    public List<TelefoneDatasus> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneDatasus> telefones) {
        this.telefones = telefones;
    }

    public EmailDatasus getEmail() {
        return email;
    }

    public void setEmail(EmailDatasus email) {
        this.email = email;
    }

    public LocalizacaoDatasus getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(LocalizacaoDatasus localizacao) {
        this.localizacao = localizacao;
    }

    public Boolean getPerteceSistemaSUS() {
        return perteceSistemaSUS;
    }

    public void setPerteceSistemaSUS(Boolean perteceSistemaSUS) {
        this.perteceSistemaSUS = perteceSistemaSUS;
    }
}

package br.com.soap.modelos;

public class MunicipioDatasus {

    private String codigoMunicipio;
    private String nomeMunicipio;
    private UFDatasus uf;

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public UFDatasus getUf() {
        return uf;
    }

    public void setUf(UFDatasus uf) {
        this.uf = uf;
    }
}

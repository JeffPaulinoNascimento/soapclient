package br.com.soap.modelos;

import java.math.BigInteger;

public class TelefoneDatasus {

    private BigInteger identificador;
    private TipoTelefoneDatasus tipoTelefone;
    private Integer ddi;
    private Integer ddd;
    private Integer numeroTelefone;

    public BigInteger getIdentificador() {
        return identificador;
    }

    public void setIdentificador(BigInteger identificador) {
        this.identificador = identificador;
    }

    public TipoTelefoneDatasus getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefoneDatasus tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public Integer getDdi() {
        return ddi;
    }

    public void setDdi(Integer ddi) {
        this.ddi = ddi;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(Integer numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}

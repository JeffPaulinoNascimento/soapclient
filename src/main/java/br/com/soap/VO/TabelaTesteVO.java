package br.com.soap.VO;

import br.com.soap.modelos.TesteObject;

import java.util.List;

public class TabelaTesteVO {

    private int sEcho;
    private String iTotalRecords;
    private String iTotalDisplayRecords;
    private List<TesteObject> aaData;

    public int getsEcho() {
        return sEcho;
    }

    public void setsEcho(int sEcho) {
        this.sEcho = sEcho;
    }

    public String getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(String iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public String getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(String iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public List<TesteObject> getAaData() {
        return aaData;
    }

    public void setAaData(List<TesteObject> aaData) {
        this.aaData = aaData;
    }
}

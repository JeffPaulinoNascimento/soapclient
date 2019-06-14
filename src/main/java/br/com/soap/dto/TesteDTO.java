package br.com.soap.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDTO {

    private String data;

    private String ip;

    private String request;

    private Integer status;

    private String userAgent;

    private Date dateDTO;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Date convertStringToData(String data) throws ParseException {
        dateDTO = format.parse(data);
        return dateDTO;
    }

    public Date getDateDTO() {
        return dateDTO;
    }

    public void setDateDTO(Date dateDTO) {
        this.dateDTO = dateDTO;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}

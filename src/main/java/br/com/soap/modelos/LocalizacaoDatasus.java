package br.com.soap.modelos;

import javax.xml.bind.annotation.XmlElement;

public class LocalizacaoDatasus {

    private String longitude;
    private String latitude;
    private String geoJson;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getGeoJson() {
        return geoJson;
    }

    public void setGeoJson(String geoJson) {
        this.geoJson = geoJson;
    }
}

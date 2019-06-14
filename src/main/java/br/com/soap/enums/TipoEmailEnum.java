package br.com.soap.enums;

public enum TipoEmailEnum {

    P,
    A;

    public String value() {
        return name();
    }

    public static TipoEmailEnum fromValue(String v) {
        return valueOf(v);
    }

}

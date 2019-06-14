package br.com.soap.modelos;

import br.com.soap.enums.TipoEmailEnum;
import br.gov.saude.servicos.schema.corporativo.v1r2.email.TipoEmailType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import java.math.BigInteger;

public class EmailDatasus {

    private BigInteger identificador;
    private String descricaoEmail;
    private TipoEmailEnum tipoEmail;
    private Boolean validado;

}

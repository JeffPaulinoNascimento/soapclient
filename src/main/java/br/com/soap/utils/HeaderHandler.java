package br.com.soap.utils;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if(outboundProperty.booleanValue()){
            try {
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();

                SOAPElement security = header.addChildElement("Security","wsse","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext1.0.xsd");

                SOAPElement userNameToken = security.addChildElement("UsernameToken","wsse");

                SOAPElement userName = userNameToken.addChildElement("Username","wsse");
                userName.addTextNode("CNES.PUBLICO");

                SOAPElement password = userNameToken.addChildElement("Password","wsse");
                password.addTextNode(">cnes#2015public");


            } catch (SOAPException e) {
                e.printStackTrace();
            }
        }
        return outboundProperty;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }
}

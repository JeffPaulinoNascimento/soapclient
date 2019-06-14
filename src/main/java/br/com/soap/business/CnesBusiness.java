package br.com.soap.business;


import br.com.soap.dto.DadosEstabelecimentoSaudeDTO;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.*;
import br.gov.saude.servicos.schema.cnes.v1r0.codigocnes.CodigoCNESType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaestabelecimentosaude.FiltroPesquisaEstabelecimentoSaudeType;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPHeader;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CnesBusiness {

    public DadosEstabelecimentoSaudeDTO buscarCnes(String cnes) throws EstabelecimentoSaudeFault {

        EstabelecimentoSaudeServicePortType port = new EstabelecimentoSaudeService().getEstabelecimentoSaudeServiceSOAP11Port();
        System.out.println("teste porta");

        RequestConsultarEstabelecimentoSaude requestConsultarEstabelecimentoSaude = new RequestConsultarEstabelecimentoSaude();

        FiltroPesquisaEstabelecimentoSaudeType filtroPesquisaEstabelecimentoSaudeType = new FiltroPesquisaEstabelecimentoSaudeType();

        CodigoCNESType codigoCNESType = new CodigoCNESType();
        codigoCNESType.setCodigo(cnes);
        filtroPesquisaEstabelecimentoSaudeType.setCodigoCNES(codigoCNESType);

        requestConsultarEstabelecimentoSaude.setFiltroPesquisaEstabelecimentoSaude(filtroPesquisaEstabelecimentoSaudeType);

        BindingProvider provider = (BindingProvider) port;

        Map<String, Object> requestContext = provider.getRequestContext();
        Map<String, List<String>> headers = new HashMap<String, List<String>>();

        headers.put("Username", Collections.singletonList("CNES.PUBLICO"));
        headers.put("Password", Collections.singletonList("cnes#2015public"));
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

        ResponseConsultarEstabelecimentoSaude responseConsultarEstabelecimentoSaude = port.consultarEstabelecimentoSaude(requestConsultarEstabelecimentoSaude);
        return null;
    }



}

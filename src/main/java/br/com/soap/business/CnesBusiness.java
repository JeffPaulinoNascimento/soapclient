package br.com.soap.business;


import br.com.soap.dto.DadosEstabelecimentoSaudeDTO;
import br.com.soap.utils.HeaderHandlerResolver;
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

        EstabelecimentoSaudeService service = new EstabelecimentoSaudeService();

        EstabelecimentoSaudeServicePortType port = service.getEstabelecimentoSaudeServiceSOAP11Port();

        HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();

        service.setHandlerResolver(handlerResolver);

        RequestConsultarEstabelecimentoSaude requestConsultarEstabelecimentoSaude = new RequestConsultarEstabelecimentoSaude();

        FiltroPesquisaEstabelecimentoSaudeType filtroPesquisaEstabelecimentoSaudeType = new FiltroPesquisaEstabelecimentoSaudeType();

        CodigoCNESType codigoCNESType = new CodigoCNESType();
        codigoCNESType.setCodigo(cnes);
        filtroPesquisaEstabelecimentoSaudeType.setCodigoCNES(codigoCNESType);

        requestConsultarEstabelecimentoSaude.setFiltroPesquisaEstabelecimentoSaude(filtroPesquisaEstabelecimentoSaudeType);

        ResponseConsultarEstabelecimentoSaude responseConsultarEstabelecimentoSaude = port.consultarEstabelecimentoSaude(requestConsultarEstabelecimentoSaude);

        return null;
    }



}

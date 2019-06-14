package br.com.soap.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.soap.business.CnesBusiness;
import br.com.soap.dto.DadosEstabelecimentoSaudeDTO;
import br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice.EstabelecimentoSaudeFault;

import javax.inject.Inject;

@Controller
public class CnesController {

    @Inject
    private CnesBusiness cnesBusiness;

    @Path("/cnes")
    public DadosEstabelecimentoSaudeDTO consultaCnes(String numeroCnes) throws EstabelecimentoSaudeFault {
        return cnesBusiness.buscarCnes(numeroCnes);

    }


}

package br.com.soap.controllers;

import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.observer.upload.UploadedFile;
import br.com.caelum.vraptor.validator.Validator;
import br.com.caelum.vraptor.view.Results;
import br.com.soap.dto.TesteDTO;
import br.com.soap.modelos.TesteObject;
import br.com.soap.dao.LogDao;
import br.com.soap.utils.ArquivoTeste;
import br.com.soap.VO.TabelaTesteVO;
import br.com.soap.utils.SalvarArquivoTesteBD;
import javax.servlet.http.HttpServletRequest;

import javax.inject.Inject;
import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class TesteController {

    private Result result;
    private Validator validator;
    private LogDao logDao;
    private List<TesteObject> aaData;

    @Inject
    private HttpServletRequest request;

    @Inject
    private ArquivoTeste arquivoTeste;

    @Inject
    private TesteObject testeObject;

    @Inject
    private SalvarArquivoTesteBD salvarArquivoLog;

    @Inject
    private TesteDTO testeDTO;

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Inject
    public TesteController(LogDao logDao, Result result, Validator validator){
        this.logDao = logDao;
        this.result = result;
        this.validator = validator;
    }

    public TesteController(){}

    @Path("/index")
    public void index(){
        //List<TesteObject> logs = logDao.listaLogs();
        //result.include("logs", logs);
    }

    @Path("/form")
    public void form(){}

    public void adiciona(@Valid TesteDTO testeDTO) throws ParseException {
        validator.onErrorRedirectTo(this).form();

        testeObject.setUserAgent(testeDTO.getUserAgent());
        testeObject.setStatus(testeDTO.getStatus());
        testeObject.setRequest(testeDTO.getRequest());
        testeObject.setIp(testeDTO.getIp());
        testeObject.setDate(testeDTO.convertStringToData(testeDTO.getData()));

        logDao.adicionaLog(testeObject);
        result.redirectTo(this).form();
    }

    @Post("/upload/soap")
    public void uploadArquivoLog(@Valid UploadedFile log) throws Exception {
        validator.onErrorRedirectTo(this).index();
        arquivoTeste.uploadDeLog(log);
        salvarArquivoLog.lerESalvarLog();
        result.redirectTo(this).index();
    }

    //condigo funcionando
    @Path("/logs/json")
    public void jsonLogDataTable(int iDisplayLength, int iDisplayStart, int iSortCol_0, String sSortDir_0, String sSearch){
        TabelaTesteVO tabelaLog = new TabelaTesteVO();
        List<TesteObject> aaData = logDao.listaLogs(iDisplayStart, iDisplayLength, iSortCol_0, sSortDir_0, sSearch);
        tabelaLog.setAaData(aaData);
        tabelaLog.setsEcho(Integer.parseInt(request.getParameter("sEcho")));
        tabelaLog.setiTotalRecords(logDao.contarLogs());
        tabelaLog.setiTotalDisplayRecords(logDao.contarLogs());
        result.use(Results.json()).withoutRoot().from(tabelaLog).include("aaData").serialize();
    }
}


package br.com.soap.utils;

import br.com.soap.dao.LogDao;
import br.com.soap.modelos.TesteObject;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Stateless
public class SalvarArquivoLogBD {

    @Inject
    private LogDao logDao;

    public void lerESalvarLog() throws Exception {

        List<TesteObject> testeObjects = new ArrayList<>();
        String txt = null;
        String colunas[] = null;
        Date date = null;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        File caminho = new File("C:\\Users\\Jefferson\\Documents\\Intelij\\Workspace\\logProject\\src\\main\\resources\\arquivoLog\\arquivo.soap"); //serviço
//        File caminho = new File("C:\\Users\\JeffRapha\\Documents\\intelij\\workspace\\logProject\\src\\main\\resources\\arquivoLog\\arquivo.soap");
        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(caminho)));

        while ((txt = reader.readLine()) != null) {

            TesteObject testeObject = new TesteObject();
            colunas = txt.split("\\|");
            date = format.parse(colunas[0]);

            testeObject.setDate(date);
            testeObject.setIp(colunas[1]);
            testeObject.setRequest(colunas[2]);
            Integer status = Integer.parseInt(colunas[3]);
            testeObject.setStatus(status);
            testeObject.setUserAgent(colunas[4]);

            testeObjects.add(testeObject);
        }
        reader.close();

        logDao.adicionaListaLogs(testeObjects);
    }
}








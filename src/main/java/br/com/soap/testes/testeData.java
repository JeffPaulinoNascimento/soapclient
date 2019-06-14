package br.com.soap.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testeData {

    public static void main(String args[]) throws ParseException {

        //2019-08-12 00:00:11.763

        String data = "2019-08-12 00:00:11.763";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        Date date = format.parse(data);

        System.out.println(format.parse(data));


    }
}

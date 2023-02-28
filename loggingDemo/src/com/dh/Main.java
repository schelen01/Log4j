package com.dh;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class); //muda para MAIN
    public static void main(String[] args){
        //Se surgir o erro, traçamos o Try Catch para o sistema saber o que precisa ser feito
        try {
            ListaMedia listaMaior5 = new ListaMedia(Arrays.asList(1,2,3,4,5,6));
            ListaMedia listaMaior10 =new ListaMedia(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
            int listaMedia = new ListaMedia(Arrays.asList(1,2,3,4,5)).media();
            //int porque terá que retornar um valor inteiro
            ListaMedia listaVazia = new ListaMedia(Arrays.asList());


        } catch (Exception e){
            logger.info("A lista é igual a zero", e);
        //mostra o erro
        }
    }
}
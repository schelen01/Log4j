package com.dh;

//Verifique se import está certo, tem que ser log4j
import org.apache.log4j.Logger;

import java.util.List;

public class ListaMedia {
    private static final Logger logger = Logger.getLogger(ListaMedia.class);

    //Lista média não será estático
    private List<Integer> lista;

    public ListaMedia(List<Integer> lista) throws Exception{
        this.lista =lista;
        compararLista(lista);
    }

    private void compararLista(List<Integer> inteiros) throws Exception {
        //verificar o tamanho da lista
        if(inteiros.size() > 5 && inteiros.size() < 10){
            logger.info("O comprimento da lista é maior que 5");
        }

        if (inteiros.size() > 10){
            logger.info("O comprimento da lista é maior que 10");
        }

        if (inteiros.size() == 0){
            throw new Exception();
        }
    }

    //Criar método MEDIA
    public int media(){
        //toda vez passará a variável pela média e receberá a soma de todos os inteiros, guardando dentro da lista..
        int soma =0;
        for(Integer inteiro: lista){
            soma = soma + inteiro;

        }
        //..e posteriormente dividirá para chegar na média
        int media = soma / lista.size();
        logger.info("A media da lista é: " + media);
        return media;

    }

}

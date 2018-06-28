package main.java;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.simiao on 17/05/2018.
 */
public class TestSiteNbaProcedural {
    public static void main(String[] args) {

        //Variaveis
        String nomeProduto = "tenis_jordan_15";
        String nomeProdutoPdp = "tenis_jordan_15";
        nomeProduto.equals(nomeProdutoPdp);
        int percDesconto = 10;
        boolean promo = true;
        BigDecimal precoTotalCart = new BigDecimal(10);
        BigDecimal precoTotalPdp = new BigDecimal(0);

        //Operações e Comparações

        //Coleções
        List<String> cores = new ArrayList<>();
        cores.add("AZUL");
        cores.add("VERMELHO");
        cores.add("PRETO");
        cores.add("VERDE");
        cores.add("AMARELO");

        int[] acessos = new int[6];
        acessos[0] = 798;
        acessos[1] = 423;
        acessos[2] = 345;
        acessos[3] = 543;
        acessos[4] = 666;
        acessos[5] = 123;

        //Estruturas Condicionais
        if (precoTotalPdp.equals(precoTotalCart)){
            System.out.println("teste falhou");
        }else{
            System.out.println("teste passou");
        }

        String siteAtual = "mobile";
        switch (siteAtual){
            case "desk":
                System.out.println("Testando versão Desktop");
                break;
            case "mobile":
                System.out.println("Testando versão Mobile");
                break;
            case "app":
                System.out.println("Testando versão App");
                break;
            default:
                System.out.println("Versão não identificada");
        }

        //Estruturas de Repetição
        for (int i = 0; i < acessos.length; i++) {
            System.out.println(acessos[i]);
        }

        //foreach
        for (String cor: cores) {
            System.out.println(cor);
            if (cor.equals("PRETO")){
                System.out.println("sou da cor:" + cor);
                break;
            }
        }

        boolean achei;
        do {
            achei = false;
        }while (achei==true);

        //Classes
        //Métodos
        //Objetos
        //Modificadores de Acesso
        //Framework
    }

}

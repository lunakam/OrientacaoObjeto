package main.java;

import main.java.models.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.simiao on 21/05/2018.
 */
public class FuncionalidadeSiteNba {
    Produto tenis = new Produto();

    public FuncionalidadeSiteNba(){
        tenis.setNomeProdutoCart("Nike15");
        tenis.setNomeProdutoPdp("Nike15");
        tenis.setPercDesconto(15);
        tenis.setPrecoTotalCart(new BigDecimal(1500));

        List<String> cores = new ArrayList<>();
        cores.add("AZUL");
        cores.add("VERMELHO");
        cores.add("PRETO");
        cores.add("VERDE");
        cores.add("AMARELO");

        tenis.setCores(cores);
    }

    public void testaNomePdpXnomeCart(){
        String nomeProdPdp = tenis.getNomeProdutoPdp();
        String nomeProdCart = tenis.getNomeProdutoCart();

        if(!nomeProdPdp.equalsIgnoreCase(nomeProdCart)){
            System.out.println("Test FAILED : Nome do produto na PDP não corresponde ao nome do produto no carrinho");
        }else{
            System.out.println("Test PASSED : Nome do produto na PDP corresponde ao nome do produto no carrinho");
        }

    }

    public void testaTamanhoDisponivel(int tamanho){
        boolean find = false;
        for (int tenisTam : tenis.getTamanhos()) {
            if(tamanho==tenisTam)
                find = true;
        }

        if (find){
            System.out.println("Test PASSED : Tamanho verificado é exibido como Disponivel na pagina.");
        }else{
            System.out.println("Test FAILED : Tamanho verificado NÃO é exibido na pagina.");
        }
    }

    public void testaCorDisponivel(String cor){
        boolean achei =false;
        for (String tenisCor : tenis.getCores()) {
            if(cor.equalsIgnoreCase(tenisCor)){
                achei =true;
            }
        }

        if (achei){
            System.out.println("Test PASSED :  Cor "+cor+" verificado é exibida como Disponivel` na pagina.");

        }else{
            System.out.println("Test FAILED : Cor "+cor+" verificado `NÃO` é exibida na pagina.");
        }
    }
}

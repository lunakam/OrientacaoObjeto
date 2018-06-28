package main.java.models.Exercicio1Mari;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FuncionalidadesBota {
    ProdutoBota bota = new ProdutoBota();

    public FuncionalidadesBota() {
        bota.setNomeProdutoCart("Bota Cano Curto com Fivela e Pêlo");
        bota.setNomeProdutoPdp("Bota Cano Curto com Fivela e Pêlo");
        bota.setPrecoCart(new BigDecimal(25000));
        bota.isPersona();

        List<String> cores = new ArrayList<>();
        cores.add("CINZA");
        cores.add("BEJE");
        cores.add("DOURADO");
        cores.add("PRETO");

        bota.setCor(cores);

        List<Integer> tamanhos = new ArrayList<>();
        tamanhos.add(33);
        tamanhos.add(34);
        tamanhos.add(35);

    }

    public void testaNomePdpXnomeCart() {

        if (bota.getNomeProdutoCart() == bota.getNomeProdutoPdp()) {
            System.out.println("Test FAILED : Nome do produto na PDP não corresponde ao nome do produto no carrinho");
        } else {
            System.out.println("Test PASSED : Nome do produto na PDP corresponde ao nome do produto no carrinho");
        }

    }

    public void testaTamanhoDisponivel(int tamanho) {
        boolean find = false;
        for (int tenisTam : bota.getTamanho()) {
            if (tamanho == tenisTam)
                find = true;
        }

        if (find) {
            System.out.println("Test PASSED : Tamanho verificado é exibido como Disponivel na pagina.");
        } else {
            System.out.println("Test FAILED : Tamanho verificado NÃO é exibido na pagina.");
        }
    }

    public void testaCorDisponivel(String cor) {
        boolean achei = false;
        for (String tenisCor : bota.getCor()) {
            if (cor.equalsIgnoreCase(tenisCor)) {
                achei = true;
            }
        }

        if (achei) {
            System.out.println("Test PASSED :  Cor " + cor + " verificado é exibida como Disponivel` na pagina.");

        } else {
            System.out.println("Test FAILED : Cor " + cor + " verificado `NÃO` é exibida na pagina.");
        }
    }

    public void testaPersonalizacao(boolean ispersona) {
        if (ispersona = true) {
            bota.setNomePersona("Marialine");
            bota.setNumPersona(12);
            System.out.println("Test PASSED :  Produto persona configurado com sucesso, nome persona: " + bota.getNomePersona() + " , numero person: " + bota.getNumPersona());
        } else {
            System.out.println("Test FAILED : Produto persona configurado com erro");
        }
    }
}
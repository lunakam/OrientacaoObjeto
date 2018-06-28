package main.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import main.java.models.Produto;

public class FuncionalidadeNetshoes {
    Produto tenis = new Produto();

    public FuncionalidadeNetshoes() {
        this.tenis.setNomeProdutoCart("Sapatênis Cavalera Jill");
        this.tenis.setNomeProdutoPdp("Sapatênis Couro Cavalera Jill Masculino - Marinho");
        this.tenis.setPercDesconto(15);
        this.tenis.setPrecoTotalCart(new BigDecimal(129.90));
        List cores = new ArrayList();
        cores.add("PRETO");
        cores.add("MARINHO");
        cores.add("OFF WHITE");
        this.tenis.setCores(cores);
    }

    public void testaNomePdpXnomeCart() {
        String nomeProdutoPdp = this.tenis.getNomeProdPdp();
        String nomeProdutoCart = this.tenis.getNomeProdCart();

        if (!nomeProdutoPdp.equalsIgnoreCase(nomeProdutoCart)) {
            System.out.println("Test FAILED : Nome do produto na PDP não corresponde ao nome do produto no carrinho");
        } else {
            System.out.println("Test PASSED : Nome do produto na PDP corresponde ao nome do produto no carrinho");
        }

        public void testaTamanhoDisponivel ( int tamanho){
            boolean find = false;
            Iterator var3 = this.tenis.getTamanhos().iterator();
        }

        while (var3.hasNext()) {
            int tenisTam = (Integer) var3.next();
            if (tamanho == tenisTam) {
                find = true;
            }
        }
        if (find) {
            System.out.println("Test PASSED : Tamanho verificado é exibido como Disponível na página.");
        } else {
            System.out.println("Test FAILED : Tamanho verificado NÃO é exibido na página.");
        }

        public void testaCorDisponivel(String cor) {
            boolean achei = false;
            Iterator var3 = this.tenis.getCores().iterator();

            while (var3.hasNext()) {
                String tenisCor = (String) var3.next();
                if (cor.equalsIgnoreCase(tenisCor)) {
                    achei = true;
        }
    }

            if (achei){
                System.out.println("Test PASSED :  Cor " + cor + " verificada é exibida como Disponível` na pagina.");
            } else {
                System.out.println("Test FAILED : Cor " + cor + " verificada `NÃO` é exibida na página.");
            }
    }
}

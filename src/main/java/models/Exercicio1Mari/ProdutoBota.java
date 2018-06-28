package main.java.models.Exercicio1Mari;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProdutoBota {
    private String nomeProdutoCart;
    private String nomeProdutoPdp;
    private boolean persona;
    private String nomePersona;
    private int numPersona;
    private BigDecimal precoCart = new BigDecimal(0);
    private BigDecimal precoPdp = new BigDecimal(0);
    private List<String> cor = new ArrayList<>();
    private List<Integer> tamanho = new ArrayList<>();


    //define os nomes do produto
    public String getNomeProdutoCart() {
        return nomeProdutoCart;
    }

    public void setNomeProdutoCart(String nomeProdutoCart) {
        this.nomeProdutoCart = nomeProdutoCart;
    }

    public String getNomeProdutoPdp() {
        return nomeProdutoPdp;
    }

    public void setNomeProdutoPdp(String nomeProdutoPdp) {
        this.nomeProdutoPdp = nomeProdutoPdp;
    }

    //define se tem persona
    public boolean isPersona() {
        return persona;
    }

    public void setPersona(boolean persona) {
        this.persona = persona;
    }

    //define as personas
    public String getNomePersona() {
        return nomePersona;
    }

    public void setNomePersona(String nomePersona) {
        this.nomePersona = nomePersona;
    }

    public int getNumPersona() {
        return numPersona;
    }

    public void setNumPersona(int numPersona) {
        this.numPersona = numPersona;
    }

    //define o preço do produto
    public BigDecimal getPrecoCart() {
        return precoCart;
    }

    public void setPrecoCart(BigDecimal precoTotalCart) {
        this.precoCart = precoTotalCart;
    }

    public BigDecimal getPrecoPdp() {
        return precoPdp;
    }

    public void setPrecoPdp(BigDecimal precoPdp) {
        this.precoPdp = precoPdp;
    }

    //define a cor
    public List<String> getCor() {
        return cor;
    }

    public void setCor(List<String> cor) {
        this.cor = cor;
    }

    //define o tamanho
    public List<Integer> getTamanho() {
        return tamanho;
    }

}

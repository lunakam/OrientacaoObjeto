package main.java;

import main.java.models.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.simiao on 21/05/2018.
 */
public class TesteSiteObj {
    public static void main(String[] args) {

        FuncionalidadeSiteNba testeSiteNbaObj = new FuncionalidadeSiteNba();

        testeSiteNbaObj.testaCorDisponivel("vermelho");
        testeSiteNbaObj.testaNomePdpXnomeCart();
        testeSiteNbaObj.testaTamanhoDisponivel(45);


    }
}

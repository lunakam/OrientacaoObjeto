public class TestSite {
    public TestSite(){
        }

    public static void main(String[] args) {
        FuncionalidadeNetshoes TestSiteObj = new FuncionalidadeNetshoes();
        TestSiteObj.testaCorDisponivel("vermelho");
        TestSiteObj.testaNomePdpXnomeCart();
        TestSiteObj.testaTamanhoDisponivel(45);
    }
}

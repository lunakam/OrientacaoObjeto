import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**@author Talita Primo
 * @since 2018-05-24
 */

public class TesteComparaPdpXcart {
    public static void main(String[] args) {
        String nomeProdutoCart = "Sapatênis Cavalera Jill";
        String nomeProdutoPdp = "Sapatênis Couro Cavalera Jill Masculino - Marinho";
        boolean percDesconto = true;
        boolean promo = true;
        BigDecimal precoTotalCart = new BigDecimal(129.90);
        BigDecimal precoTotalPdp = new BigDecimal(249.90);
        List cores = new ArrayList();
        cores.add("PRETO");
        cores.add("MARINHO");
        cores.add("OFF WHITE");
        int[] acessos = new int[10];
        acessos[0] = 798;
        acessos[1] = 423;
        acessos[2] = 435;
        acessos[3] = 543;

        if (precoTotalPdp.equals(precoTotalCart)){
            System.out.println("Teste Passou!");
        }
        else {
            System.out.println("Teste Falhou!");
        }

        String siteAtual = "Mobile";
        byte var11 = -1;
        switch (siteAtual.hashCode()){
            case -1068855134:
                if (siteAtual.equals("Mobile")){
                    var11=1;
                }
                break;
            case 96801:
                if (siteAtual.equals("App")) {
                    var11 = 2;
                }
                break;
            case 3079833:
                        if (siteAtual.equals("Desk")){
                            var11=0;
                        }
                }

         switch (var11) {
             case 0:
                 System.out.println("Testando versão Desktop");
                 break;
             case 1:
                 System.out.println("Testando versão Mobile");
                 break;
             case 2:
                 System.out.println("Testando versão App");
                 break;
             default:
                 System.out.println("Versão não identificada");
        }

        for (int i = 0; i< acessos.length; ++i ){
            ++acessos[i];
        }

        Iterator var12 = cores.iterator();

        while (var12.hasNext()){
            String cor = (String)var12.next();
            System.out.println(cor);
        }

        boolean achei;
        do {
            achei = false;
        } while (achei);
    }
}

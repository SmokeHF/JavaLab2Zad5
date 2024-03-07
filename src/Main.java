import java.math.BigDecimal;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double netto=9.99;
        double brutto=netto*1.23;
        double bruttoMultiple=brutto*1000;
        double nettoMultiple=bruttoMultiple/1.23;
        System.out.println("netto: "+netto);
        System.out.println("brutto: "+brutto);
        System.out.println("brutto 1000 items: "+bruttoMultiple);
        System.out.println("netto 1000 items: "+nettoMultiple);

        BigDecimal bdNetto=BigDecimal.valueOf(netto);
        BigDecimal bdVat=new BigDecimal("1.23");
        BigDecimal bdBrutto=bdNetto.multiply(bdVat);
        BigDecimal bdBruttoMultiple=bdBrutto.multiply(BigDecimal.valueOf(1000));
        BigDecimal bdNettoMultiple=bdBruttoMultiple.divide(bdVat);
        System.out.println("BigDecimal netto: "+bdNetto);
        System.out.println("BigDecimal brutto: "+bdBrutto);
        System.out.println("BigDecimal brutto 1000 items: "+bdBruttoMultiple);
        System.out.println("BigDecimal netto 1000 items: "+bdNettoMultiple);
    }
}
import java.text.DecimalFormat;
public class CalculoIOF {
public static void main (String []args){
    double valor = 8711.77;
    double impostoIOF = valor * (6.38 / 100);

    DecimalFormat formatador = new DecimalFormat();
    formatador.applyPattern("R$ #,##0.00");

    System.out.println();
    System.out.println(formatador.format(impostoIOF));
}
}
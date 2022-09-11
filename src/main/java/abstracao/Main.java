package abstracao;

public class Main {

    public static void main(String[] args) {

        System.out.println("------- CONTA CORRENTE -------");
        ContaCorrente ccKamila = new ContaCorrente();
        ccKamila.consultarSaldo();
        ccKamila.transferirValor();
        System.out.println("\n");


        System.out.println("------- CONTA POUPANÇA -------");
        ContaPoupanca cpKamila = new ContaPoupanca();
        cpKamila.consultarSaldo();
        cpKamila.transferirValor();



    }
}

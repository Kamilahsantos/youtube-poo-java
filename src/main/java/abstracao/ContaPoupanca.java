package abstracao;

class ContaPoupanca extends Conta {

    public void consultarSaldo() {

        System.out.println("o saldo da sua conta poupança é 1234 ");
    }

    public void transferirValor() {
        System.out.println("no momento essa funcionalidade está indisponivel para contas poupança, tente novamente mais tarde");

    }

}

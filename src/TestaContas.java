public class TestaContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        cc.setTipo("conta corrente");
        cp.setTipo("conta poupança");
        c.setTipo("conta simples");

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        AtualizadorDeContas adc = new AtualizadorDeContas(0.1);

        adc.roda(c);

        adc.roda(cc);
        adc.roda(cp);
        System.out.println("Saldo Total: " + adc.getSaldoTotal());

        Banco b = new Banco();
        b.adiciona(c);
        b.adiciona(cc);
        b.adiciona(cp);
        b.pegaConta(0);
        b.pegaConta(1);
        b.pegaConta(2);
        b.pegaTotalDeContas();


    }
}

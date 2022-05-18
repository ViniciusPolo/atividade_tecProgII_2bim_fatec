public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    public void roda(Conta c){
        System.out.println(c.saldo);
        c.saldo += c.saldo * this.selic;
        System.out.println(c.saldo);
        setSaldoTotal(c.saldo + getSaldoTotal());

    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }
}

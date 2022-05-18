public class Conta {
    //Atríbutos
    protected String tipo;
    protected double saldo;

    //Métodos
    public void deposita(double valor){
        this.saldo+=valor;
    }
    public void saca(double valor){
        this.saldo-=valor;
    }
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }

    //Getters
    public double getSaldo() {
        return this.saldo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

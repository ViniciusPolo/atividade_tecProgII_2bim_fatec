import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;
    private int contadorDeContas = 0;

     Banco() {
        contas = new ArrayList<Conta>();
    }

    public void adiciona(Conta c){
         this.contas.add(c);
         contadorDeContas++;
    }
    public void pegaConta(int i){
        Conta contaSelecionada = this.contas.get(i);
        System.out.println(contaSelecionada.getTipo());
    }

    public void pegaTotalDeContas(){
        System.out.println("Total de Contas: " + contadorDeContas);
    }



}

public class ContaBancariaSimplificada {

    private String nomeCorrentista;
    private float saldo;
    final boolean especial = false;

    public ContaBancariaSimplificada(String nomeCorrentista, float saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public String getNomeCorrentista(){
        return nomeCorrentista;
    }
    public void setNomeCorrentista(String nomeCorrentista){
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public void deposita(float valor){
        saldo += valor;
        System.out.println("Saldo atual: " + saldo);
    }

    public boolean saca(float valor){
        if(especial == false){
            if(valor <= saldo){
                saldo -= valor;
                return true;
            }else{
                return false;
            }
        }else{
            saldo -= valor;
            return true;
        }
    }

    public boolean transfere(ContaBancariaSimplificada saida, ContaBancariaSimplificada destino, float valor){
        if(saida.getSaldo() >= valor){
            saida.setSaldo(saida.getSaldo()- valor);
            destino.setSaldo(destino.getSaldo()+ valor);

            return true;
        }else{
            return false;
        }
    }
}


public class Main {
    public static void main(String[] args){
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada("Gustavo", 500);
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("Bia", 1000);


        conta1.transfere(conta1, conta2, 200);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        if(conta1.transfere(conta1, conta2, 150) == true){
            System.out.println("Trasferencia ocorrida com sucesso! ");
            System.out.println("Saldo atual: " + conta1.getSaldo());
        }else{
            System.out.println("Transferencia falhou, saldo insuficiente!");
        }
    }
}

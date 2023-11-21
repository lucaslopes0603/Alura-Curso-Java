import java.util.Scanner;
import java.util.Random;

public class ContaBancaria {
    public static void main(String[] args) {
        System.out.println("Digite os dados inicias do cliente: ");
        System.out.println("Digite o seu nome: ");
        Scanner scr = new Scanner(System.in);
        String nome = scr.nextLine();
        System.out.println("Digite seu tipo de conta: ");
        String conta = scr.nextLine();
        int contador = 0;
        while(contador!=4){
        if(conta.equalsIgnoreCase("salario")){
            contador = 4;
        } else if (conta.equalsIgnoreCase("corrente")) {
            contador = 4;
        }
        else if(conta.equalsIgnoreCase("poupanca")){
           contador = 4;
        }
        else{
            System.out.println("Tipo de conta não existente: Digite 'salario','corrente','poupança'");
            System.out.println("Digite seu tipo de conta: ");
            conta = scr.nextLine();
        }


    }

        int saldoInicial = new Random().nextInt(1000000);
        System.out.println("Seu nome : "+nome);
        System.out.println("Sua conta :"+conta);
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        int operacao = scr.nextInt();

        while(operacao!=4){
        if(operacao == 1){
            System.out.println("Seu saldo : R$"+saldoInicial);
        }else if(operacao == 2){
            System.out.println("Digite o valor para receber no saldo: ");
            int mais = scr.nextInt();
            saldoInicial+= mais;
        }
        else if(operacao == 3){
            System.out.println("Digite o valor que quer transfeiri: ");
            int tranferir = scr.nextInt();
            if(tranferir>saldoInicial){
                System.out.println("Saldo nao disponivel");
            }else{
                saldoInicial-=tranferir;
            }
        }else{
            System.out.println("Erro: Digitar outro numero");
        }

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            operacao = scr.nextInt();
        }




}
}

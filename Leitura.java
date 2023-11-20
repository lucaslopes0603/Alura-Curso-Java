import java.util.Scanner;
import java.util.Random;
public class Leitura {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int contador = 4;
        int valor = 0;
        int numeroAleatorio = new Random().nextInt(100);
        for(int i = 0;i<=contador;i++){
            System.out.println("Digite um Numero : ");
            valor = scr.nextInt();
            if(valor == numeroAleatorio){
                System.out.println("Meus parabens você acertou o numero");
                break;
            }
            if(valor < numeroAleatorio){
                System.out.println("O número que você quer encontrar eh maior que o digitado");
            }
            if(valor > numeroAleatorio){
                System.out.println("O número que você quer encontrar eh menor que o digitado");
            }

}if(valor!=numeroAleatorio){
            System.out.println("Não foi dessa vez!");}
    }
}

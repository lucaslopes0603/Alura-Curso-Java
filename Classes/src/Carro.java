public class Carro {
    String modelo;
    int ano;
    String cor;
    void exibirFicha(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
    }
    int calcularAno(){
        return 2023 - ano;
    }
}

public class Main {
    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa();
       pessoa.Exibir();
        Calculadora calculo = new Calculadora();
        System.out.println(calculo.mutiplicar(5));
        Musica minha = new Musica();
        minha.artista="LilGiela33";
        minha.titulo="Amigos";
        minha.anoDeLancamento=2022;
        minha.Avaliar(9);
        minha.Avaliar(8.5);
        minha.Avaliar(10);
        System.out.println("Media de Avaliaçoes: "+minha.MediaAvaliacao());
        minha.exibeFichaTecnica();
        Carro honda = new Carro();
        honda.modelo="Picape";
        honda.ano=2010;
        honda.cor="Vermelho";
        System.out.println("Quantos anos o carro tem: "+honda.calcularAno());
        honda.exibirFicha();
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Olavo";
        aluno1.idade = 21;
        aluno1.exibirInformacoes();


    }


}

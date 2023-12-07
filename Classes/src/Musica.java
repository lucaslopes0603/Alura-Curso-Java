public class Musica {
    String artista;
    String titulo;
    int anoDeLancamento;
    double somaAvaliacao;
    int numAvaliacao;

    void Avaliar(double avaliacao){
        somaAvaliacao+=avaliacao;
        numAvaliacao++;

    }
    double MediaAvaliacao(){
        return somaAvaliacao/numAvaliacao;

    }
    void exibeFichaTecnica(){
        System.out.println("Titulo da musica: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de Lançamento: "+anoDeLancamento);
        System.out.println("Soma de Avaliaçoes: "+somaAvaliacao);
        System.out.println("Numero de Avaliaçoes: "+numAvaliacao);
    }
}

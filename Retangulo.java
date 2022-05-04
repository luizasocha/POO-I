public class Retangulo {

    int altura;
    int largura;

    // Construtor
    public Retangulo(){

    }

    //Construtor com dois parâmetros
    public Retangulo(int novaAltura, int novaLargura){
        altura = novaAltura;
        largura = novaLargura;
    }

    // Método com retorno int
    public int calcularArea() {
        return altura * largura;
    }
}
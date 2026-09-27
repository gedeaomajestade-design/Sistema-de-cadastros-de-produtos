import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto(
                "Arroz", 18.99, 15
        );
        produto1.exibirInformacoes();

        Produto produto2 = new Produto("Feijão", 9.00, 22);

        produto2.exibirInformacoes();
        Produto produto3 =new Produto("Refrigerantes", 5.00, 100);
        produto3.exibirInformacoes();

        Produto produto4 = new Produto("Balinhas", 0.50, 200);
        produto4.exibirInformacoes();

    }
}
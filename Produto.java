public class Produto{
    String nome;
    double preco;
    int quantidade;
    public Produto (String nome, double preco, int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
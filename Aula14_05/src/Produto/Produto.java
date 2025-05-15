package Produto;

public class Produto {
    
    private String nome;
    private double preco;

    public String getNomeProduto(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setNomeProduto(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        if (preco > 0) {
            this.preco = preco;
        } else{
            System.out.println("valor invalido.");
        }
    }
}

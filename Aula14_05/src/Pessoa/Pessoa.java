package Pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    //pegando
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
        
    }
    //setando
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        } else{
            System.out.println("Idade invalida");
        }
    }

}
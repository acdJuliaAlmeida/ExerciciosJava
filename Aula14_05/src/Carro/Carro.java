package Carro;

public class Carro {
    //atributos mt massa
    String marca;
    String modelo;
    int ano;
    // tunando o carro
    private int velocidade = 0;

    //construindo o carro
    public Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //metodos uauu
    public String exibirinfo(){
        return "Marca: " + marca
              +"\nModelo: " + modelo
              +"\nAno: "+ ano;
    }

    //aplicando as leis de Newton

    public void acelerar(int velocidade){
        this.velocidade += velocidade;
    }
    
    public void Desacelerar(int velocidade) {
        if (this.velocidade - velocidade < 0) {
            this.velocidade = 0;
        } else {
            this.velocidade -= velocidade;
        }
    }

    //getando velocidade
    public int getVelocidade(){
        return this.velocidade;
    }

}

package Carro;

public class Carro {
    //atributos mt massa
    String marca;
    String modelo;
    int ano;

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
}

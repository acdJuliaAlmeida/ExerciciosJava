package Jogador;

public class Jogador {
    private String nome;
    private Integer vida;
    private Integer forca;

    public Jogador (String nome, Integer vida, Integer forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(Jogador jogador){
        jogador.vida -= this.forca;
        System.out.println(nome+" causa " + forca +" de dano à " + jogador.nome +"!");
    }
    public void mostrarStatus(){
        System.out.println(
            "\n"+ nome
            +"\nHP "+ vida
            +"\nForça " + forca);
    }



}

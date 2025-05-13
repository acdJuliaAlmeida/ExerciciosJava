package Lampada;

public class Lampada {
    //atribuições do objeto
    private String cor;
    private boolean ligada = false;

    //fabrica de luz
    public Lampada(String cor){
        this.cor = cor;
    }

    //possibilitando uma rave

    public void ligarLampada(){
        ligada = true;
    }

    public void desligarLampada(){
        ligada = false;
    }

    //mostrando a rave

    public String mostrarLampada(){
        return "A lampada " + cor + " está ligada? " + ligada;
    }


}

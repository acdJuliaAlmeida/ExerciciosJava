package Termometro;

public class Termometro {
    private double temperaturaCelsius;

    public double getTemperaturaCelsius(){
        return this.temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperatura){
        if (temperatura > -273.15) {
            this.temperaturaCelsius = temperatura;
        }else{
            System.out.println("Erro K.1848 - Temperatura não permitida pela regras atuais da física.");
        }
    }
}

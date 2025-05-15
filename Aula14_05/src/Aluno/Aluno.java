package Aluno;

public class Aluno {
    private String nome;
    private double nota;

    public double getNota(){
        return this.nota;
    }

    public void setNota(double nota){
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Valor invalido.");
        }
    }
    public boolean aprovado() {
        return this.nota >= 6;
    }

}

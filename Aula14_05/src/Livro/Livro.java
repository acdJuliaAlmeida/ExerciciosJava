package Livro;

public class Livro {

    private String titulo;
    private String autor;
    private double paginasLidas =0;
    private double totalPaginas;

    public Livro (String titulo, String autor, double totalPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
    }

    public void lerLivro(double paginas){
        if (totalPaginas > paginas) {
            this.paginasLidas += paginas;   
        } else{
            this.paginasLidas = totalPaginas;
        }
    }

    public double getPaginasLidas(){
        return this.paginasLidas;
    }

    public double progressoLeitura(){
        if (totalPaginas < paginasLidas) {
            this.paginasLidas = totalPaginas;
        }
        return ((this.paginasLidas/this.totalPaginas)* 100);
    }
    
}

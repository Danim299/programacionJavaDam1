package Ejercicio5OO;

public class Libro {
    private String titulo;
    private String autor;
    private int nEjemplares;
    private int nPrestados;
    
    public Libro(){
        this.titulo="NO";
        this.autor="NO";
        this.nEjemplares=0;
    }
    public Libro(String titulo, String autor, int nEjemplares, int nPrestados){
        this.titulo=titulo;
        this.autor=autor;
        this.nEjemplares=nEjemplares;
        this.nPrestados=nPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getnPrestados() {
        return nPrestados;
    }

    public void setnPrestados(int nPrestados) {
        this.nPrestados = nPrestados;
    }
    public boolean prestamo(int nEjemplares, int nPrestados){
        if(nEjemplares>=nPrestados){
            this.nPrestados++;
            return true;
        }else{
            return false;
        }
    }
    public boolean devolucion(int nPrestados){
        if(nPrestados>=0){
            this.nPrestados--;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro:" + "\ntitulo: " + titulo + "\nautor: " + autor + "\nnEjemplares: " + nEjemplares + "\nnPrestados: " + nPrestados;
    }
    
}

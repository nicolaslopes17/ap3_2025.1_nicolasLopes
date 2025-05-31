public class Livro {

    

    private String titulo;
    private String autor;
    private double preco;


public Livro(String titulo, String autor,double preco) { 
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
}


public String getTitulo() {
    return titulo;
}


public String getAutor() {
    return autor;
}


public double getPreco() {
    return preco;
}


public void setTitulo(String titulo) {
    this.titulo = titulo;
}


public void setAutor(String autor) {
    this.autor = autor;
}


public void setPreco(double preco) {
    this.preco = preco;
}

public String getPrecoFormatador(){
    java.text.DecimalFormat formartador = new java.text.DecimalFormat();
    formartador.applyPattern("R$ #,##0.00");
    return formartador.format(preco);
} 

@Override
    public String toString() {
        return "Livro [titulo= " + titulo + ", autor= " + autor + ", preco= " + getPrecoFormatador() + "]";
    }
}    

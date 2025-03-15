
package br.unifaj.java;
public class Serie {
    String titulo;
    String genero;
    String protagonista;
    int anoLancamento;

    int temporadas;

    public Serie() {
    }

    public Serie(String titulo, String genero, String protagonista, int anoLancamento, int temporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.protagonista = protagonista;
        this.anoLancamento = anoLancamento;
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", protagonista='" + protagonista + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", temporadas=" + temporadas +
                '}';
    }
}
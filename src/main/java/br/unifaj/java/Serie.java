
package br.unifaj.java;
public class Serie {
    private String titulo;
    private String genero;
    private String protagonista;
    private Integer anoLancamento;
    private Integer nTemporadas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(Integer nTemporadas) {
        this.nTemporadas = nTemporadas;
    }
}
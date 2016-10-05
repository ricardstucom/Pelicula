/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
 
/**
 *
 * @author usu26
 */
public class Pelicula {
    private String code;
    private String titulo;
    private String director;
    private String genero;
    private Double valoracion;
    private int duracion;
    private boolean visto;

    public Pelicula(String code, String titulo, String director, String genero, Double valoracion, int duracion, boolean visto) {
        this.code = code;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.valoracion = valoracion;
        this.duracion = duracion;
        this.visto = visto;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "code=" + code + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero + ", valoracion=" + valoracion + ", duracion=" + duracion + ", visto=" + visto + '}';
    }
    
    
    
    
}

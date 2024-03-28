package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // public void inclui(Filme f){
    //    this.tempoTotal += f.getDuracaoEmMinutos();
    //}

    //public void inclui(Serie s){
    //    this.tempoTotal += s.getDuracaoEmMinutos();
    //}

    // Abaixo criamos um método que temos uma classe que abrange os dois tipos: Uma super classe
    public void inclui(Titulo titulo){
        System.out.println("Adicionando a duração de minutos de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}

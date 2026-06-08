package br.com.cdl.moviehub.modelos;

public class Titulo {

    // atributos comuns a Filme e Serie
    private String nome;
    private int anoDeLancamento;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacoes;
    private boolean incluidoNoPlano;

    // ações comuns

    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        if (nota >= 0 && nota <= 10) {
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        } else {
            System.out.println("Nota inválida! Informe um valor entre 0 e 10.");
        }
    }

    public double pegaMedia() {
        if (totalDeAvaliacoes == 0) return 0;
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    // método que cada subclasse implementa do seu jeito
    public int getTotalEmMinutos() {
        return 0;
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        // ano de invenção do cinema: 1888
        if (anoDeLancamento > 1888) {
            this.anoDeLancamento = anoDeLancamento;
        } else {
            System.out.println("Ano de lançamento inválido!");
        }
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
}

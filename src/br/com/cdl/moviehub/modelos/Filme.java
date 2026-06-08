package br.com.cdl.moviehub.modelos;

public class Filme extends Titulo {

    // atributo exclusivo de Filme
    private int totalEmMinutos;

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica(); // aproveita o que já está em Titulo
        System.out.println("Duração em minutos: " + totalEmMinutos);
        System.out.println("Média de avaliações: " + pegaMedia());
    }

    @Override
    public int getTotalEmMinutos() {
        return totalEmMinutos;
    }

    public void setTotalEmMinutos(int totalEmMinutos) {
        // duração mínima de um filme: 1 minuto
        if (totalEmMinutos > 0) {
            this.totalEmMinutos = totalEmMinutos;
        } else {
            System.out.println("Duração do filme inválida!");
        }
    }
}

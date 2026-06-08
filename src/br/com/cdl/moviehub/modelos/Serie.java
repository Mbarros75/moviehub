package br.com.cdl.moviehub.modelos;

public class Serie extends Titulo {

    // atributos exclusivos de Serie
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica(); // aproveita o que já está em Titulo
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por temporada: " + episodiosPorTemporada);
        System.out.println("Minutos por episódio: " + minutosPorEpisodio);
        System.out.println("Duração total em minutos: " + getTotalEmMinutos());
        System.out.println("Média de avaliações: " + pegaMedia());
    }

    // calcula o total de minutos da série inteira
    @Override
    public int getTotalEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    // getters e setters

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        if (temporadas > 0) {
            this.temporadas = temporadas;
        } else {
            System.out.println("Número de temporadas inválido!");
        }
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        if (episodiosPorTemporada > 0) {
            this.episodiosPorTemporada = episodiosPorTemporada;
        } else {
            System.out.println("Número de episódios inválido!");
        }
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        if (minutosPorEpisodio > 0) {
            this.minutosPorEpisodio = minutosPorEpisodio;
        } else {
            System.out.println("Minutos por episódio inválido!");
        }
    }
}

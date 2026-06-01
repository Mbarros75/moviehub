public class Documentario extends Titulo {

    private int duracao; // em minutos

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public int calcularTempo() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Documentario: " + getNome() + " | Duração: " + duracao + " min";
    }
}

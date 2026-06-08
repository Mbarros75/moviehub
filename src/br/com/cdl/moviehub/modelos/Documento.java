package br.com.cdl.moviehub.modelos;
 
public class Documentario extends Titulo {
 
    // atributos exclusivos de Documentario
    private String diretor;
    private String tematica;        // ex: "Natureza", "Historia", "Ciencia"
    private int totalEmMinutos;
    private boolean baseadoEmFatos;
 
    // ações
 
    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Diretor: " + diretor);
        System.out.println("Temática: " + tematica);
        System.out.println("Duração em minutos: " + totalEmMinutos);
        System.out.println("Baseado em fatos reais: " + (baseadoEmFatos ? "Sim" : "Não"));
        System.out.println("Média de avaliações: " + pegaMedia());
    }
 
    @Override
    public int getTotalEmMinutos() {
        return totalEmMinutos;
    }
 
    public void setTotalEmMinutos(int totalEmMinutos) {
        if (totalEmMinutos > 0) {
            this.totalEmMinutos = totalEmMinutos;
        } else {
            System.out.println("Duração do documentário inválida!");
        }
    }
 
    // getters e setters
 
    public String getDiretor() {
        return diretor;
    }
 
    public void setDiretor(String diretor) {
        if (diretor != null && !diretor.isBlank()) {
            this.diretor = diretor;
        } else {
            System.out.println("Nome do diretor inválido!");
        }
    }
 
    public String getTematica() {
        return tematica;
    }
 
    public void setTematica(String tematica) {
        if (tematica != null && !tematica.isBlank()) {
            this.tematica = tematica;
        } else {
            System.out.println("Temática inválida!");
        }
    }
 
    public boolean isBaseadoEmFatos() {
        return baseadoEmFatos;
    }
 
    public void setBaseadoEmFatos(boolean baseadoEmFatos) {
        this.baseadoEmFatos = baseadoEmFatos;
    }
}

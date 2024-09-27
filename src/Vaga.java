import jdk.jfr.Experimental;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Vaga {
    private String titulo;
    private List<Candidato> candidados;
    private List<String> competenciasNecessarias;

    public Vaga(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.candidados = new ArrayList<Candidato>();
        this.competenciasNecessarias = new ArrayList<String>();
    }

    public Vaga(String titulo, String descricao, List<String> competenciasNecessarias) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.candidados = new ArrayList<Candidato>();
        this.competenciasNecessarias = competenciasNecessarias;
    }

    public Vaga() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Candidato> getCandidados() {
        return candidados;
    }

    public List<String> getCompetenciasNecessarias() {
        return competenciasNecessarias;
    }

    protected void candidatar(Candidato candidato) throws Exception {
        if(this.candidados.contains(candidato)) {
            throw new Exception("Candidato já está inscrito nesta vaga.");
        }
        this.candidados.add(candidato);
        System.out.println("Novo candidato a vaga de " + this.titulo + ": " + candidato.getNome());
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCandidados(List<Candidato> candidados) {
        this.candidados = candidados;
    }

    public void setCompetenciasNecessarias(List<String> competenciasNecessarias) {
        this.competenciasNecessarias = competenciasNecessarias;
    }

    public List<Candidato> filtrarCandidatos() {
        List<Candidato> candidatosQualificados = new ArrayList<Candidato>();
        for (Candidato candidato: this.candidados) {
            if (candidato.getCompetencias().containsAll(this.competenciasNecessarias)) {
                candidatosQualificados.add(candidato);
            }
        }
        return candidatosQualificados;
    }

    @Override
    public String toString() {
        return "Vaga " + titulo + "-> Nº Candidatos: "+ candidados.size();
    }
}

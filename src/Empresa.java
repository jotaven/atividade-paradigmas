import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Vaga> vagas;

    public Empresa(String nome) {
        this.nome = nome;
        this.vagas = new ArrayList<>();
    }

    public Empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    public void adicionarVaga(Vaga vaga) {
        this.vagas.add(vaga);
        System.out.println("A vaga " + vaga.getTitulo() + " foi crada!");
    }

    public List<Vaga> getVagas() {
        return this.vagas;
    }

    public Vaga getVaga(String tituloVaga) {
        for (Vaga vaga: this.vagas) {
            if(vaga.getTitulo().equals(tituloVaga)) {
                return vaga;
            }
        }
        System.out.println("Vaga não encontrada, retornando null!!!");
        return null;
    }

    public void listarVagas() {
        System.out.println("Vagas disponíveis: ");
        for(Vaga vaga: vagas) {
            System.out.println("\t" + vaga.getTitulo());
        }
    }
}

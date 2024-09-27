import java.util.List;

public class Candidato implements Pessoa {
    private String name;
    private String email;
    private List<String> competencias;

    public Candidato() {
    }

    public Candidato(String name, String email, List<String> competencias) {
        this.name = name;
        this.email = email;
        this.competencias = competencias;
    }

    @Override
    public String getNome() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public List<String> getCompetencias() {
        return competencias;
    }

    @Override
    public String toString() {
        return name;
    }
}

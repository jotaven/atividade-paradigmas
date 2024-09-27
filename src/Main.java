import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//      1. Cadastre uma empresa.
        Empresa google = new Empresa("Google");
        System.out.println("Empresa " + google.getNome() + " Criada");
//      2. Cadastre vagas para a empresa.
        google.adicionarVaga(new Vaga("Devops", "", new ArrayList<>(List.of("Terraform", "Kubernetes", "Ansible"))));
        google.adicionarVaga(new Vaga("2", ""));
        google.adicionarVaga(new Vaga("3", ""));
        Vaga devops = google.getVaga("Devops");
//      3. Cadastre candidatos com suas respectivas competências.
        Candidato c1 = new Candidato("João", "1@123.com", new ArrayList<>(List.of("Terraform", "Kubernetes", "Ansible", "Linux")));
        Candidato c2 = new Candidato("Luiz", "2@123.com", new ArrayList<>(List.of("Kubernetes", "Ansible", "Linux", "Dotnet")));
        Candidato c3 = new Candidato("Pedro", "3@123.com", new ArrayList<>(List.of("Python", "Terraform", "Kubernetes", "Ansible")));

//      4. Associe candidatos a vagas.
        devops.candidatar(c1);
        devops.candidatar(c2);
        devops.candidatar(c3);

        System.out.println("Vagas disponíveis na " + google.getNome());
        for(Vaga vaga: google.getVagas()) {
            System.out.println("\t- " + vaga);
        }

//        5. Liste os candidatos que atendem às competências necessárias para uma
//        vaga específica.
        System.out.println("Candidatos que atendem às competências necessárias para a vaga devops:");
        for(Candidato candidato: devops.filtrarCandidatos()) {
            System.out.println("\t- " + candidato);
        }
    }
}

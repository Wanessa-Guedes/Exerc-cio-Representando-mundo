public class App {
    public static void main(String[] args) throws Exception {
        Disciplina disciplina1 = new Disciplina();

        disciplina1.setNome("Matemática");
        disciplina1.setArea("Exatas");
        disciplina1.setDificuldade("Iniciante");
        disciplina1.materias.nome = "Conjuntos Numéricos";
        disciplina1.materias.qteAulas = 3;
        disciplina1.materias.qteExercicios = 10;

        System.out.println("A área de " + disciplina1.getArea() +
                " conta com " + disciplina1.getNome() + " do nível "
                + disciplina1.getDificuldade() + " ...");
        System.out.println("Dessa área a matéria " + disciplina1.materias.nome + " possui "
                + disciplina1.materias.qteAulas + " aulas e um total de "
                + disciplina1.materias.qteExercicios + " exercícios.");

    }
}

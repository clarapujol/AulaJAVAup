package POO.ExEscola;

public class Main {
    public static void main (String[] args){
        Aluno a = new Aluno("Maria");
        a.estudar(); // herdado de Pessoa
        a.apresentar(); // próprio de Aluno

        Professor p = new Professor("Junin");
        p.aplicarAula(); // herdado de Pessoa
        p.apresentar(); // próprio de Professor

        Diretor d = new Diretor("João");
        d.chamarReuniao();
        d.apresentar();



    }
}

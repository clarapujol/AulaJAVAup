package PastaAula1803;

public class MainAluno {

    public static void main(String[] args){

        Aluno a = new Aluno("Thor", "AL1", 3.5f, 9.9f);
        Aluno outroAluno = new Aluno("Maria", "AL2", 7.7f, 1.5f);

        a.calcularEMostrarMedia();
        outroAluno.calcularEMostrarMedia();

//        a.nome = "Joao";
//        a.matricula = "321";
//        a.nota1 = 3.5f;
//        a.nota2 = 9.9f;
//
//        outroAluno.nome = "Maria";
//        outroAluno.matricula = "123";
//        outroAluno.nota1 = 7.7f;
//        outroAluno.nota2 = 1.5f;
//
//          System.out.println("Aluno 1: " + a.nome);
//          System.out.println("Aluno 2: " + outroAluno.nome);
//
//          // MEDIA ALUNO 1
//            float media1 = (a.nota1 + a.nota2) / 2;
//            System.out.println("Media do aluno 1: " + media1);



    }

}

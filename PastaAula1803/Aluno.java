package PastaAula1803;

/* Aluno _a_ = new Aluno();
  String no java é comum usar a letra inicial maiúscula para nomear classes, e a
  letra inicial minúscula para nomear variáveis e objetos. Por exemplo, "Aluno" é
  uma classe, enquanto "aluno" seria um objeto ou variável do tipo Aluno.*/

public class Aluno {

    String nome;
    String matricula;
    float nota1;
    float nota2;

    // FUNÇÃO
    Aluno(String nomeInput, String mat, float n1, float n2){
        System.out.println("...criando novo aluno");
//      nome = "Thor - Nome Padrao - TESTE";
        nome = nomeInput;
        matricula = mat;
        nota1 = n1;
        nota2 = n2;
    }

    void calcularEMostrarMedia(){ // VOID NAO RETORNA NADA MAS MOSTRA NA TELA
        float media = (nota1 + nota2) / 2;

        System.out.println(" > Aluno " + nome);
        System.out.println(" > Media " + media);
    }
}

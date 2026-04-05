package Classes.SistGerenciadorNotasEstudantes;

/*
Crie uma classe chamada "Estudante" com os seguintes atributos: nome e notas
No metodo main, peça ao usuario para cadastrar multiplos alunos e inserir suas notas
Utilize loops para coletar as notas e armazenar em um array
Calcule a média das notas de cada aluno e exiba o resultado
Se a media for maior ou igual a 7, exiba "Aprovado", caso contrário, exiba "Reprovado"
 */

public class Estudante {

    String nome;
    float[] notas;

    Estudante(String n, float[] nt) {
        nome = n;
        notas = nt;
    }

    void calcularMedia(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ALUNO: " + nome);

        float soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        float media = soma / notas.length;
        if (media >= 7) {
            System.out.println("> APROVADO <");
        } else {
            System.out.println("> REPROVADO <");
        }

        System.out.println("> MÉDIA:  " + media);


    }




}



package Classes.SistGerenciadorNotasEstudantes;
import java.util.Scanner;


/*
Crie uma classe chamada "Estudante" com os seguintes atributos: nome e notas
No metodo main, peça ao usuario para cadastrar multiplos alunos e inserir suas notas
Utilize loops para coletar as notas e armazenar em um array
Calcule a média das notas de cada aluno e exiba o resultado
Se a media for maior ou igual a 7, exiba "Aprovado", caso contrário, exiba "Reprovado"
 */


public class MainEstudante {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // para ler a entrada do usuário
        Classes.SistGerenciadorNotasEstudantes.Estudante[] estudante = new Estudante[3]; /* array para armazenar os estudantes,
                                                   pode ser de qualquer tamanho, aqui
                                                   coloquei 3 para exemplo */

        for (int i = 0; i < estudante.length; i++) { // loop para cadastrar cada estudante
            System.out.println("~~~~~~~~");
            System.out.println("Add Estudante " + (i + 1));

            System.out.print("Digite o nome do estudante: ");
            String nome = leitor.nextLine(); // lendo o nome do estudante

            float[] notas = new float[3]; /* array para armazenar as notas do estudante,
                                          aqui coloquei 3 para exemplo, pode ser de qualquer
                                          tamanho*/

            for (int j = 0; j < notas.length; j++) { /* loop para coletar as notas do estudante,
                                                      pode ser de qualquer tamanho, aqui
                                                      coloquei 3 para exemplo */

                System.out.print("Digite a nota " + (j + 1) + ": "); /* pedindo para o usuário digitar cada
                                                                      nota, j+1 para mostrar a numeração
                                                                      correta */

                notas[j] = Float.parseFloat(leitor.nextLine()); /* lendo a nota do estudante e convertendo para float,
                                                                     pois o metodo nextLine() retorna uma String */
            }

            estudante[i] = new Estudante(nome, notas); /* criando um novo objeto Estudante
                                                          com o nome e as notas coletadas,
                                                          e armazenando no array de estudantes */
        }

        // Calculando a média de cada aluno
        for (int i = 0; i < estudante.length; i++) { /* loop para calcular a média de cada estudante,
                                              pode ser de qualquer tamanho, aqui
                                              coloquei 3 para exemplo */

            estudante[i].calcularMedia(); /* chamando o metodo calcularMedia() para cada estudante,
                                              que irá calcular a média das notas e exibir o resultado */
        }
    }
}
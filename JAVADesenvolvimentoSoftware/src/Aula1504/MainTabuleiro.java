package Aula1504;

/*
linha = x
coluna = y
 */

public class MainTabuleiro {
    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;
        // Player p = new Player(3,2);

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                if (linha == 4 && coluna == 2) {
                    System.out.print("[ X ]");
                } else {
                    System.out.print("[ . ]");
                }
            }

            System.out.println();
        }
    }
}

/*
        int linhas = 5;
        int colunas = 5;


        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                if (linha == 4 && coluna == 2) {
                    System.out.print("[ X ]");
                } else {
                    System.out.print("[ . ]");
                }
            }

            System.out.println();
        }
 */

/*
  [ . ] [ . ] [ . ] [ . ] [ . ]
  [ . ] [ . ] [ X ] [ . ] [ . ]
  [ . ] [ . ] [ . ] [ . ] [ . ]
  [ . ] [ . ] [ . ] [ . ] [ . ]
  [ . ] [ . ] [ . ] [ . ] [ . ]
Tabuleiro 5 x 5
Fazer um tabuleiro 5 x 5 -> mostrar

        public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                if (linha == 1 && coluna == 2) {
                    System.out.print("[ X ]");
                } else {
                    System.out.print("[ . ]");
                }
            }

            System.out.println();
        }
       }
 */


/*
  [ . ] [ . ] [ . ] [ . ] [ . ]
  [ . ] [ . ] [ . ] [ . ] [ . ]
  [ . ] [ . ] [ . ] [ . ] [ . ]
  [ . ] [ . ] [ . ] [ . ] [ . ]
  [ . ] [ . ] [ . ] [ . ] [ . ]
Tabuleiro 5 x 5
Fazer um tabuleiro 5 x 5 -> mostrar
        public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.print("[ . ]");
            }

            System.out.println();
        }
       }
*/
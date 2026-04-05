package DesafiosOrientacaoaObjetos.ExJogador;

/*
“Crie a classe `Jogador`, que deverá conter atributos privados para o
`nome`, `pontuacao` e `nivel` do jogador.

Inclua um construtor para inicializar esses atributos e métodos públicos para permitir
a manipulação segura dessas informações — por exemplo, métodos para aumentar a pontuação,
subir de nível e exibir as informações do jogador.”
 */

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    // construtor
    public Jogador(String nome){
        this.nome = nome;
        this.pontuacao = 0; // pontuação inicial do jogador é zero,
        // independentemente do valor passado como parâmetro
        this.nivel = 1; // nível inicial do jogador é 1,
        // independentemente do valor passado como parâmetro
    }

    // GET - retornam os valores dos atributos privados
    public String getNome(){
        return this.nome;
    }

    public int getPontuacao(){
        return this.pontuacao;
    }

    public int getNivel(){
        return this.nivel;
    }

    //METODOS PUBLICOS PARA PERMITIR A MANIPULAÇÃO SEGURA DAS INFORMAÇÕES DO JOGADOR

    // metodo para aumentar a pontuação do jogador
    public void aumentarPontuacao(int pontos){
        if (pontos > 0){ // pontos a serem adicionados à pontuação do jogador é maior que zero
            this.pontuacao = pontuacao + pontos;
            System.out.println("Pontuação aumentada em " + pontos + " pontos! Pontuação atual: " + this.pontuacao);
        }
    }

    // metodo para subir de nível do jogador
    public void subirNivel(){
         this.nivel = nivel + 1; // ou this.nivel += 1; // ou this.nivel++;
            System.out.println("Parabéns! Você subiu para o nível " + this.nivel + "!");
    }

    // metodo para exibir as informações do jogador
    public void exibirInformacoes(){
        System.out.println("---Informações do Jogador---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Nível: " + this.nivel);
        System.out.println("-----------------------------");
    }
}

package POO;

    /*
    --> 1. O que é Herança? (---> EXTENDS <---)
        Herança é quando uma classe filho herda tudo que a classe pai tem.

        public class Animal {
            public void fazerSom() {
                System.out.println("Som genérico");
            }
        }

        public class Cachorro extends Animal {
        // Cachorro JÁ TEM o metodo fazerSom() sem precisar reescrever
        }

     ----- Pensa assim: o filho herda as características do pai.
     O Cachorro é um Animal, então faz sentido ele herdar tudo que Animal tem.

------------------------------------------------------------------------------------------------------------

    --> 2. Sobrescrevendo métodos (@Override)
        Às vezes o filho herda um metodo do pai, mas quer mudar o comportamento dele.

        public class Cachorro extends Animal {
            @Override
            public void fazerSom() {
                System.out.println("AU AU!");  // substitui o som genérico
            }
        }

        ----- O @Override é opcional tecnicamente, mas você sempre deve usar — ele avisa o
        compilador "estou sobrescrevendo um metodo do pai", e o Java te avisa se você errar o nome.

------------------------------------------------------------------------------------------------------------

    --> 3. Chamando o pai com (super)
        O super tem dois usos:
        -- Chamar o construtor do pai: --
            public class Gerente extends Funcionario {
                public Gerente(String nome) {
                    super(nome); // passa o nome pro construtor de Funcionario
                }
              }


         -- Chamar um metodo do pai dentro do filho: --
             public class Cachorro extends Animal {
                 @Override
                 public void fazerSom() {
                     super.fazerSom(); // executa o som genérico do Animal primeiro
                     System.out.println("AU AU!"); // depois executa o do Cachorro
                 }
             }

------------------------------------------------------------------------------------------------------------

    --> 4. Resumo visual

             Animal
            /      \
       Cachorro    Gato

       Animal é o pai (superclasse)
       Cachorro e Gato são os filhos (subclasses)
       Os filhos herdam tudo do pai, e podem mudar o que quiserem com @Override

------------------------------------------------------------------------------------------------------------

    --> Resuminho

    Palavra                 Pra que serve
 -------------           -------------------
    extends                 Liga o filho ao pai
    @Override               Sobrescreve um metodo do pai
    super()                 Chama o construtor do pai
    super.metodo()          Chama um metodo do pai


     */

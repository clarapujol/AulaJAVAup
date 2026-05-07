package Aula0605.DiagramaDeClasses;

/*
-------------------------------> CLASSE abstract <-------------------------------
 >>>> Quando você coloca abstract na classe, você está dizendo:
        -> "Essa classe não pode ser usada diretamente. Ela existe só pra ser herdada."

        Pensa assim:
            Imagina que você vai numa loja e pede:

            "Quero comprar um animal."
            O vendedor te olha e fala:
            "Um animal? Que animal? Cachorro? Gato? Papagaio?"

            Você não pode comprar um "animal genérico". Animal é só uma ideia, um molde.
            Você sempre compra algo concreto.

            abstract class Animal { }  // só um molde, não dá pra criar ❌
            class Cachorro extends Animal { }  // concreto, dá pra criar ✅



---------------------------------------------------------------------------------
-------------------------------> METODO abstract <-------------------------------
        Imagina que o molde de Animal diz:
            "Todo animal TEM que fazer algum som. Mas eu não sei qual som — isso é problema de cada um."

        abstract class Animal {
            abstract void fazerSom(); // obrigação sem resposta
        }


        Aí o Cachorro chega e é obrigado a responder:

        class Cachorro extends Animal {
            void fazerSom() {
                System.out.println("AU AU!"); // agora sim
            }
        }

        Se o Cachorro não implementar, o Java berra na sua cara com erro.



---------------------------------------------------------------------------------
-------------------------------> Por que usar? <-------------------------------

        Porque ligar um carro é diferente de ligar uma moto. Não faz sentido ter um ligar() genérico no pai.
        Então o pai força o filho a criar o seu próprio.


        public class Carro extends Veiculo {

            public Carro(int ano, String modelo, String cor) {
                super(ano, modelo, cor);
            }

            @Override
            public void ligar() {
                // OBRIGADO a implementar esse metodo
                this.ligado = true;
                System.out.println("Carro ligado com a chave!");
            }
        }


        public class Moto extends Veiculo {

            public Moto(int ano, String modelo, String cor) {
                super(ano, modelo, cor);
            }

            @Override
            public void ligar() {
                this.ligado = true;
                System.out.println("Moto ligada com o botão de partida!");
            }
        }



---------------------------------------------------------------------------------

                                Classe normal           Classe abstract
Pode instanciar?                    ✅Sim                    ❌Não
Pode ser herdada?                   ✅ Sim                   ✅Sim
Pode ter metodo abstract?           ❌ Não                   ✅Sim


                                Metodo normal           Metodo abstract
Tem corpo {}?                       ✅Sim                    ❌ Não
Filho é obrigado a implementar?     ❌ Não                   ✅ Sim

 */

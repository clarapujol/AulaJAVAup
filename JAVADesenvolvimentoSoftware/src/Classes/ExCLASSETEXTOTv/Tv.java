package Classes.ExCLASSETEXTOTv;

/*
Classe TV: Faça um programa que simule um TELEVISOR, CRIANDO-O COMO UM -->__OBJETO__<--.
O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume.
Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas.

&& -> operador lógico AND, ou seja, as duas condições precisam ser verdadeiras para que o
resultado seja verdadeiro
*/

public class Tv {
    int canal;
    int volume;

    // construtor
    public Tv(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
    }

    // GET canal
    public int getCanal(){
        return this.canal;
    }

     // GET volume
     public int getVolume(){
        return this.volume;
    }

    // metodo para mudar o canal
    public void setmudarCanal(int novoCanal){
        if (novoCanal >= 1 && novoCanal <= 50) {
            this.canal = novoCanal; // mudar canal antigo para o novo canal informado pelo usuário
        }else {
            System.out.println("Canal inválido! O canal deve estar entre 1 e 50.");
        }
    }

    // metodo para mudar o volume
    public void setmudarVolume(int novoVolume){
        if (novoVolume >= 0 && novoVolume <= 100){
            this.volume = novoVolume;
        }else {
            System.out.println("Volume inválido! O volume deve estar entre 0 e 100.");
        }
    }



}

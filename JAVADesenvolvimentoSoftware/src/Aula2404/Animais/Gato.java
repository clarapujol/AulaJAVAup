package Aula2404.Animais;

public class Gato extends Animal{
    @Override // override é usado para indicar que estamos sobrescrevendo um metodo da classe(Animal).
    public void fazerSom (){
        // super.fazerSom();
        System.out.println("MIIIIAUUUU");
    }

}

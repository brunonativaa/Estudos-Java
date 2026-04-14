

public class Matematica {

     int a, b; // Atributos locais

    // Construtor de classe, que rece dois valores e atribui
    // aos valores locais (a e b)
    public Matematica (int x, int y){
        a = x;
        b = y;
    }

    //Metodo soma
    public int soma(){
        return a + b;
    }

    //Metodo subtração
    public  int subtrai(){
        return a - b;
    }

    // Metodo multiplicação
    public int multiplica(){
        return a * b;
    }

    //Metodo Divisão
    public int divide(){
        return a / b;
    }
}
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        
        // Define o leitor do teclado

        Scanner leitor = new Scanner(System.in);

        // Define a variaveis locais
        int x, y;

        // Le

        System.out.print("Informe o 1 valor: ");
        x = leitor.nextInt();

        System.out.print("Informe o 2 valor: ");
        y = leitor.nextInt();

        // Cria a instancia da classe matematica utilizando o contrutor
        Matematica mat = new Matematica(x, y);

        // Imprime o resultado das operações através
        // de chamada dos metodos da classe Matematica

        System.out.println("--------------------");
        System.out.println("O valor da soma é: " + mat.soma());
        System.out.println("O valor da subtração é: " + mat.subtrai());
        System.out.println("O valor da multiplicação é :" + mat.multiplica());
        System.out.println("O valor da divisão é: " + mat.divide());
        System.out.println("--------------------");
        
        



    }
    
}

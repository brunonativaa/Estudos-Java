package CompanyEmployees;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // variaveis auxiliares:
        String nomeAux;
        double salarioAux;
        int diasAux;


        // Le os dados para um funcionario mensalista:

        System.out.print("Qual o nome do funcionario mensalista: ");
        nomeAux = teclado.next();
    
        System.out.print("Qual o valor do salario bruto do funcionairo mensalista: "); 
        salarioAux = teclado.nextDouble();
        
        // Controi um funcionario mensalista na memória (instancia)
        FuncionarioMensalista fM = new FuncionarioMensalista(nomeAux,salarioAux);

        //Le os dados para um funcionário diarista:
        System.out.print("\nQual o nome do funcionário diarista: ");
        nomeAux = teclado.next(); //Pode usar a mesma variável pois o funcionário mensalista já foi construído.
 
        System.out.print("Qual o valor da hora deste funcionário diarista: ");
        salarioAux = teclado.nextDouble();
 
        System.out.print("Quantos dias ele trabalhou: ");
        diasAux = teclado.nextInt();
 
        //Cria a instância de um funcionário diarista na memória, já com os dados:
        FuncionarioDiarista fD = new FuncionarioDiarista(nomeAux, salarioAux, diasAux);
 
        //Agora vamos imprimir os dados de cada um e o salário bruto (calculado):
        System.out.println("Dados e salário do Funcionário mensalista: ");
        System.out.println("\tNome: " + fM.nome);
        System.out.println("\tSalário Bruto: " + fM.calcularSalarioLiquido());
 
        System.out.println("------\nDados e salário do Funcionário diarista: ");
        System.out.println("\tNome: " + fD.nome);
        System.out.println("\tSalário Bruto: " + fD.calcularSalarioLiquido());

    }
}

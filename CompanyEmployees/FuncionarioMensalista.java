package CompanyEmployees;

public class FuncionarioMensalista implements Operacao {

    // Atributos:
    String nome;
    double salario;

    // Construtor que recebe parametros de entrada e seta localmente
    public FuncionarioMensalista(String nome, double salario ) {
        this.nome = nome;
        this.salario = salario;
    }

    //Sobrescrevendo (Obrigatoriamento) o método calculo do salario
    @Override
    public double calcularSalarioLiquido(){
       return this.salario - this.salario * 27.5 / 100;
       

    

    }
    
}
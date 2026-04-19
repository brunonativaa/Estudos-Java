package CompanyEmployees; 

public class FuncionarioDiarista implements Operacao {
    // Atributos
    String nome;
    double valorDaHora;
    int diasTrabalhados;

    // Contrutor

    public FuncionarioDiarista(String nome, double valorDaHora, int diasTrabalhados)   {
        this.nome = nome;
        this.valorDaHora = valorDaHora;
        this.diasTrabalhados = diasTrabalhados;
    }

    // Sobrescrevendo (obrigatoriamente) o método de calculo do salário:

    @Override
    public double calcularSalarioLiquido() {
        return (8 * valorDaHora) * diasTrabalhados;
    }
    
}

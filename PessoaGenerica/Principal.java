package PessoaGenerica;

public class Principal {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.nome = "Josefino da Silva";
        a1.cpf = "458-589-4223-01";
        a1.curso = "Bacharelado CC";
        a1.rg = "0000254584-X";
        a1.notaVestibular = 8.5f;
        a1.registroAcademico = 010020123;
        a1.telCel = "(021)98845-1258";
        a1.telFixo = "(145)4568-1587";
        a1.enderco = "Rua das tres";
        a1.dtNascimento = " 15/02/2000";
        a1.dataIngresso = "01/02/2025";

        System.err.println(a1.retornaDados());

    }
    
}
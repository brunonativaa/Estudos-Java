package PessoaGenerica;

public class PessoaGenerica {
            String nome, cpf, rg, enderco, telFixo, telCel, dtNascimento; 

            public String retornaDados(){
                String dados = "";
                dados += "Dados pessoais: \n";
                dados += "\t - Nome:" + nome + "\n";
                dados += "\t - Cpf:" + cpf + "\n";
                dados += "\t - Rg:" + rg + "\n";
                dados += "\t - Endereço:" + enderco + "\n";
                dados += "\t - Telefone Fix:" + telFixo + "\n";
                dados += "\t - Telefone Cel:" + telCel + "\n";
                dados += "\t - Data nascimento" + dtNascimento + "\n";

                return dados;
            }
    }
package PessoaGenerica;

    public class Aluno extends PessoaGenerica {
        long registroAcademico;
        String dataIngresso, curso;
        Float notaVestibular;

        public String retornaDadosAluno(){
            String dados = "";

            dados += super.retornaDados();
            dados += "\t - RA:" + registroAcademico + "\n";
            dados += "\t - Curso:" + curso + "\n";
            dados += "\t - Data de Ingresso:" + dataIngresso + "\n";
        }
    }
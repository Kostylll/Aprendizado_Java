public class Pessoa extends Humano{

    public String nome;
    public String celular;
    public int idade;
    public String endereco;
    public String CPF;

    public Pessoa(String nome, int idade, String endereco, String CPF,String celular,String peso,String altura,String sexo,String blabal) {

        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.CPF = CPF;
        this.celular = celular;
    }

    public Pessoa() {

    }


    @Override
    public void Dancar() {
        System.out.println("UOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
    }

    public void setCpf(String CPF) {
        this.CPF = CPF;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void ApresentarPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Celular: " + celular);
        System.out.println("Idade: " + idade);
        System.out.println("Endereco: " + endereco);
        System.out.println("CPF: " + CPF);

    }


    public class FormatarCelular{
        public static String formatarCelular(String Celular) {
            Celular = Celular.replaceAll("\\D","");

            if(Celular.length() != 11){
                throw  new IllegalArgumentException("Celular Deve Conter 11 Dígitos");
            }
            return Celular.substring(0,0) + "(" +
                    Celular.substring(0,2) + ")" +
                    Celular.substring(2,7) + "-" +
                    Celular.substring(7);

        }



    }


    public class FormatarCPF {

        public static String formatarCPF(String cpf) {
            cpf = cpf.replaceAll("\\D", "");

            if (cpf.length() != 11) {
                throw new IllegalArgumentException("CPF deve conter 11 dígitos.");
            }

            return cpf.substring(0, 3) + "." +
                    cpf.substring(3, 6) + "." +
                    cpf.substring(6, 9) + "-" +
                    cpf.substring(9, 11);
        }
    }

}



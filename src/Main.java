import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();


        System.out.println("Digite Seu Nome: ");
        pessoa.nome = sc.nextLine();

        System.out.println("Digite Sua Idade: ");
        pessoa.idade = Integer.parseInt(sc.nextLine());

        System.out.println("Digite seu Celular: ");
        String celular = sc.nextLine();
        String celularFormatado = Pessoa.FormatarCelular.formatarCelular(celular);
        pessoa.setCelular(celularFormatado);

        System.out.println("Digite Seu Endereço: ");
        pessoa.endereco = sc.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        String cpfFormatado = Pessoa.FormatarCPF.formatarCPF(cpf);
        pessoa.setCpf(cpfFormatado);

        System.out.println("Digite seu peso: ");
        pessoa.peso = sc.nextLine();

        System.out.println("Digite sua altura: ");
        pessoa.altura = sc.nextLine();

        System.out.println("Digite seu sexo: ");
        pessoa.sexo = sc.nextLine();





        pessoa.ApresentarPessoa();
        pessoa.Dancar();

//        int a = 420;
//        int b = 69;
//
//        int soma = a + b;
//        int subtração = a - b;
//        int multiplicação = a * b;
//        float divisao = a / b;
//
//
//        System.out.println(soma);
//        System.out.println(subtração);
//        System.out.println(multiplicação);
//        System.out.println(divisao);
//
//
//        boolean fimDeSemana = true;
//        boolean fazendoSol = true;
//        boolean vamosAPraia = fimDeSemana && fazendoSol;
//        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
//
//        System.out.println(mensagem);
//        System.out.println(vamosAPraia);
//
//        if (fimDeSemana && fazendoSol == true) {
//            System.out.println("praia");
//        } else {
//            System.out.println("nao praia");
//        }


    }


}
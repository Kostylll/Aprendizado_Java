import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1- Verificar Dados");
            System.out.println("2- Realizar Cálculo da Média");
            int option = sc.nextInt();

            switch (option) {
                case (1): {
                    System.out.println("Nome: Pedro");
                    System.out.println("RA: N058242");
                    System.out.println("Turma: DS3P48");
                    break;
                }
                case (2): {
                    System.out.println("Insira a nota da NP1: ");
                    int NP1 = sc.nextInt();
                    System.out.println("Insira a nota da NP2: ");
                    int NP2 = sc.nextInt();
                    System.out.println("Insira a nota do PIM: ");
                    int PIM = sc.nextInt();

                    float calculo = (NP1 * 4 + NP2 * 4 + PIM * 2) / 10;

                    if (calculo > 7) {
                        System.out.println("Aprovado sua nota foi de " + calculo);
                    } else {
                        System.out.println("Reprovado sua nota foi de " + calculo);
                    }
                    break;
                }
                case (3): {
                    running = false;
                    System.out.println("Saindo....");
                    break;
                }

                default: {
                    System.out.println("Opção Inválida");
                    break;
                }

            }
            if (running) {
                System.out.println("Deseja realizar outra ação?");
                char repeat = sc.next().charAt(0);
                if (repeat != 's' && repeat != 'S') {
                    running = false;
                    System.out.println("Saindo...");
                }
            }
        }
    }
}

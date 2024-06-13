import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {


        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        System.out.println(Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String[] letras = {"A", "B", "C", "D", "E", "F"};

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));

        int[] numbers = {1, 2, 3, 4, 5};
        int maior = numbers[0];
        int menor = numbers[0];
        int media = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maior) {
                maior = numbers[i];
            }
            if(numbers[i] < menor) {
                menor = numbers[i];
            }
            media += numbers[i];
        }

        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);
        System.out.println("Media:" + media/numeros.length);


    }



}

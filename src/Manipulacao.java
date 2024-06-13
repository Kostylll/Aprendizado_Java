import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Manipulacao {
    public static void main(String[] args) {

//        String nome = "Pedro";
//        System.out.println(nome.toUpperCase());
//        System.out.println(nome.toLowerCase());
//        System.out.println(nome.length());
//
//        String nome2 = "pedro";
//        System.out.println(nome.equalsIgnoreCase(nome2));

        String nome = "Pedro";
        Locale brasil = new Locale("pt", "BR");

        LocalDate hoje = LocalDate.now();
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        LocalDateTime dataHoje = LocalDateTime.now();
        String saudacao = "";
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil) + dataHoje);

        if(dataHoje.getHour() >= 0 && dataHoje.getHour() < 12) {
            saudacao = "Bom Dia";
        } else if (dataHoje.getHour() >= 12 && dataHoje.getHour() < 18 ) {
            saudacao = "Boa Tarde";
        } else if (dataHoje.getHour() >= 18 && dataHoje.getHour() < 24) {
            saudacao = "Boa Noite";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao);

    }
}

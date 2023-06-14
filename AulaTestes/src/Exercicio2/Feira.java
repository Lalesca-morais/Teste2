package Exercicio2;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Feira {
    public int feiraDomingo() {
        LocalDate hoje = LocalDate.now();
        DayOfWeek diaDaSemana = hoje.getDayOfWeek(); // variável diaDaSemana, inicializada com o dia da semana referente à data atual.

        if (diaDaSemana == DayOfWeek.SUNDAY) {
            System.out.println("Hoje é domingo, melhor dia para ir a feira!");
        } else {
            DayOfWeek proximoDomingo = DayOfWeek.SUNDAY;
            int diasParaOProximoDomingo = (proximoDomingo.getValue() - diaDaSemana.getValue() + 7) % 7;
            System.out.println("Faltam " + diasParaOProximoDomingo + " dias para o próximo domingo!");
        }
        return 0;
    }
}


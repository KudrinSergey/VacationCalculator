import ru.netology.services.javaqa.javamvn.service.VacationCalculator;;

public class Main {
    public static void main(String[] args) {
        VacationCalculator service = new VacationCalculator();
        int MonthsOfVacation = service.calculateMonthsOfVacation(10000, 3000, 20000);
        System.out.println("Количество месяцев отдыха: " + MonthsOfVacation);
    }
}
import org.example.javamvnhw6.service.MoneyService;

public class Main {
    public static void main(String[] args) {

        MoneyService service = new MoneyService();
        int income = 100_000; //доходы
        int expenses = 60_000; //расходы
        int threshold = 150_000; // предел
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        System.out.println("Количество месяцев отдыха в год" + count);

    }

}

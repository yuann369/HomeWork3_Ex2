public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 69; //вес в кг
        double height = 1.8; //рост в метрах
        double bmi = service.calculate(weight, height);
        System.out.println("Индекс Массы Тела: " + bmi);
    }
}

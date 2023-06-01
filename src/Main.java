public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKilograms = 64;
        double heightInMeters = 1.60;
        double index = service.calculate(weightInKilograms, heightInMeters);
        System.out.println("BMI =" + index);
    }
}

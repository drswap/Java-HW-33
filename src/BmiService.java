public class BmiService {
    public double calculate(int bodyWeight, double height) {
        double doubleHeight = height * height;
        double index = bodyWeight / doubleHeight;
        return index;
    }
}

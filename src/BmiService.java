public class BmiService {
    public double calculate(int mass, double height) {
        double index = mass / (height*2);

        return index;
    }
}

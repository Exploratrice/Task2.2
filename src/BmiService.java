public class BmiService {
    public int calculate(double height, int weight) {

        int result;
        result = (int) (weight / (height * height));

        return result;
    }
}

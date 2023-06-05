public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87;
        int weight = 98;

        int index;
        index = service.calculate((int) (weight / (height * height)));

        System.out.println(index);
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> data1 = new ArrayList<>(Arrays.asList(1.3, 5.6, 3.1));
        List<Integer> data2 = new ArrayList<>(Arrays.asList(1, 6, 9));
        System.out.println(calc.sum(data1));
        System.out.println(calc.multiplication(data2));
    }
}
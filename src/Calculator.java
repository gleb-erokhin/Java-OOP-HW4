import java.util.List;

public class Calculator {

    public double sum(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number n : numbers) {
            res += n.doubleValue();
        }
        return res;
    }

    public int multiplication(List<? extends Number> numbers) {
        int res = 0;
        for (Number n : numbers) {
            res += n.intValue();
        }
        return res;
    }
}

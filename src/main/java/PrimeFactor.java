import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> factors = new ArrayList<>();
        if (number >1){
            int divisor = 2;
            if (number == 4) {
                while (number % divisor == 0) {
                    factors.add(divisor);
                    number /= divisor;
                }
            }
            else if (number == 6){
                while (number % divisor == 0) {
                    factors.add(divisor);
                    number /= divisor;
                }
                while(number % 3 == 0){
                    factors.add(3);
                    number /= 3;
                }
            } else{
                factors.add(number);
            }
        }
        return factors;
    }
}

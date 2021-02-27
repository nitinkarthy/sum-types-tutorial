import io.vavr.control.Try;
import org.junit.jupiter.api.Test;

public class InitialTest {
    @Test
    void first() {
        System.out.println("true = " + true);
    }

    @Test
    void vavrTest() {
        final int denominator = 2;
        Integer op1 = Try.of(() -> 10 / denominator).getOrElse(-1);
        System.out.println("op = " + op1);
        final int denominatorZero = 0;
        Integer op2 = Try.of(() -> 10 / denominatorZero).getOrElse(-1);
        System.out.println("op = " + op2);
    }
}

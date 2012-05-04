package bof_java8.t01;

import com.google.common.base.Function;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Iterables.transform;
import static java.util.Arrays.asList;
import static org.fest.assertions.Assertions.assertThat;

public class SalaryIncreaseTest {

    @Test
    public void should_increase_salary() {
        Iterable<Double> salaries = asList(20_000.0, 30_000.0, 40_000.0, 50_000.0);

        Iterable<Double> result = increaseSalaries_1(salaries, 0.02);

        assertThat(result).containsOnly(20_400.0, 30_600.0, 40_800.0, 51_000.0);
    }

    private Iterable<Double> increaseSalaries_1(Iterable<Double> salaries, double rate) {
        List<Double> result = new ArrayList<>();

        for (Double salary : salaries) {
            result.add(salary * (1.0 + rate));
        }

        return result;
    }

}

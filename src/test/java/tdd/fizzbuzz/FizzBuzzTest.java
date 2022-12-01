package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    void should_return_the_number__when_countingOff_given_number_is_not_mutiple_of_3_5_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countingOff(1);
        //then
        assertEquals("1", actual);
    }
    
}

package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    void should_return_the_number__when_countingOff_given_number_is_not_multiple_of_3_5_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countingOff(1);
        //then
        assertEquals("1", actual);
    }
    @Test
    void should_return_Fizz__when_countingOff_given_number_is_multiple_of_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countingOff(3);
        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz__when_countingOff_given_number_is_multiple_of_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countingOff(5);
        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz__when_countingOff_given_number_is_multiple_of_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countingOff(7);
        //then
        assertEquals("Whizz", actual);
    }
    @Test
    void should_return_FizzBuzz__when_countingOff_given_number_is_multiple_of_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countingOff(15);
        //then
        assertEquals("FizzBuzz", actual);
    }



}

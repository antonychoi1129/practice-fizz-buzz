package tdd.fizzbuzz;

public class FizzBuzz {
    public String countingOff(int number){
        String output = "";
        if(!(number % 3 == 0 || number % 5 == 0 || number % 7 == 0))
            output += (String.valueOf(number));
        if (number % 3 == 0)
            output += ("Fizz");
        if(number % 5 == 0)
            output += ("Buzz");
        if(number % 7 == 0)
            output += ("Whizz");
        return output;
    }
}

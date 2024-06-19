package NumberCode;

public class NumberCalculator {
    public static int getCalculatedValue(int[] numbers) {
        int finalNumber = 0;
        int multiplier = 1;

        for (int i = numbers.length -1; i >=0; i--){
            int currentNumber = Math.abs(numbers[i]);
            finalNumber +=  currentNumber * multiplier;
            multiplier *= (int) Math.pow(10, Integer.toString(currentNumber).length());
        }

        return finalNumber;
    }
}


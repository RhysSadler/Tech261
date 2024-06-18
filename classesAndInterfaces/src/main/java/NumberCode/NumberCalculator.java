package NumberCode;

public class NumberCalculator {
    public static int getCalculatedValue(int[] numbers) {
        int num1 = numbers[0] * 1000;
        int num2 = numbers[1] * 100;
        int num3 = numbers[2] * 10;
        int num4 = numbers[3];

        int finalNumber =  num1 + num2 + num3 + num4;
        if (num1 == 0) {
            finalNumber %= 1000;
            if (num2 == 0) {
                finalNumber %= 100;
                if (num3 == 0){
                    finalNumber %= 10;
                }
            }
        }
        return finalNumber;
    }
}


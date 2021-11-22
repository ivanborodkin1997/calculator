package main.java;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void splitString(String[] splitExpression ) {
        firstNumber = Integer.parseInt(splitExpression[0]);
        sign = splitExpression[1].charAt(0);
        secondNumber = Integer.parseInt(splitExpression[2]);
    }

    public int calculate(String[] splitExpression) {
        splitString(splitExpression);
        switch (sign) {
            case '+' :
                return Math.addExact(firstNumber, secondNumber);
            case '-' :
                return Math.subtractExact(firstNumber, secondNumber);
            case '*' :
                return Math.multiplyExact(firstNumber, secondNumber);
            case '/' :
                return  Math.floorDiv (firstNumber, secondNumber);
            case '^' :
                return (int) Math.pow (firstNumber, secondNumber);
            case '%':
                return (int) Math.IEEEremainder(firstNumber, secondNumber);
        }
        return 0;
    }

}

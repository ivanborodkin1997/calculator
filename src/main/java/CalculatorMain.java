package main.java;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;
        System.out.println("Калькулятор запущен!\n");

        do {
            System.out.print("Введите математическое выражение: ");
            String srcExpression = scanner.nextLine();
            String[] splitExpression = srcExpression.split(" ");
            System.out.println("Результат вычисления : " + calculator.calculate(splitExpression)); // метод расчета калькулятора
            do {
                System.out.print("Хотите продолжить? [да/нет] : ");
                answer = scanner.nextLine();
            } while(!answer.equalsIgnoreCase("да") && !answer.equalsIgnoreCase("нет"));
        } while(answer.equalsIgnoreCase("да"));
    }

}

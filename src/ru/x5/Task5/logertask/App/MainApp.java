package ru.x5.Task5.logertask.App;

import ru.x5.Task5.logertask.calculator.Calculator;
import ru.x5.Task5.logertask.logger.Log;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StringWorker sw = new StringWorker();
        Scanner sc = new Scanner(System.in);
        Log logger = LogCreator.createLogger(sc);
        System.out.println("Введите вычисляемое выражение вида A действие B. Дейстивия: +,-,*,/:");
        String exp = sc.nextLine();
        String act = sw.getAction(exp);
        act = act.substring(act.length() - 1);
        String[] nums = sw.splitString(exp);
        Double firstNum = null;
        Double secondNum = null;
        try {
            firstNum = Double.parseDouble(nums[0]);
            secondNum = Double.parseDouble(nums[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calculator calculator = new Calculator();
        switch (act){
            case "+":
                assert logger != null;
                logger.log(calculator.add(firstNum,secondNum).toString());
                break;
            case "-":
                assert logger != null;
                logger.log(calculator.sub(firstNum,secondNum).toString());
                break;
            case "*":
                assert logger != null;
                logger.log(calculator.mult(firstNum,secondNum).toString());
                break;
            case "/":
                assert logger != null;
                logger.log(calculator.div(firstNum,secondNum).toString());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + act);
        }
    }
}

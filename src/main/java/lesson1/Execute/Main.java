package lesson1.Execute;

import lesson1.Calculate.Calculate;

public class Main {
    public static void main(String[] args) {
        int res = Calculate.sum(5,5);
        System.out.printf("The result is: %d.\n",res);
        res = Calculate.sub(10,4);
        System.out.printf("The result is: %d.\n",res);
        res = Calculate.div(10,2);
        System.out.printf("The result is: %d.\n",res);
        res = Calculate.mul(10,2);
        System.out.printf("The result is: %d.\n",res);
    }
}
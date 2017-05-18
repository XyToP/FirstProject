package yellowDuck;

import java.util.Scanner;

/**
 * Created by macbook on 5/4/17.
 */
public class Fibonachi {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int fib;
        int n0 = 0, n1 = 1, f;
        System.out.println("Введите число");
//input
        fib = num.nextInt();
        do {
            f = n0 + n1;
            n0 = n1;
            n1 = f;
            if (f==fib)
                System.out.println(fib+" Fibonachi");

        }

        while (f<fib);
        if (f!=fib)
            System.out.println(fib+" NOT fibonachi");
    }


}



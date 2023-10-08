package hv1;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        int all = 200;
        int sent = 50;
        int res = (all - sent);
        System.out.println(res);

        int codi = 300;
        if (codi > 100 && codi < 1000) {
            System.out.println(codi);


        }
        int month = 2;
        boolean isleap = false;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 4, 6, 9, 11 -> System.out.println(30);
            case 2 -> {
                if (isleap) System.out.println(29);
                else System.out.println(30);
            }
        }
        int coupon=1111;
        int sum=500;
        switch (coupon){
            case 1111-> System.out.println(sum*.9);
            case 3333-> System.out.println(sum*.8);
            case 5555-> System.out.println(sum*.7);
            default -> System.out.println(sum);

        }
        int number=5;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите число");
            int userimput=scanner.nextInt();
            if (number>userimput) System.out.println("Загаданное число больше");
            else if (number<userimput) System.out.println("Загаданное число меньше");
            else{
                System.out.println("Угадал");
                break;
            }

        }
    }

}


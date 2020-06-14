package CourseProject;

import GameMeneger.Game;

import java.util.Random;

public class Chance extends Game {

    public static  void     dice(int pocket) {
        if(countStealP1 ==1){
            System.out.println("Тъй като злия ти план работи получаваш наградата си .");
            pocket+=100;
            countStealP1=0;
        } if(countStealP2==1){
            System.out.println("Тъй като злия ти план работи получаваш наградата си .");
            pocket+=100;
            countStealP2=0;
        }else{


        Random random = new Random();
        int n = 10;
        int getRandomNumber = random.nextInt(n) + 1;
        int t = 100;
        if (getRandomNumber % 2 == 0) {
            int positiveDice = random.nextInt(t) + 1;
            System.out.println("Кофти шанс");
            System.out.print("Вашият шанс е :  ");
            if (positiveDice >= 1 && positiveDice <= 39) {
                System.out.println("1001 нощ");
                pocket -= 50;
            } else if (positiveDice >= 40 && positiveDice <= 65) {
                System.out.println("Балът на феите");
                pocket -= 100;
            } else if (positiveDice >= 66 && positiveDice <= 79) {
                System.out.println("Война и мир");
                pocket -= 150;
            } else if (positiveDice >= 80 && positiveDice <= 94) {
                System.out.println("Престъпление и наказание");
                pocket -= 200;
            } else {
                System.out.println("Гроздовете на гнева");
                pocket -= 50;
            }

        } else {
            int negativeDice = random.nextInt(t) + 1;
            System.out.println("Печелите пари ");
            System.out.print("Вашият шанс е :  ");
            if (negativeDice >= 1 && negativeDice <= 39) {
                System.out.println("Големи надежди");
                pocket += 50;
            } else if (negativeDice >= 40 && negativeDice <= 65) {

                System.out.println("Лолита");
                pocket += 100;
            } else if (negativeDice >= 66 && negativeDice <= 79) {
                System.out.println("Гордост и предразсъдъци");
                pocket += 150;
            } else if (negativeDice >= 80 && negativeDice <= 94) {
                System.out.println("Повелителя на мухите");
                pocket += 200;

            } else {
                System.out.println("Хобит");
                pocket += 250;
            }


          }


        }
        System.out.printf("  В портфейла  на %s вече има  : %d" ,isFirstPlayer?"първия играч":"втория играч", pocket);

   }
}

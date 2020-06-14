package CourseProject;

import GameMeneger.Game;

import java.util.Random;

public class Steal extends Game {
    public static int  getStealOption() {
        int g = 3;

        Random random = new Random();
        //g = scanner.nextInt();
        int getRandomNumber = random.nextInt(g);
        return getRandomNumber;

    }

    public static int StealBlock(int n,String[][] game, int[] crd, int pocket) {
        if(countStealP1 ==1){
            System.out.println("Тъй като злия ти план работи получаваш наградата си .");
            pocket+=100;
            countStealP1=0;
        }
        if(countStealP2==1){
            System.out.println("Тъй като злия ти план работи получаваш наградата си .");
            pocket+=100;
            countStealP2=0;
        }
        else {

            switch (n) {
                case 1:
                    Earth(game, crd, pocket);
                    break;
                case 2:
                    Slavers(game, crd, pocket);
                    break;
                case 3:
                    bigBankRobbery(game, crd, pocket);
                    break;

            }
        }
        return n;
    }

    public static void Earth(String[][] game, int[] crd, int pocket) {
       // if (game[crd[3]][crd[2]].equals(CHANCE)) {
        ///    pocket += 100;
        //}
        if(isFirstPlayer) {
            countStealP1++;
        }else{
            countStealP2++;
        }
        System.out.printf("Стъпи върху Steal получи зъл план  Завладяване на\n" +
                "света : получаваш 100шк при стъпване върху CHANCE .\n  Имаш %d: ",pocket );



    }

    public static void  Slavers(String[][] game, int[] crd, int pocket) {
       // if (game[crd[3]][crd[2]].equals(INVEST)) {
           // pocket += 100;
        //}
        if(isFirstPlayer) {
            countStealP1++;
        }else{
            countStealP2++;
        }
        System.out.printf("Стъпи върху Steal получи получи зъл план Заложници : получаваш 100шк при стъпване върху Invest .\n  Имаш %d: ",pocket );

    }
        public static void bigBankRobbery (String[][]game,int[] crd, int pocket){
           // if (game[crd[3]][crd[2]].equals(STEAL)) {
            //    pocket += 100;
           // }
            if(isFirstPlayer) {
                countStealP1++;
            }else{
                countStealP2++;
            }
            System.out.printf("Стъпи върху Steal получи зъл план Големия банков\n" +
                    "обир: 100шк при стъпване върху Steal отново .\n  Имаш %d: ",pocket );

        }
    }

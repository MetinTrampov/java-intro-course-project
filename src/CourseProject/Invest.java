package CourseProject;

import GameMeneger.Game;

import java.util.Random;

public class Invest extends Game {

    public static void printInvestMenu() {
        System.out.println("Инвестирайте разумно и изберете компания:\n" +
                "* (1) : Evel Co | min : 500 | risk/reward :  0.2\n" +
                "* (2) : Bombs Away | min : 400 | risk/reward : 0.5\n" +
                "* (3) : Clock Work Orange | min : 300 | risk/reward : 1.5\n" +
                "* (4) : Maroders unated | min : 200 | risk/reward : 2\n" +
                "* (5) : FatCat incorporated | min : 100 | risk/reward : 2.5\n" +
                "* (6) : Macrosoft | min : 50 | risk/reward : 5.0\n" +
                "* (N) : Не ми се инвестира повече");

    }


    /**
     * Дава възможност за избиране на една от фирмите за инвестиция в нея.
     */
    public static int chooseYourInvest(int pocket) {
        int n = 0;

        if (isFirstPlayer && countStealP1 == 1) {
            System.out.println("Тъй като злия ти план работи получаваш наградата си .");
            pocket += 100;
            countStealP1 = 0;
        }else
        if (!isFirstPlayer && countStealP2 == 1) {
            System.out.println("Тъй като злия ти план работи получаваш наградата си .");
            pocket += 100;
            countStealP2 = 0;
        } else {
            do {
                printInvestMenu();
                System.out.print("Имаш как да избиреш още една фирма за инвестиране или да продължиш играта\n");

                n = scanner.nextInt();
                switch (n) {
                    case 1:
                        FirmEvelCo(pocket);
                        break;
                    case 2:
                        FirmBombsAway(pocket);
                        break;
                    case 3:
                        FirmClockWorkOrange(pocket);
                        break;
                    case 4:
                        FirmMarodersUnated(pocket);
                        break;
                    case 5:
                        FirmFatCatIncorporated(pocket);
                        break;
                    case 6:
                        FirmMacrosoft(pocket);
                        break;
                    default:
                        break;

                }
            }
            while (countOfInvests < 3 && pocket > 0 && n < 6);
        }

            return pocket;
        }

        public static void FirmEvelCo ( int pocket ){
            countOfInvests++;
            int optionNum = 1;
            int n;
            int min = -5;
            int max = 100;
            int yourRandomLuck = randInt(min, max);
            do {
                System.out.println("Тази фирма изисква да въведеш сума не по - малка от 500");
                n = scanner.nextInt();
            } while (n < 500);
            // int j=scanner.nextInt();
            //randInt(min,max);
            System.out.printf("Твойто число е %d\n", yourRandomLuck);
            sumAllInvests(n, pocket, optionNum, yourRandomLuck);
        }
        public static void FirmBombsAway ( int pocket ){
            countOfInvests++;
            int optionNum = 2;
            int n;
            int min = -10;
            int max = 50;
            int yourRandomLuck = randInt(min, max);
            do {
                System.out.println("Тази фирма изисква да въведеш сума не по - малка от 400");
                n = scanner.nextInt();
            } while (n < 400);


            System.out.printf("Твойто число е %d\n", yourRandomLuck);
            sumAllInvests(n, pocket, optionNum, yourRandomLuck);

        }
        public static void FirmClockWorkOrange ( int pocket ){
            countOfInvests++;
            int optionNum = 3;
            int n;
            int min = -15;
            int max = 35;
            int yourRandomLuck = randInt(min, max);
            do {
                System.out.println("Тази фирма изисква да въведеш сума не по - малка от 300");
                n = scanner.nextInt();
            } while (n < 300);


            System.out.printf("Твойто число е %d\n", yourRandomLuck);
            sumAllInvests(n, pocket, optionNum, yourRandomLuck);
        }
        public static void FirmMarodersUnated ( int pocket ){
            countOfInvests++;
            int optionNum = 4;
            int n;
            int min = -18;
            int max = 50;
            int yourRandomLuck = randInt(min, max);
            do {
                System.out.println("Тази фирма изисква да въведеш сума не по - малка от 200");
                n = scanner.nextInt();
            } while (n < 200);


            System.out.printf("Твойто число е %d\n", yourRandomLuck);
            sumAllInvests(n, pocket, optionNum, yourRandomLuck);
        }
        public static void FirmFatCatIncorporated ( int pocket ){
            countOfInvests++;
            int optionNum = 5;
            int n;
            int min = -25;
            int max = 100;
            int yourRandomLuck = randInt(min, max);

            do {
                System.out.println("Тази фирма изисква да въведеш сума не по - малка от 100");
                n = scanner.nextInt();
            } while (n < 100);


            System.out.printf("Твойто число е %d\n", yourRandomLuck);
            sumAllInvests(n, pocket, optionNum, yourRandomLuck);
        }
        public static void FirmMacrosoft ( int pocket ){
            countOfInvests++;
            int optionNum = 6;
            int n;
            int min = -20;
            int max = 10;
            int yourRandomLuck = randInt(min, max);
            do {
                System.out.println("Тази фирма изисква да въведеш сума не по - малка от 50");
                n = scanner.nextInt();
            } while (n < 50);


            System.out.printf("Твойто число е %d\n", yourRandomLuck);
            sumAllInvests(n, pocket, optionNum, yourRandomLuck);
        }


        public static double sumAllInvests ( int n, int pocket, int option, int luck){
            double moneyFromInvesting = 0.0;

            if (luck >= 0) {
                switch (option) {
                    case 1:
                        moneyFromInvesting = n * 0.2;
                        break;
                    case 2:
                        moneyFromInvesting = n * 0.5;
                        break;
                    case 3:
                        moneyFromInvesting = n * 1.5;
                        break;
                    case 4:
                        moneyFromInvesting = n * 2.0;
                        break;
                    case 5:
                        moneyFromInvesting = n * 2.5;
                        break;
                    case 6:
                        moneyFromInvesting = n * 5.0;
                        break;
                }
            } else {
                switch (option) {
                    case 1:
                        moneyFromInvesting = n * 0.2;
                        break;
                    case 2:
                        moneyFromInvesting = n * 0.5;
                        break;
                    case 3:
                        moneyFromInvesting = n * 1.5;
                        break;
                    case 4:
                        moneyFromInvesting = n * 2.0;
                        break;
                    case 5:
                        moneyFromInvesting = n * 2.5;
                        break;
                    case 6:
                        moneyFromInvesting = n * 5.0;
                        break;
                }
                System.out.printf("Ето ги парите от инвестирането %.2f\n", (moneyFromInvesting));
                System.out.println("Обаче имаш лош късмет и ги губиш от портфейла си\n");
                pocket -= moneyFromInvesting;
                System.out.printf("В портфейла на %s има %d\n",isFirstPlayer?"първия играч":"втория играч", pocket);

                if(isFirstPlayer){
                    pocketOfP1+=pocket;
                    return pocketOfP1;
                }else{
                    pocketOfP2+=pocket;
                    return pocketOfP2;
                }
            }

            System.out.printf("Ето ги парите от инвестирането %.2f\n", (moneyFromInvesting));
            System.out.printf("Те ще бъдат прибавени към портфейла ти ;)\n");
            pocket += moneyFromInvesting;
            System.out.printf("В портфейла на %s има %d\n",isFirstPlayer?"първия играч":"втория играч", pocket);
            if(isFirstPlayer){
                pocketOfP1+=pocket;
                return pocketOfP1;
            }else{
                pocketOfP2+=pocket;
                return pocketOfP2;
            }
            //return pocket;
        }
        public static int randInt ( int min, int max){


            Random rand = new Random();

            // nextInt is normally exclusive of the top value,
            // so add 1 to make it inclusive

            return rand.nextInt((max - min) + 1) + min;
        }

    }


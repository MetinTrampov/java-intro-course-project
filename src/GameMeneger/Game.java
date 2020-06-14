package GameMeneger;

import CourseProject.*;

import java.util.Random;
import java.util.Scanner;


public class Game {


        public  static  final Scanner scanner = new Scanner(System.in);
        public  static  final String EMPTY_BLOCK    = "     ";
        public  static  final String START_BLOCK    = "| S |";
        public  static  final String PLAYER_1       = "| P1 |";
        public  static  final String PLAYER_2       = "| P2 |";
        public  static  final String TRAP           = "| Tr |";
        public  static  final String INVEST         = "| In |";
        public  static  final String PARTY_HARD     = "| Ph |";
        public  static  final String CHANCE         = "| Ch |";
        public  static  final String STEAL          = "| St |";
        public  static  boolean isFirstTurn         = true;
        public  static  boolean isFirstPlayer       = true;

        public static  int pocketOfP1               = 1000;
        public static  int pocketOfP2               = 1000;
        public static  int countStealP1             = 0;
        public static  int countStealP2             = 0;
        public static  int countOfInvests           = 0;

    /**
     * @author Metin Trampov
     * @param args
     */
    public static void main(String[] args) {
            String [][] gameBoard = {
                    {STEAL,PARTY_HARD, TRAP ,CHANCE ,TRAP ,INVEST,STEAL,  TRAP},
                    {INVEST,EMPTY_BLOCK,EMPTY_BLOCK ,EMPTY_BLOCK ,EMPTY_BLOCK ,EMPTY_BLOCK ,EMPTY_BLOCK, EMPTY_BLOCK, PARTY_HARD},
                    {TRAP,EMPTY_BLOCK, EMPTY_BLOCK,EMPTY_BLOCK ,EMPTY_BLOCK ,EMPTY_BLOCK ,EMPTY_BLOCK, EMPTY_BLOCK, TRAP},
                    {CHANCE,PARTY_HARD, INVEST ,TRAP ,STEAL ,CHANCE, TRAP, START_BLOCK},
            };
            GameCycle(gameBoard);
        }

    /**
     * Метод принтиращ нашата игрална дъска
     * @param array масива подаден за принтирне
     */
    public static  void print(String [] [] array){
            int rolNum = 0 ;
            System.out.println();
            for (int i = 0; i <array.length ; i++) {
                for (int j = 0; j <array[i].length ; j++) {
                    System.out.print(array[i][j]);

                }
                System.out.print(rolNum+i);
                System.out.println();
            }
            colNumbers(array);

        }

    /**
     * Метод принтиращ номерата на колоните за по лесна ориентация
     * @param array  масива подаден за принтирне
     */
    public static  void colNumbers(String[][] array  ){
            // System.out.print(" ");
            for (int i = 0; i <=array.length +3 ; i++) {
                System.out.printf("| %d  |", i);
            }
            System.out.println();
        }

    /**
     * Метода за зар който така и не ми се получи след отчаяни опити за измисляне на логиката му .....
     *
     * @return стойноста на зара
     */
    public static  int   dice(){
            int j ;
            if(isFirstTurn){
                System.out.println("Това е първия ход въведете 2 за да продължите");
                Random random = new Random();
                j=scanner.nextInt();
                int getRandomNumber =  random.nextInt(j)+1;
                System.out.printf("Придвижете се с %d квадратче/та",getRandomNumber);
                return getRandomNumber;
            }else{
                System.out.println("Въведете стоиността на зара");
                j = scanner.nextInt();
                Random random = new Random();
                int getRandomNumber =  random.nextInt(j)+1;
                System.out.printf("Придвижете се с %d квадратче/та",getRandomNumber);
                return getRandomNumber;
            }

        }

    /**
     * Метод четящ кординатите въведени от потребителя
     * след неуспешния опит за създаване на зар
     * @return връща масива с въведените стойности за придвижване
     */

    public  static  int [] readInput (){
        System.out.printf("На ход е %s играч \n" , isFirstPlayer?"първия":"втория");
        System.out.print("Въведете  кординати :\n");
        int intCoordinates ;
        int [] cord = new int[4];
        int [] firstCord =  new int[2];
        int [] secondCord =   new int[2];
        for (int i = 0; i <firstCord.length ; i++) {

            intCoordinates = scanner.nextInt();
            if(intCoordinates>7){
                System.out.println("Въведете кординати от 0 до 6..\n"+
                        "Въведете свойте нови кординати : ");
                readInput();
                break;
            }

            firstCord[i] +=intCoordinates ;
        }
        for (int i = 0; i < secondCord.length ; i++) {
            intCoordinates = scanner.nextInt();
            if(intCoordinates > 7){
                System.out.println("Въведете кординати от 0 до 6..\n"+
                        "Въведете свойте нови кординати : ");
                readInput();
                break;
            }

            secondCord[i] +=intCoordinates ;
        }
        int [] fromCord = new int[2];
        int [] toCord = new int[2];

        fromCord[0] = firstCord[0];
        fromCord[1] = (firstCord[1]);
        toCord[0] = (secondCord[0]);
        toCord[1] = (secondCord[1]);

        cord[0]= fromCord[0];
        cord[1]= fromCord[1];
        cord[2]= toCord[0];
        cord[3]= toCord[1];


        return cord;
    }
        public  static   int[]  readMoving(){
            int n = 0;
            int j = 0;
            int coordinates [] = new int [4];
            int firstCords  []= new int [4];
           //int meanCords  [] =  new int [2];



                    firstCords[0] = 3;
                    firstCords[1] = 7;
                    firstCords[2] += 7 - dice();
                    firstCords[3] = 3;

                      //  meanCords[0]= firstCords[2];
                      //  meanCords[1]= firstCords[3];
                      ////  Player1.getCords(meanCords);

                   // }



                   for (int i = 0; i < 1; i++) {
                       int p = 3;
                       coordinates[0] = firstCords[2];
                       coordinates[1] = firstCords[3];
                       coordinates[2] = coordinates[1] - dice();
                      // if(coordinates[2]==0){
                    ////       p+=1;
                     //  }
                       coordinates[3] = p;
                       //meanCords[0]= coordinates[2];
                     //  meanCords[1]= coordinates[3];
                      // Player1.getCords(meanCords);



                   //}/
               }
            if(isFirstTurn){return firstCords;}
                return coordinates;
            }

    /**
     * още нереализирани методи за зара
     * @param cord
     * @return
     */
    public  static  int [] read (int [] cord){
                int n = 0;
                int j = 0;
                int coordinates [] = new int [4];
                int firstCords  []= new int [4];



                firstCords[0] = 3;
                firstCords[1] = 7;
                firstCords[2] = 7-dice();
                firstCords[3] = 3;
                if(!isFirstTurn) {
                    for (int i = 0; i < 1; i++) {
                        int p = 3;
                        coordinates[0] = cord[2];
                        coordinates[1] = cord[3];
                        coordinates[2] = coordinates[1] - dice();
                        if(coordinates[2]==0){
                            p+=1;
                        }
                        coordinates[3] = p;



                    }
                }
                if(isFirstTurn){return firstCords;}
                return coordinates;




            }

    /**
     * Метод извършващ самото движение на играчите
     *
     * @param gameBoard  масива подаден за принтирне
     * @param cords  кординатите на масива
     */
    public static  void  move (String [][] gameBoard , int [] cords){
            String target =  gameBoard[cords[3]][cords[2]];
            if(isRightMove(gameBoard,cords)) {
               // gameBoard[cords[3]][cords[2]] = "| *  |";
               if(isFirstPlayer) {
                  gameBoard[cords[3]][cords[2]] = PLAYER_1;
                    if(isBlockTrap(gameBoard,cords)){
                        gameBoard[cords[1]][cords[0]] = TRAP;
                    }
                }else {
                    gameBoard[cords[3]][cords[2]] = PLAYER_2;
                }
                if (isFirstPlayer) {
                    if (isBlockTrap(gameBoard, cords)) {
                        gameBoard[cords[1]][cords[0]] = "| Tr |";
                        Traps.printTrapMenu();
                        Traps.trapBlock(pocketOfP1);
                        // gameBoard[cords[0]][cords[1]] = "| We  |";
                        //gameBoard[cords[0]][cords[1]] = "| Tr |";
                    } else if (isBlockChance(gameBoard, cords)) {
                        Chance.dice(pocketOfP1);
                    } else if (isBlockParty(gameBoard, cords)) {
                        PartyHard.PartyBlock(pocketOfP1);
                    } else if (isBlockSteal(gameBoard, cords)) {
                        Steal.StealBlock(Steal.getStealOption(), gameBoard, cords, pocketOfP1);
                    } else if (isBlockInvest(gameBoard, cords)) {
                        Invest.chooseYourInvest(pocketOfP1);
                    }
                    isFirstPlayer=false;
                }else{
                    if (isBlockTrap(gameBoard, cords)) {
                        gameBoard[cords[1]][cords[0]] = "| Tr |";
                        Traps.printTrapMenu();
                        Traps.trapBlock(pocketOfP2);
                        // gameBoard[cords[0]][cords[1]] = "| We  |";
                        //gameBoard[cords[0]][cords[1]] = "| Tr |";
                    } else if (isBlockChance(gameBoard, cords)) {
                        Chance.dice(pocketOfP2);
                    } else if (isBlockParty(gameBoard, cords)) {
                        PartyHard.PartyBlock(pocketOfP2);
                    } else if (isBlockSteal(gameBoard, cords)) {
                        Steal.StealBlock(Steal.getStealOption(), gameBoard, cords, pocketOfP2);
                    } else if (isBlockInvest(gameBoard, cords)) {
                        Invest.chooseYourInvest(pocketOfP2
                        );
                    }
                    isFirstPlayer=true;
                }

                }



        }

    /**
     * Метод проверяващ дали хода е правилен и в рамките на дъската
     * @param gameBoard  масива подаден за принтирне
     * @param cords кординатите на масива
     * @return връща дали е правилен хода
     */
    public static  boolean isRightMove(String [][] gameBoard , int [] cords){
            boolean isRightMove = true;
            if(gameBoard[cords[3]][cords[2]].equals(EMPTY_BLOCK)){
                isRightMove= false;
                System.out.print("Невалиден ход\n" +
                        "Опитай пак с кординати  в рамките на дъската");
            }
            return isRightMove;
        }

    /**
     * Метод проверяващ дали квадратчето върху което стъпваме е капан
     * @param gameBoard  масива подаден за принтирне
     * @param cords кординатите на масива
     * @return връща дали е капан или не
     */
        public static boolean isBlockTrap (String [][] gameBoard , int [] cords){
            boolean      isTrap= false;
            if(gameBoard[cords[3]][cords[2]].equals(TRAP)){
                isTrap= true;
            }
            return isTrap;
        }

    /**
     *
     * Метод проверяващ дали квадратчето върху което стъпваме е шанс
     * @param gameBoard  масива подаден за принтирне
     * @param cords кординатите на масива
     * @return дали квадратчето е шанс
     */
    public static boolean isBlockChance (String [][] gameBoard , int [] cords){
        boolean      isChance= false;
        if(gameBoard[cords[3]][cords[2]].equals(CHANCE)){
            isChance= true;
        }
        return isChance;
    }
    /**
     *
     * Метод проверяващ дали квадратчето върху което стъпваме е парти
     * @param gameBoard  масива подаден за принтирне
     * @param cords кординатите на масива
     * @return дали квадратчето е парти
     */
    public static boolean isBlockParty (String [][] gameBoard , int [] cords){
        boolean      isParty= false;
        if(gameBoard[cords[3]][cords[2]].equals(PARTY_HARD)){
            isParty= true;
        }
        return isParty;
    }
    /**
     *
     * Метод проверяващ дали квадратчето върху което стъпваме е кражба
     * @param gameBoard  масива подаден за принтирне
     * @param cords кординатите на масива
     * @return дали квадратчето е кражба
     */
    public static boolean isBlockSteal (String [][] gameBoard , int [] cords){
        boolean      isSteal= false;
        if(gameBoard[cords[3]][cords[2]].equals(STEAL)){
            isSteal= true;
        }
        return isSteal;
    }
    /**
     *
     * Метод проверяващ дали квадратчето върху което стъпваме е инвестиция
     * @param gameBoard  масива подаден за принтирне
     * @param cords кординатите на масива
     * @return дали квадратчето е инвестиция
     */
    public static boolean isBlockInvest (String [][] gameBoard , int [] cords){
        boolean      isInvest= false;
        if(gameBoard[cords[3]][cords[2]].equals(INVEST)){
            isInvest= true;
        }
        return isInvest;
    }

    /**
     * Метод с основния цикъл въртящ играта
     * Но поради факта че не ми отчиташе кординатите върху квадратчето старт
     * не успях да да го завърша и не знам защо не ги .....
     * @param gameBoard масива подаден за принтирне
     */
    public  static  void GameCycle ( String [][] gameBoard){
        for (int i = 0; i <gameBoard.length ; i++) {

            for (int j = 0; j <gameBoard[i].length -1 ; j++) {
                print(gameBoard);
                if(pocketOfP1<=0){
                    System.out.println("Първия играч загуби");
                    System.out.println("Всичко за теб приключи успех следващия път ");
                    System.out.printf("Победител е втория с %d шк в своя портфейл",pocketOfP2);
                    System.exit(0);
                }else if(pocketOfP2<=0){
                    System.out.println("Втория играч загуби");
                    System.out.println("Всичко за теб приключи успех следващия път ");
                    System.out.printf("Победител е първия с %d шк в своя портфейл",pocketOfP2);
                    System.exit(0);
                }
                int[] coordinates = readInput();
                System.out.printf("От позиция [ %d ,%d ] do [ %d , %d ] \n "
                        , coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
                isFirstTurn=false;
                //  read(coordinates);

                System.out.println();
                if(isFirstPlayer) {
                    //   System.out.print("Ти си на  ход \n");
                    if (isBlockTrap(gameBoard, coordinates)) {
                        Traps.printTrapMenu();
                        Traps.trapBlock(pocketOfP1);
                    } else if (isBlockChance(gameBoard, coordinates)) {
                        Chance.dice(pocketOfP1);
                    } else if (isBlockParty(gameBoard, coordinates)) {
                        PartyHard.PartyBlock(pocketOfP1);
                    } else if (isBlockSteal(gameBoard, coordinates)) {
                        Steal.StealBlock(Steal.getStealOption(), gameBoard, coordinates, pocketOfP1);
                    } else if (isBlockInvest(gameBoard, coordinates)) {
                        Invest.chooseYourInvest(pocketOfP1);
                    }
                }else{
                    System.out.print("На ход е бота\n");
                    if (isBlockTrap(gameBoard, coordinates)) {
                        Traps.printTrapMenu();
                        Traps.trapBlock(pocketOfP2);
                    } else if (isBlockChance(gameBoard, coordinates)) {
                        Chance.dice(pocketOfP2);
                    } else if (isBlockParty(gameBoard, coordinates)) {
                        PartyHard.PartyBlock(pocketOfP2);
                    } else if (isBlockSteal(gameBoard, coordinates)) {
                            Steal.StealBlock(Steal.getStealOption(), gameBoard, coordinates, pocketOfP2);
                    } else if (isBlockInvest(gameBoard, coordinates)) {
                        Invest.chooseYourInvest(pocketOfP2);
                    }
                    isFirstPlayer=false;
                }

                move(gameBoard,coordinates);
            }


        }

    }



}





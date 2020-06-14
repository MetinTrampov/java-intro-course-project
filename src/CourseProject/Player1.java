package CourseProject;

import GameMeneger.Game;

import java.util.Random;

public class  Player1 extends Game {

    public static  boolean isFirstPlayer(){
        return true;
    }

    public static int  getStealOption() {
        int g = 3;

            Random random = new Random();
            g = scanner.nextInt();
            int getRandomNumber = random.nextInt(g);
            return getRandomNumber;

        }


    public  static  int []  getCords (int [] cords){
        int [] newArr = new int [4];
        newArr[0]=cords[0];
        newArr[1]=cords[1];
        if(!isFirstTurn) {
            newArr[2] = newArr[1] - dice();
            newArr[3] = 3;
        }
        return newArr ;
    }
}

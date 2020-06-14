package CourseProject;

import GameMeneger.Game;

public class PartyHard extends Game {

    public static  int PartyBlock (int pocket){
        int lostMoneyBecauseOfBlock=25;
        pocket-=lostMoneyBecauseOfBlock;
        System.out.printf(" %s вече има %d парички . След стъпването върху ParTy Hard ",isFirstPlayer?"Първия играч":"Втория играч",pocket);
        if(isFirstPlayer){
            pocketOfP1+=pocket;
            return pocketOfP1;
        }else{
            pocketOfP2+=pocket;
            return pocketOfP2;
        }
    }
}

package CourseProject;

import GameMeneger.Game;

public class Traps extends Game {
    public static  void printTrapMenu (){

        System.out.println("Желаете ли да заложите капан?");
        System.out.println("(1) : Данъчна ревизия (100 шп)");
        System.out.println("(2) : Развод по котешки (200 шп)");
        System.out.println("(3) : Пропаганда (100 шп)");
        System.out.println("(4) : Проглеждане (50 шп)");
        System.out.println("(5) : Хазартен бос (100 шп)");
        System.out.println("(6) : Не, благодаря, не вярвам в злото");
        System.out.println();
    }

        public static  int  trapBlock (int pocket){
            //  printTrapMenu();
            System.out.println("Изберете една от следните опции");
            int n =  scanner.nextInt();
            switch (n){
                case 1 : Revision(pocket);   break;
                case 2 : CatDevorse(pocket); break;
                case 3 : Prop(pocket);        break;
                case 4 : Review(pocket);      break;
                case 5 : Boss(pocket);       break;
                default:  break;


            }


            return pocket;
        }
        public  static  int Revision (int p ){
            p-=100;
            System.out.print("Заложихте капана успешно\n");
            System.out.printf("Остават ви %d парички : ",p);
            return p;
        }
        public static  int CatDevorse(int p){
            p-=200;
            System.out.print("Заложихте капана успешно\n");
            System.out.printf("Остават ви %d парички : ",p);
            return p;
        } public static  int Prop(int p){
        p-=100;
        System.out.print("Заложихте капана успешно\n");
        System.out.printf("Остават ви %d парички : ",p);
        return p;

        } public static  int Review(int p){
        p-=50;
        System.out.print("Заложихте капана успешно\n");
        System.out.printf("Остават ви %d парички : ",p);
        return p;

        } public static  int Boss(int p){
        p-=100;
        System.out.print("Заложихте капана успешно\n");
        System.out.printf("Остават ви %d парички : ",p);
        return p;

        }
    }




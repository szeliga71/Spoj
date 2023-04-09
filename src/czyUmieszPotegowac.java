import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class czyUmieszPotegowac {

    public static void main(String[] args) {

        Person p1=new Person("Jan",22);

        System.out.println(p1);

        int koncowki[][] = {
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {6, 2, 4, 8},
                {1, 3, 9, 7},
                {6, 4, 6, 4},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {1, 7, 9, 3},
                {6, 8, 4, 2},
                {1, 9, 1, 9}};

        //long podstawa;
        //long wykladnik;

        Scanner scan = new Scanner(System.in);
        int ileProb = scan.nextInt();


        for (int i = 0; i < ileProb; i++) {

            long podstawa = scan.nextLong();
            long wykladnik = scan.nextLong();

            System.out.println(koncowki[(int) podstawa % 10][(int) wykladnik % 4]);
        }
    }
}


        /*List<Integer> proby=new ArrayList<>();

        String podstawaWykladnik;
        //String wykladnikS;
        int wynik=0;

        for(int i=0;i<ileProb;i++){
            podstawaWykladnik= scan.nextLine();
            //wykladnikS= scan.nextLine();
            String podstawa="";
            for(int k=0;k<podstawaWykladnik.length();k++)
            podstawa=podstawaWykladnik.split(" ");

            if(podstawa%10==1)
                wynik=1;
            if(podstawa%10==2){
                if((wykladnik%10)%4==1)
                    wynik=2;
            if((wykladnik%10)%4==2)
                wynik=4;
            if((wykladnik%10)%4==3)
                wynik=8;
            if((wykladnik%10)%4==0)
                wynik=6;}
            if(podstawa%10==3){
                if((wykladnik%10)%4==1)
                    wynik=3;
                if((wykladnik%10)%4==2)
                    wynik=9;
                if((wykladnik%10)%4==3)
                    wynik=7;
                if((wykladnik%10)%4==0)
                    wynik=1;
            }
            if(podstawa%10==4){
                if((wykladnik%10)%4==1)
                    wynik=4;
            else
                    wynik=6;}

            if(podstawa%10==5)
                wynik=5;

            if(podstawa%10==6)
                wynik=6;

            if(podstawa%10==7){
                if((wykladnik%10)%4==1)
                    wynik=7;
            if((wykladnik%10)%4==2)
                wynik=9;
            if((wykladnik%10)%4==3)
                wynik=3;
            if((wykladnik%10)%4==0)
                wynik=1;}
            if(podstawa%10==8){
                if((wykladnik%10)%4==1)
                    wynik=8;
            if((wykladnik%10)%4==2)
                wynik=4;
            if((wykladnik%10)%4==3)
                wynik=2;
            if((wykladnik%10)%4==0)
                wynik=6;}
            if(podstawa%10==9){
                if((wykladnik%10)%2>0)
                    wynik=1;
                else
                    wynik=9;
            }

            proby.add(wynik);

        }

        for(int wy:proby){
            System.out.println(wy);
        }
    }
}*/

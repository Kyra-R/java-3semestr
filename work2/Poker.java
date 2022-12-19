package work2;
import java.util.Scanner;
import java.util.Random;
public class Poker {
    String[] list = new String[52];
    int amount = 0;
    public void genList (){
        amount = 52;
        for(int i=0;i<52;i++){
            if(i%4==0){
                list[i]="Clubs";
            } else
            if(i%4==1){
                list[i]="Diamonds";
            } else
            if(i%4==2){
                list[i]="Hearts";
            } else
            if(i%4==3){
                list[i]="Spades";
            }

            if(i%13==0){
                list[i]+="Two";
            } else
            if(i%13==1){
                list[i]+="Three";
            } else
            if(i%13==2){
                list[i]+="Four";
            } else
            if(i%13==3){
                list[i]+="Five";
            } else
            if(i%13==4){
                list[i]+="Six";
            } else
            if(i%13==5){
                list[i]+="Seven";
            } else
            if(i%13==6){
                list[i]+="Eight";
            } else
            if(i%13==7){
                list[i]+="Nine";
            } else
            if(i%13==8){
                list[i]+="Ten";
            } else
            if(i%13==9){
                list[i]+="Jack";
            } else
            if(i%13==10){
                list[i]+="Queen";
            } else
            if(i%13==11){
                list[i]+="King";
            } else
            if(i%13==12){
                list[i]+="Ace";
            }
        }
    }

    public void mixCards (){
        final Random random = new Random();
        int first;
        int second;
        String temp;
        for(int i=0;i<100;i++){
            first = (random.nextInt()%50+49)%52;
            second = (random.nextInt()%50+49)%52;
            temp = list[first];
            list[first]=list[second];
            list[second]=temp;
        }
    }

    public void giveCards (){
        System.out.println("============");
        for(int i=0;i<52;i++){
            System.out.println(list[i]);
        }
        System.out.println("============");
    }

    public void startGame (int n){
        for(int i=0;i<n;i++){
            if(amount>4){
                System.out.println("Player "+(i+1)+":");
                for(int j=0;j<5;j++){
                    System.out.println(list[amount-1]);
                    amount-=1;
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Poker game = new Poker ();
        System.out.println("How many players there are?");
        int players = in.nextInt();
        game.genList();
        game.giveCards();
        game.mixCards();
        game.giveCards();
        game.startGame(players);
    }
}

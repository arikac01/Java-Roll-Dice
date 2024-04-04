//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int currentSpace = 0;
        int spaceTogo;
        int rolls = 5;
        int maxSpace = 20;
        for (int i= 1; i<=rolls; i++ ){
            int dice = random.nextInt(6)+1;
            currentSpace +=dice;
            spaceTogo = maxSpace - currentSpace;
            if(currentSpace == maxSpace){
                System.out.println("roll # " + i +"rolled dice: " + dice + "You Won" );
                break;
            }
            else if (i == rolls && currentSpace < maxSpace){
                System.out.println("roll # " + i +"rolled dice: " + dice + "; "+ spaceTogo + "more to go, YOU LOOSE!" );
                break;
            }
            else if (i== rolls && currentSpace > maxSpace){
                System.out.println("roll # " + i +"rolled dice: " + dice + "; "+ spaceTogo + " Over! YOU LOOSE." );
                break;
            }
            else {
                System.out.println("roll # " + i +"rolled dice: " + dice + "; "+ spaceTogo + "more to go" );
            }
        }
    }
}
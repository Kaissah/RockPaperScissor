
package rockpaperscissor;
import java.util.Scanner;
public class RockPaperScissor {

    public static void main(String[] args) {
        
        int score=0;
        int botscore=0;
        boolean state=true;
        do{
        Scanner sc = new Scanner(System.in);

        double A=Math.round((Math.random()*100)-1);
        System.out.println("ROCK-PAPER-SCISSOR");
        System.out.print("Enter choice: ");
       
        String choice = sc.nextLine().toLowerCase();
        if(choice.equals("rock")||choice.equals("paper")||choice.equals("scissor")){   
        String Bot="";
        
            if(A==0||A<=33){
                Bot="Rock";
                System.out.println("Bot choice: "+Bot);
            }
            if (A>33&&A<=66){
                Bot="Paper";
                System.out.println("Bot choice: "+Bot);
            }
            if(A>66&&A<=99){
                Bot="Scissor";
                System.out.println("Bot choice: "+Bot);
            }
            
            if(choice.equalsIgnoreCase(Bot))
                {System.out.println("DRAW");}
            
            if("rock".equals(choice)&&"Paper".equals(Bot) || "paper".equals(choice)&&"Scissor".equals(Bot) || "scissor".equals(choice)&&"Rock".equals(Bot))
                {   botscore++;
                    System.out.println("You Lose");}
                
            if("paper".equals(choice)&&"Rock".equals(Bot) || "rock".equals(choice)&&"Scissor".equals(Bot) || "scissor".equals(choice)&&"Paper".equals(Bot))
                {   score++;
                    System.out.println("You Win");
                }                               
               System.out.println("YOU-" +score +" | BOT-"+botscore);
        }
        else{
            System.out.println("Invalid Input!");}
            boolean input=true;
            do{
                
            System.out.print("Want to try Again? [y] or [n]: \n");
           
            String again = sc.nextLine();
            System.out.println("----------------------------------------------");
                if(again.equals("y")||again.equals("n")){
                    input=true;
                    if(again.equals("y")){
                        state=true;
                    }
                    else
                        state=false;}
                else{
                    System.out.println("Invalid input! try again");
                    input=false;
                }
            }while(input==false);
            
        }while(state==true);
            System.out.println("Thank you for playing");
            System.exit(0);
    }    
}

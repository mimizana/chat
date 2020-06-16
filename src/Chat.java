import java.util.Scanner;

public class Chat {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?:");
        String userInput =sc.nextLine();
        System.out.println("Nice to meet you," +userInput +  "How has your day been?");
        String userInput2 =sc.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that" + userInput2 +"? ");
        String userInput3 =sc.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
        System.out.println ("Here are your responses:" + userInput +"," + userInput2 +"," + userInput3 +"," + ":)");
    }

}








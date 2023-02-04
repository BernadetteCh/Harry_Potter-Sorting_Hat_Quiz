package org.example.view;
import org.example.view.Display;
import java.util.Scanner;

public class Input {

   public String startQuiz() {
       Scanner enter = new Scanner(System.in);
       String userStartsQuiz = enter.nextLine();
       return userStartsQuiz;
   }

    public void getUserName() {
        System.out.println("Before we can teach you here in Hogwarts type in you Name");
        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();
        Display displayMessage = new Display();
        displayMessage.printMessage("G'day Muggle! " + userName + " you made it to Hogwarts. Now it's time to check in which house you belong. \n" +  "The hat is ready so are you ? Than just press Enter to start the quiz");
    }
}

package org.example;
import org.example.model.Dialogues;
import org.example.model.QuizQuestions;
import org.example.view.Display;
import org.example.view.Input;
import org.example.controller.Logic;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Input userInput = new Input();
        Display displayMessage = new Display();
        displayMessage.printMessage(Dialogues.introduction);
        userInput.getUserName();
        String userStartsQuiz = userInput.startQuiz();
        Logic logic = new Logic();
        boolean userStartsTheGame =  logic.startGame(userStartsQuiz);

        String[] quizQuestions = {QuizQuestions.firstQuestion,QuizQuestions.secondQuestion,QuizQuestions.thirdQuestion,QuizQuestions.fourthQuestion,QuizQuestions.fifthQuestion,QuizQuestions.sixthQuestion,QuizQuestions.seventhQuestion,QuizQuestions.eighthQuestion,QuizQuestions.ninthQuestion,QuizQuestions.tenthQuestion};

        if(userStartsTheGame) {
            int countPoints = 0;
            displayMessage.printMessage(Dialogues.sortinHat);
            for(String question : quizQuestions) {
                logic.displayQuizQuestion(question);
                displayMessage.printMessage("Type in a, b, c, or d");
                Scanner answer = new Scanner(System.in);
                String userAnswer = answer.nextLine();
                logic.setUserAnswer(userAnswer);
                int pointFromAnswer=  logic.saveAchievedPoints();
                countPoints += pointFromAnswer;

            }
            System.out.println(countPoints + "GESAMTPUNKTE");
            String winningHouse =  logic.checkWhichHogwartsHouse(countPoints);
            displayMessage.printMessage("Your future home is in ");
            displayMessage.printMessage(winningHouse);


        }

    }
}
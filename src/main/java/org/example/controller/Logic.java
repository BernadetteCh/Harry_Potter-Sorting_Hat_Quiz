package org.example.controller;
import org.example.model.HogwartsHouses;
import org.example.model.HousePoints;
import org.example.view.Display;
import org.example.model.Answers;

public class Logic {
private String userAnswer;
public boolean startGame(String userInput) {
    if (userInput.isEmpty()) {
        return true;
    }
    return false;
}

public String checkWhichHogwartsHouse(int sum) {
    int gryffindorStart = HousePoints.GRYFFINDOR.getRangeStart();
    int gryffindorEnd= HousePoints.GRYFFINDOR.getRangeEnd();
    int hufflepuffRangeStart = HousePoints.HUFFLEPUFF.getRangeStart();
    int hufflepuffRangeEnd = HousePoints.HUFFLEPUFF.getRangeEnd();
    int ravenclawRangeStart=HousePoints.RAVENCLAW.getRangeStart();
    int ravenclawRangeEnd=HousePoints.RAVENCLAW.getRangeEnd();
    int slytherinRangeStart=HousePoints.SLYTHERIN.getRangeStart();
    int slytherinRangeEnd=HousePoints.SLYTHERIN.getRangeEnd();
    if(sum >= gryffindorStart && sum <= gryffindorEnd) {
        return HogwartsHouses.Gryffindor;
    }
    if(sum>= hufflepuffRangeStart && sum<=hufflepuffRangeEnd) {
        return HogwartsHouses.Hufflepuff;
    }
    if(sum >=ravenclawRangeStart && sum <= ravenclawRangeEnd) {
        return HogwartsHouses.Ravenclaw;
    }
    if(sum >= slytherinRangeStart && sum <= slytherinRangeEnd) {
        return HogwartsHouses.Slytherin;
    }
    return null;
}
public int saveAchievedPoints() {

    if(userAnswer.isBlank()) {
      return -1;

    }else {

        if(userAnswer.trim().equalsIgnoreCase(Answers.A.toString())) {
            return Answers.A.getPoints();
        }
        if(userAnswer.trim().equalsIgnoreCase(Answers.B.toString())) {
            return Answers.B.getPoints();
        }
        if(userAnswer.trim().equalsIgnoreCase(Answers.C.toString())) {
            return Answers.C.getPoints();
        }
        if(userAnswer.trim().equalsIgnoreCase(Answers.D.toString())) {
            return Answers.D.getPoints();
        }
    }

return 0;
}

public void displayQuizQuestion(String question) {
    Display displayMessageToUser = new Display();
    String firstQuestion = question;
    displayMessageToUser.printMessage(firstQuestion);
}

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
}

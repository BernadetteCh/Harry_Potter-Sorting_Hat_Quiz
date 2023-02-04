package org.example.model;

public enum Answers {
    A(1),
    B(2),
    C(3),
    D(4);
    private int points;
    Answers(int point) {
     this.points = point;
 }



    public int getPoints() {
        return points;
    }



        }

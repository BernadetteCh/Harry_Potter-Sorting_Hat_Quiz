package org.example.model;

public enum HousePoints {
    HUFFLEPUFF(0,16),
    RAVENCLAW(17,24),
    GRYFFINDOR(25,32),
    SLYTHERIN(33,40);

    int rangeStart;
    int rangeEnd;
    HousePoints(int rangeStart, int rangeEnd) {
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    public int getRangeStart() {
        return rangeStart;
    }

    public int getRangeEnd() {
        return rangeEnd;
    }

}

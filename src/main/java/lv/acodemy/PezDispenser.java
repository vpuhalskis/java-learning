package lv.acodemy;

import lombok.Getter;
import lombok.Setter;

public class PezDispenser {
    @Getter
    @Setter
    private String nameOfHero;
    @Getter
    @Setter
    private String colour;
    @Getter
    @Setter
    private String series;
    @Getter
    @Setter
    private int capacity;

    public PezDispenser(String series, String colour, String nameOfHero) {
        this.series = series;
        this.colour = colour;
        this.nameOfHero = nameOfHero;
        this.capacity = 9;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "nameOfHero='" + nameOfHero + '\'' +
                ", colour='" + colour + '\'' +
                ", series='" + series + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public void eat() {
        if (capacity == 0) {
            System.out.println("You already have eaten all candies");
        } else {
            System.out.println("You have eaten 1 candy");
            capacity--;
            System.out.println("You have: " + capacity);
        }
    }

    public void eat(int candyCount) {
        if (candyCount > capacity) {
            System.out.println("You don't have enough candy");
            System.out.println("You have only: " + capacity);
        } else if (candyCount == 0) {
            System.out.println("You gonna eat???");
        } else if (candyCount < 0) {
            System.out.println("Impossible amount");

        } else if (candyCount <= capacity) {
            System.out.println("You have eaten:" + candyCount);
            capacity = capacity - candyCount;
            System.out.println("You have: " + capacity);
        } else if (candyCount == 0) {
            System.out.println("You gonna eat???");
        } else if (candyCount < 0) {
            System.out.println("Impossible amount");
        }
    }

    public void add() {
        if (capacity >= 0 && capacity <= 8) {
            System.out.println("You have putted one candy");
            capacity++;
            System.out.println("Now you have: " + capacity);
        } else if (capacity <= 8) {
            System.out.println("You have putted one candy ");
            capacity++;
            System.out.println("You have: " + capacity);
        } else {
            System.out.println("You can't put more candie's, your PuzDispenser" + nameOfHero + " is full");
            System.out.println("You have: " + capacity);
        }
    }


    public void add(int addMore) {

        int total = capacity + addMore;
        int total2 = 9 - capacity;

        if (capacity >= addMore && total > 9) {
            System.out.println("You can't put this amount: " + addMore);
            System.out.println(" You can try to put: " + total2);

        } else if (capacity >= addMore && total <= 9) {
            System.out.println("You have putted " + addMore + " " + "candie's");
            capacity = addMore + capacity;
            System.out.println("You have: " + capacity);

        } else if (addMore > capacity && total <= 9) {
            System.out.println("You have putted " + addMore + " " + "candie's");
            capacity = addMore + capacity;
            System.out.println("You have: " + capacity);
        } else {
            System.out.println("You can't put this amount: " + addMore);
            System.out.println(" You can try to put: " + total2);
        }

    }
}



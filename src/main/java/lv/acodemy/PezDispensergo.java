package lv.acodemy;

public class PezDispensergo {

    public static void main(String[] args) {
        PezDispenser one = new PezDispenser("Mario World", "Green", "Luigi");
        System.out.println(one);

        one.eat();
        System.out.println(one);
        one.eat();
        System.out.println(one);
        one.eat(7);
        System.out.println(one);
        one.add(5);
        one.eat(5);
        one.add(4);
        one.add();
        one.add(10);
        one.eat();
        one.eat();
        one.eat(2);
        one.add();
        one.add(1);
        one.add(2);
        one.add(4);
        one.add();
        one.add(-2);


    }
}

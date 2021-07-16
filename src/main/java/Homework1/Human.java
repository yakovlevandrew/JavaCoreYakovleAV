package Homework1;

public class Human{
    private String name;
    private int jump;
    private int run;

//    public Human() {
//    }

    public Human(String name, int jump, int run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
    }


    public String getName() {
        return name;
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }


//    @Override
//    public void jumpAndRun(String name, int jump, int run, int height, int length) {
//
//        if (jump >= height) {
//            System.out.println(name + " перепрыгнул!");
//        } else {
//            System.out.println(name + " не перепрыгнул!");
//        }
//        if (run >= length) {
//            System.out.println(name + " пробежал!");
//        } else {
//            System.out.println(name + " не пробежал!");
//        }
//    }
}






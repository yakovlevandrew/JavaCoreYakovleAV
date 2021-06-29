package Homework1;

public class Main {


    public static void main(String[] args) {

        int heightTmp = 1;
        int lengthTmp = 2;

        Human human = new Human("Человек", 3, 4);
        Robot robot = new Robot("Робот", 1, 3);
        Cat cat = new Cat("Кот", 4, 2);

        RunningWay runningWay = new RunningWay(lengthTmp);
        Wall wall = new Wall(heightTmp);


        String[] commandName = new String[] {
                human.getName(),
                robot.getName(),
                cat.getName(),
                human.getName(),
                robot.getName(),
                cat.getName()
        };


        int[] command = new int[] {
                human.getJump(),
                robot.getJump(),
                cat.getJump(),
                human.getRun(),
                robot.getRun(),
                cat.getRun()
        };


        int[] walkAndJump = new int[] {wall.getHeight(), runningWay.getLength()};


//        Проверка прыжков
        for (int i = 0; i < 3; i++) {
            if (command[i] >= walkAndJump[0]) {
                System.out.println(commandName[i] + " перепрыгнул!");
                    }else {
                System.out.println(commandName[i] + " не перепрыгнул");
            }
            }


//        Проверка бега
        for (int i = 3; i < 6; i++) {
            if (command[i] >= walkAndJump[1]) {
                System.out.println(commandName[i] + " пробежал!");
            }else {
                System.out.println(commandName[i] + " не пробежал");
            }
        }
        }
    }


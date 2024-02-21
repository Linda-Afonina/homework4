public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int age = 27;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        age = 7;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать.");
                    }

        System.out.println("Задача 2.");
        int temperature = -10;
        if (temperature <=5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        temperature = 25;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        System.out.println("Задача 3.");
        int speedOfCar = 65;
        if (speedOfCar > 60) {
            System.out.println("Если скорость " + speedOfCar + ", то придется заплатить штраф.");
        }
        speedOfCar = 60;
        if (speedOfCar <= 60) {
            System.out.println("Если скорость " + speedOfCar + ", то можно ездить спокойно.");
        }

        System.out.println("Задача 4.");
        int age1 = 2;
        int age2 = 8;
        int age3 = 22;
        int age4 = 30;

        if (age1 >=2 && age1 <=6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад.");
        }
        if (age2 >= 7 && age2 <=17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        }
        if (age3 >= 18 && age3 <=24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет.");
        }
        if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу.");
        }
        else {
            System.out.println("Некорректный возраст");
        }

        System.out.println("Задача 5.");
        int ageOfKid1 = 4;
        int ageOfKid2 = 7;
        int ageOfKid3 = 17;

        if (ageOfKid1 < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfKid1 +
                    ", то ему нельзя кататься на аттракционе.");
            }
        if (ageOfKid2 >=5 && ageOfKid2 < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfKid2 +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + ageOfKid3 +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задача 6.");
        int freePlaces = 80;

        if (freePlaces <60 && freePlaces > 0) {
            System.out.println("В вагоне есть свободные сидячие места.");
        }
        else if (freePlaces >=60 && freePlaces <102) {
            System.out.println("В вагоне есть свободные стоячие места.");
            }
        else {
            System.out.println("В вагоне нет свободных мест.");
        }

        System.out.println("Задача 7.");
        int one = 444;
        int two = 378;
        int three = 928;

        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}
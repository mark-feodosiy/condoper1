import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Задача № 1
        {
            int age = 17;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний ");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
            }
        }
        System.out.println();
        // Задача № 2
        {
            int temp = -6;
            if (temp <= 5) {
                System.out.println("На улице " + temp + " градусов. На улице холодно, нужно надеть шапку");
            } else {
                System.out.println("На улице " + temp + " градусов. Сегодня тепло, можно идти без шапки");
            }
        }
        System.out.println();
        // Задача № 3
        {
            int speed = 62;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
            }
        }
        System.out.println();
        // Задача № 4
        {
            int age = 16;
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему надо ходить в детский сад");
            }
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему надо ходить в школу");
            }
            if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + ", то его место в университете");
            }
            if (age > 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
            }
        }
        System.out.println();
        // Задача № 5
        {
            int age = 16;
            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            }
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", он может кататься только в сопровождении взрослого");
            }
            if (age >= 14) {
                System.out.println("Если возраст ребенка равен " + age + ", он может кататься без сопровождения взрослого");
            }
        }
        System.out.println();
        // Задача № 6
        {
            int passengers = 800;
            int totalSeats = 102;
            int seating = 60;
            int standing = totalSeats - seating;
            int remainingSeats = totalSeats - passengers;
            if (remainingSeats < 0) {
                System.out.println("Свободных мест в вагоне нет. Вагон полностью забит");
            } else {
                System.out.println("В вагоне есть свободное место");
            }
            if (passengers <= seating) {
                System.out.println("В вагоне есть свободные сядячие и стоячие места");
            }
            if ((passengers > seating) && (passengers <= totalSeats)) {
                System.out.println("Свободных сидячих мест нет. Есть свободные стоячие места");
            }
            System.out.println();
        // Задача № 7
            {
                int one = 7;
                int two = 11;
                int three = 9;
                if ((one > two) && (two > three)) {
                    System.out.println("Самое большое число " + one);
                }
                else if ((one < two) && (two > three)) {
                        System.out.println("Самое большое число " + two);
                       } else {
                    System.out.println("Самое большое число " + three);
                }
            }

        }

    }
}
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
            int temp = - 6;
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
            int age = 62;
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен" + age + ", то ему надо ходить в детский сад");
            }
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен" + age + ", то ему надо ходить в школу");
            }
            if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен" + age + ", то его место в университете");
            }
            if (age > 24) {
                System.out.println("Если возраст человека равен" + age + ", то ему пора ходить на работу");
            }

        }

    }



}
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int age = 32;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил. Тебе нужно немного подождать");
        }

        System.out.println("Задание 2");
        int age2 = 23;
        if (age2 >= 7 && age2 < 18 && age2 >= 18 && age2 < 24) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Человек уже закончил школу");
        }
        if (age2 >= 24)
            System.out.println("Человек окончил университет");

        System.out.println("Задание 3");
        int passenger = 10;
        if (passenger < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (passenger >= 60 && passenger < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        //Домашнее задание 3
        System.out.println("Задание 1");
        int age3 = 23;
        if (age3 >=2 && age3 <6) {
            System.out.println("Если возраст человека равен " + age3 +", то ему нужно ходить в детский сад");
        } else if (age3 >= 7 && age3 <= 18) {
            System.out.println("Если возраст человека равен " + age3 +", то ему нужно ходить в школу");
        } else if (age3 > 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен " + age3 +", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age3 +", то ему нужно ходить на работу");
        }

        System.out.println("Задание 2");
        int Age = 8;
        if (Age <= 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }
        if (Age >5 && Age <14) {
            System.out.println("Можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else {
            System.out.println("Можно кататься без сопровождения взрослого");
        }
    }
}
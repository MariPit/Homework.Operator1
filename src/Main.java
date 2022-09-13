public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил. Тебе нужно немного подождать");
        }

        System.out.println("Задание 2");
        int age2 = 18;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Человек уже закончил школу");
        }
        if (age2 >= 24) {
            System.out.println("Человек окончил университет");
        }

        System.out.println("Задание 3");
        int passenger = 102;
        if (passenger < 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (passenger >= 60 && passenger < 102) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (passenger >= 102) {
            System.out.println("Вагон уже полностью забит");
        }
    }
}
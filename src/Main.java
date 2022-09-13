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
    }
}
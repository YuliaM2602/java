import java.util.Scanner;

public class HomeWork3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число.");
        play();
    }
    private static void play (){
        int range = 100;
        int number = (int) (Math.random() * range);
        playLevel(range, number);
        scanner.close();
    }
    private static void playLevel(int range, int number) {
        int step = 8;
        while (true) {
            step = step - 1;
            if (step == 1){
                System.out.println("Вы проиграли. Повторить игру еще раз? 1-да, 0-нет.");
                int input_answer = scanner.nextInt();
                if (input_answer == 1){
                    play();
                }else {
                    System.out.println("Пока!");
                    break;
                }
            }

            System.out.println("Угадайте число от 0 до " + range + "\nУ Вас " + step + " попыток" );
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали. Повторить игру еще раз? 1-да, 0-нет.");
                int input_answer = scanner.nextInt();
                if (input_answer == 1){
                    play();
                }else {
                    System.out.println("Пока!");
                    break;
                }
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}

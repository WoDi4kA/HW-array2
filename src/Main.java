import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task#1
        int [] array = {5000, 3500, 4200, 3700, 2900};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        System.out.println("Сумма трат за меся составила " + count + " рублей");

        System.out.println();
        //Task#2

        int minimalValue = 99999;
        int maximumValue = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximumValue) {
                maximumValue = array[i];
            }
            if (array[i] < minimalValue) {
                minimalValue = array[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maximumValue + " рублей");
        System.out.println("Минимальная сумма трат за неделю составила " + minimalValue + " рублей");

        System.out.println();
        //Task#3

        float count1 = 0;
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            count1 += array[i];
        }
        result = count1 / 5;
        System.out.println(count1 / array.length);

        System.out.println();
        //Task#4

        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(reverseFullName[i]);
                break;
            }
            System.out.print(reverseFullName[i] + ", ");
        }

    }
}
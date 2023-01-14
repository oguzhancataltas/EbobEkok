import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, i = 1, ebob = 1, small, large;

        System.out.print("Birinci sayıyı giriniz : ");
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı Giriniz : ");
        number2 = input.nextInt();

        small = Math.min(number1, number2);
        large = Math.max(number1,number2);

        while (i <= small) {


            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Bu iki sayının EBOB'u : " + ebob);

        i = large;

        while (i <= number1 * number2) {

            if (i % number1 == 0 && i % number2 == 0){
                System.out.println("Bu iki sayının EKOK'U : " + i);
                break;
            }

            i++;
        }
    }
}

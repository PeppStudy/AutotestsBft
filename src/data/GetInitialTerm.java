package data;

import java.util.Locale;
import java.util.Scanner;

public class GetInitialTerm {

    public int returnTerm() {
        int depositTerm = 0;
        while (depositTerm == 0) {
            Scanner scanTerm = new Scanner(System.in);
            scanTerm.useLocale(Locale.US);

            System.out.println("Укажите срок вклада в месяцах");

            if (scanTerm.hasNextInt()) {
                int months = Math.abs(scanTerm.nextInt());
                if (months > 36 || months == 0) {
                    System.out.println("Срок вклада не может быть меньше одного и больше 36 месяцев");
                }
                else {
                    depositTerm = months;
                }
            }
            else {
                System.out.println("Допустимы только целые числа");
            }

        }
        return depositTerm;
    }

}

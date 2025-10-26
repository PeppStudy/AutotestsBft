package data;

import java.util.Locale;
import java.util.Scanner;

public class GetInitialSum {

    public float returnSum() {
        float depositSum = 0;
        while (depositSum == 0) {
            Scanner scanSum = new Scanner(System.in);
            scanSum.useLocale(Locale.US);

            System.out.println("Укажите сумму вклада");

            if (scanSum.hasNextInt()) {
                depositSum = Math.abs(scanSum.nextInt());
            }
            else if (scanSum.hasNextFloat()) {
                depositSum = Math.abs(scanSum.nextFloat());
            }
            else {
                System.out.println("Пожалуйста, введите число");
            }

        }
        return depositSum;
    }

}

import data.Count;
import data.GetInitialSum;
import data.GetInitialTerm;

public class Main {

    public static void main(String[] args) {

        float depositSum;
        int depositTerm;

        GetInitialSum getInitialSum = new GetInitialSum();
        depositSum = getInitialSum.returnSum();

        GetInitialTerm getInitialTerm = new GetInitialTerm();
        depositTerm = getInitialTerm.returnTerm();

        Count count = new Count(depositSum, depositTerm);
        float resultSum = count.calculate();
        System.out.printf("Общая сумма вклада: %f руб.", resultSum);
    }

}

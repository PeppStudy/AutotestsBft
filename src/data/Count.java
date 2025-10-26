package data;

public class Count {

    private float initialSum;
    private int initialTerm;

    public Count(float initialSum, int initialTerm) {
        this.initialSum = initialSum;
        this.initialTerm = initialTerm;
    }

    public float calculate() {
        float sum = initialSum;
        int term = 1;

        while (term <= initialTerm) {
            sum += sum * 0.07;
            term++;
        }
        return sum;
    }
}

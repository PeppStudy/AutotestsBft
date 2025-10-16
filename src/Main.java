import data.Fizik;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {

            // диапазон годов рождения
            int minBirthYear = (int) (Math.random() * 15) + 1930;
            int maxBirthYear = (int) (Math.random() * 15) + 1975;

            Fizik fizik = new Fizik(minBirthYear, maxBirthYear);

            String fio = Fizik.Fio.chooseFio();
            int birthYear = fizik.setBirthYear();

            System.out.println("ID: " + Fizik.changeId());
            System.out.println("ФИО: " + fio);
            System.out.println("Год рождения: " + birthYear + "\n");
        }
    }

}

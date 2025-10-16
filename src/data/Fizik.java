package data;

public class Fizik {

    public static long id;
    public int minBirthYear;
    public int maxBirthYear;

    public Fizik(int minBirthYear, int maxBirthYear) {
        this.maxBirthYear = maxBirthYear;
        this.minBirthYear = minBirthYear;
        id++;
    }

    public static String changeId() {
        return "0000" + id;
    }

    public int setBirthYear() {
        return ((int) (Math.random() * (maxBirthYear -  minBirthYear)) + minBirthYear);
    }

    public static class Fio {

        static String[] firstNameArray = {"Алексей", "Аристарх", "Бронислав", "Георгий", "Николай", "Петр", "Федор"};
        static String[] middleNameArray = {"Афанасьевич", "Германович", "Иосифович", "Кириллович", "Максимилианович", "Петрович", "Феликсович"};
        static String[] surnameArray = {"Абрамовский", "Венецианов", "Добровольский",  "Корчагин", "Сусликов", "Черкасов", "Шушко"};

        public static int randomItem(String[] nameArray) {
           return (int) (Math.random() * nameArray.length);
        }

        public static String chooseFio() {

            String surname = surnameArray[randomItem(surnameArray)];
            String middleName = middleNameArray[randomItem(middleNameArray)];
            String firstName = firstNameArray[randomItem(firstNameArray)];

            return surname + " " + firstName + " " + middleName;

        }
    }

}

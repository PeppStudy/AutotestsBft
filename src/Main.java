import data.Car;

public class Main {

    public static void main(String[] args) {

        Car volga = new Car();
        volga.setModel("Волга");
        volga.setYear(1976);
        System.out.println(volga.getModel() + " " + volga.getYear());
        volga.makeBeBe();

        Car renault = new Car("Рено", 2020);
        System.out.println(renault.getModel() + " " + renault.getYear());
        renault.makeBeBe();

        Car mercedes = new Car("Мерседес");
        System.out.println(mercedes.getModel() + " " + mercedes.getYear());
        mercedes.setYear(2019);
        mercedes.makeBeBe();

    }

}

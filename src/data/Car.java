package data;

public class Car {

    private int year;
    private String model;

    public Car() {
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(String model) {
        this.model = model;
        year = 2023;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void makeBeBe() {
        System.out.printf("Би-би! Я «%s» %d-го года%n", model, year);
    }
}

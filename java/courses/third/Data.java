package courses.third;

public class Data {
    private String name;
    private double note;

    public Data() {
    }

    public Data(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

}

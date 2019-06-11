package main.java.example;

public class Data {

    private int id;
    private String name;

    private double testdata;

    public Data(int id, String name, double testdata) {
        this.id = id;
        this.name = name;
        this.testdata = testdata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestdata() {
        return testdata;
    }

    public void setTestdata(double testdata) {
        this.testdata = testdata;
    }
}

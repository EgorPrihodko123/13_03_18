package zavod;


public abstract class Employer {


    private String name;
    private int salary;
    public abstract int doSalary();
    private int year;
    private int koef=1;

    public Employer(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getKoef() {
        return koef;
    }

    public void setKoef(int koef) {
        this.koef = koef;
    }

    public Employer(String name, int year, int koef) {
        this.name = name;
        this.year = year;
        this.koef=koef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

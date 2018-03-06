package zavod;


public class Manager extends Employer {


    private int salary =1500;

    public Manager(String name, int year,int koef) {
        super(name, year, koef);
    }

    @Override
    public int doSalary() {
        return salary*super.getYear()*super.getKoef();
    }
}

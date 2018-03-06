package zavod;


public class Worker extends Employer {

    private int salary =500;

    public Worker(String name, int age, int koef) {
        super(name,age,koef);
    }

    @Override
    public int doSalary() {
        return salary*super.getYear()*super.getKoef();
    }
}

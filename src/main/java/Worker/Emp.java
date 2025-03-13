package Worker;

public class Emp {
    private long id;
    private String name;
    private double salary;

    public Emp() {
    }

    public Emp(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

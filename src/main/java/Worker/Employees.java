package Worker;

public class Employees {
    private int eid;
    private String ename;
    private int depId;
    private double salary;

    public Employees() {
    }

    public Employees(int eid, String ename, int depId, double salary) {
        this.eid = eid;
        this.ename = ename;
        this.depId = depId;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{"
               + "eid="
               + eid
               + ", ename='"
               + ename
               + '\''
               + ", depId="
               + depId
               + ", salary="
               + salary
               + '}';
    }
}
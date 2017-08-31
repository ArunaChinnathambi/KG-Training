

public class EmployeeTable {
    private String id, name, date, mailId;
    private int team, salary;

    public EmployeeTable setId(String temp) {
        id = temp;
        return this;
    }

    public String getId() {
        return id;
    }

    public EmployeeTable setName(String temp) {
        name = temp;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmployeeTable setSalary(int temp) {
        salary = temp;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public EmployeeTable setTeam(int temp) {
        team = temp;
        return this;
    }

    public int getTeam() {
        return team;
    }

    public EmployeeTable setDate(String temp) {
        date = temp;
        return this;
    }

    public String getDate() {
        return date;
    }

    public EmployeeTable setMailId(String temp) {
        mailId = temp;
        return this;
    }

    public String getMailId() {
        return mailId;
    }

    public String toString() {
        return id + "\t" + name + "\t" + salary + "\t" + team + "\t" + date + "\t" + mailId;
    }
}
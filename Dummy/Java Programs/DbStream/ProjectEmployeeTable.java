

public class ProjectEmployeeTable {
    private int employeeId;
    private int projectId;

    public ProjectEmployeeTable setEmployeeId(int temp) {
        employeeId = temp;
        return this;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public ProjectEmployeeTable setProjectId(int temp) {
        projectId = temp;
        return this;
    }

    public int getProjectId() {
        return projectId;
    }
}
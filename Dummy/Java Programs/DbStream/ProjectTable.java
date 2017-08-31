

public class ProjectTable {
    private int id;
    private String name;
    private int teamId;

    public ProjectTable setId(int temp) {
        id = temp;
        return this;
    }

    public int getId() {
        return id;
    }

    public ProjectTable setName(String temp) {
        name = temp;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectTable setTeamId(int temp) {
        teamId = temp;
        return this;
    }

    public int getTeamId() {
        return teamId;
    }
}
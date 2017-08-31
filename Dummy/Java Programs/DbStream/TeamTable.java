

public class TeamTable {
    private int id;
    private String name;

    public TeamTable setId(int temp) {
        id = temp;
        return this;
    }

    public int getId() {
        return id;
    }

    public TeamTable setName(String temp) {
        name = temp;
        return this;
    }

    public String getName() {
        return name;
    }
}
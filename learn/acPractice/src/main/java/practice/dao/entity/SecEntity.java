package practice.dao.entity;

public class SecEntity {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecEntity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SecEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}

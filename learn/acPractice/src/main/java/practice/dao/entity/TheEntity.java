package practice.dao.entity;

public class TheEntity {
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public TheEntity(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TheEntity{" +
                "age='" + age + '\'' +
                '}';
    }
}

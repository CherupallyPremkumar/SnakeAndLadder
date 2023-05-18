package Pojo;

public class Person {
    String name;
    Boolean isWon;
    Integer position;

    public Person(String name) {
        isWon=false;
        this.name = name;
        this.position=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWon() {
        return isWon;
    }

    public void setWon(Boolean won) {
        isWon = won;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", isWon=" + isWon +
                ", position=" + position +
                '}';
    }
}

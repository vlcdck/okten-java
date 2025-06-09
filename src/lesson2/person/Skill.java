package lesson2.person;

public class Skill {
    private String title;
    private int exp;

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }
}

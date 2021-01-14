package corejava.chapter5.abstractClasses;

/**
 * Java核心技术5-5.
 */
public abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package zjuwengkai.foxandrabbit.animal;

public abstract class Animal {
    private int ageLimit;
    private int breedableAge;
    private int age;
    private boolean isAlive = true;

    public Animal(int ageLimit, int breedableAge) {
        this.ageLimit = ageLimit;
        this.breedableAge = breedableAge;
    }

    protected int getAge() {
        return age;
    }

    protected double getAgePercent() {
        return age;
    }

    public abstract Animal breed();

    public void grow() {
        age++;
        if (age >= ageLimit) {
            die();
        }
    }

    public void die() {
        isAlive = false;
    }
}

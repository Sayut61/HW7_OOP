package Task2;

public enum Animals {
    ELEPHANT(12), CAT(3), DOG(6), BIRD(1);
    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals " + name() + "{" +
                "age=" + age +
                '}';
    }
}

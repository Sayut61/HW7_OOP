package dop;

public enum Vehicles {
    AUTO(10000, "GREEN"), PLANE(320000, "WHITE"), MOTO(3400, "BLACK"), HELLICOPTER(280000, "BLUE"), SHIP(500000, "GRAY");
    int cost;
    String colour;

    Vehicles(int cost, String colour) {
        this.cost = cost;
        this.colour = colour;
    }

    public int getCost() {
        return cost;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return name() + " {" +
                "cost=" + cost +
                ", colour='" + colour + '\'' +
                '}';
    }
}

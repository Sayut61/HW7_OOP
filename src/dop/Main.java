package dop;

public class Main {
    public static void main(String[] args) {
        Vehicles auto = Vehicles.AUTO;
        Vehicles plane = Vehicles.PLANE;
        Vehicles helicopter = Vehicles.HELLICOPTER;
        Vehicles ship = Vehicles.SHIP;
        Vehicles moto = Vehicles.MOTO;

        System.out.println(auto.name() + " " + auto.getCost() + " " + auto.getColour());
        System.out.println(plane.name() + " " + plane.getCost() + " " + plane.getColour());
        System.out.println(helicopter.name() + " " + helicopter.getCost() + " " + helicopter.getColour());
        System.out.println("--------------------------------------");
        System.out.println(ship.toString());
        System.out.println(moto.toString());
    }
}

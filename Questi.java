package Assign2;

class HillStations {
    String location;
    String place;

    void show(String location, String place) {
        System.out.println("Famopus Palce " + place + " " + " Location " + location);
    }
}

class Manali extends HillStations {
    void show(String location, String place) {
        System.out.println("Famopus Palce " + place + " " + " Location " + location);
    }
}

class Mussoorie extends HillStations {
    void show(String location, String place) {
        System.out.println("Famopus Palce " + place + " " + " Location " + location);
    }
}

class Gulmarg extends HillStations {
    void show(String location, String place) {
        System.out.println("Famopus Palce " + place + " " + " Location " + location);
    }
}

public class Questi {
    public static void main(String[] args) {
        HillStations h = new HillStations();
        h.show("Binah", "patna");
        Manali ma = new Manali();
        ma.show("Goa", "mhsndhd");

        Mussoorie mu = new Mussoorie();
        mu.show("rajsthan", "gyjtgyukjhbkuj");
    }
}

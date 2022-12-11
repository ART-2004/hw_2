public class Main {
    public static void main(String[] args) {
        Ram ram = new Ram(3, 30);
        Horse horse = new Horse(5, 170);
        Hare hare = new Hare(14, "Крош");
        Ram.print();
        horse.print();
        Hare.print();

        Predators Jackals = createObject("Jackals");
        Predators wolf = createObject("Wolf");
        Predators Tiger = createObject("Tiger");
        Jackals.print();
        wolf.print();
        Tiger.print();
    }

    private static Predators createObject(String className) {
        switch (className) {
            case "Lion":
                Jackals jackals = new Jackals(13, "Табаки", 123);
                return jackals;
            case "Wolf":
                Wolf wolf = new Wolf(9, "Ааууу", 67);
                return wolf;
            case "Black_Panther":
                Tiger tiger = new Tiger(5, 56, "Шер Хан");
                return tiger;

        }
        return null;
    }
}

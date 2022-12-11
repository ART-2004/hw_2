public class Hare extends Herbivores implements Printable {
    private static String name;

    public static String getName() {
        return name;
    }

    public Hare(Integer age, String name) {
        super(age);
        this.name = name;
    }


    @Override
    protected static void print() {
        System.out.println("hare age" + getAge() +
                "\nhare name " + getName());
    }
}

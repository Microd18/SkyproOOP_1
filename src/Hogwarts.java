public class Hogwarts {

    private final String name;
    private final int witchcraft;
    private final int transgress;

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public static void topWitchcraft(Hogwarts student1, Hogwarts student2) {
        System.out.println(student1.witchcraft > student2.witchcraft ? student1.getName() + " обладает бо́льшей мощностью магии, чем " + student2.getName()
                : student2.getName() + " обладает бо́льшей мощностью магии, чем " + student1.getName());
    }

    public static void topTransgress(Hogwarts student1, Hogwarts student2) {
        System.out.println(student1.transgress > student2.transgress ? student1.getName() + " трансгрессирует дальше, чем " + student2.getName()
                : student2.getName() + " трансгрессирует дальше, чем " + student1.getName());
    }

    @Override
    public String toString() {
        return "Имя: " + name
                + " | Колдовство: " + witchcraft
                + " | Трансгрессия: " + transgress;
    }
}

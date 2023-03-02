public class Ravenclaw extends Hogwarts {

    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public Ravenclaw(String name, int witchcraft, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, witchcraft, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public static void ravenclawTopStudent(Ravenclaw student1, Ravenclaw student2) {
        int totalStudent1 = student1.smart + student1.wise + student1.witty + student1.creativity;
        int totalStudent2 = student2.smart + student2.wise + student2.witty + student2.creativity;
        System.out.println(totalStudent1 > totalStudent2 ? student1.getName() + " лучший Когтевранец, чем " + student2.getName() :
                student2.getName() + " лучший Когтевранец, чем " + student1.getName());
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Ум: " + smart
                + " | Мудрость: " + wise
                + " | Остроумность: " + witty
                + " | Творчество: " + creativity;
    }
}

public class Slytherin extends Hogwarts {

    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, int witchcraft, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, witchcraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public static void slytherinTopStudent(Slytherin student1, Slytherin student2) {
        int totalStudent1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.lustForPower;
        int totalStudent2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.lustForPower;
        System.out.println(totalStudent1 > totalStudent2 ? student1.getName() + " лучший Cлизеринец, чем " + student2.getName() :
                student2.getName() + " лучший Cлизеринец, чем " + student1.getName());
    }

    @Override
    public String toString() {
        return super.toString() + "| Хитрость: " + cunning
                + " | Решительность: " + determination
                + " | Амбициозность: " + ambition
                + " | Находчивость: " + resourcefulness
                + " | Жажда власти: " + lustForPower;
    }
}

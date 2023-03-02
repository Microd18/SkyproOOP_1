public class Hufflepuff extends Hogwarts {

    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int witchcraft, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void hufflepuffTopStudent(Hufflepuff student1, Hufflepuff student2) {
        int totalStudent1 = student1.industriousness + student1.loyalty + student1.honesty;
        int totalStudent2 = student2.industriousness + student2.loyalty + student2.honesty;
        System.out.println(totalStudent1 > totalStudent2 ? student1.getName() + " лучший Пуффендуец, чем " + student2.getName() :
                student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Трудолюбивость: " + industriousness
                + " | Верность: " + loyalty
                + " | Честность: " + honesty;
    }
}

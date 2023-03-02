public class Gryffindor extends Hogwarts{

    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(String name, int witchcraft, int transgress, int nobility, int honor, int courage) {
        super(name, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public static void gryffindorTopStudent(Gryffindor student1, Gryffindor student2) {
        int totalStudent1 = student1.nobility + student1.honor + student1.courage;
        int totalStudent2 = student2.nobility + student2.honor + student2.courage;

        System.out.println(totalStudent1 > totalStudent2 ? student1.getName() + " лучший Гриффиндорец, чем " + student2.getName() :
                student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Благородство: " + nobility
                + " | Честь: " + honor
                + " | Храбрость: " + courage;
    }
}

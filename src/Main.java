public class Main {
    public static void main(String[] args) {

        Gryffindor Harry = new Gryffindor("Harry Potter", 45, 32, 50,90,99);
        Gryffindor Hermione = new Gryffindor("Hermione Granger", 83,31,31,33, 65);
        Gryffindor Ron = new Gryffindor("Ron Weasley", 32,88,23,12, 86);

        Slytherin Draco = new Slytherin("Draco Malfoy", 72,32,12,76,77,80,99);
        Slytherin Graham = new Slytherin("Graham Montagu", 34,38,87,55,52,12,34);
        Slytherin Gregory = new Slytherin("Gregory Goyle", 6,35,44,75,43,32,10);

        Hufflepuff Zacharias = new Hufflepuff("Zacharias Smith" , 86, 93,13,45,87);
        Hufflepuff Cedric = new Hufflepuff("Cedric Diggory" , 93, 83,50,54,77);
        Hufflepuff Justin = new Hufflepuff("Justin Finch-Fletchley" , 85, 76,17,77,99);

        Ravenclaw Zhou = new Ravenclaw("Zhou Chang", 85,84,84,14,76,62);
        Ravenclaw Padma = new Ravenclaw("Padma Patil", 96,95,75,34,87,44);
        Ravenclaw Marcus = new Ravenclaw("Marcus Belby", 75,76,78,15,54,89);

        System.out.println(Harry);
        System.out.println(Draco);
        System.out.println(Zacharias);
        System.out.println(Zhou);

        Gryffindor.gryffindorTopStudent(Harry, Hermione);
        Slytherin.slytherinTopStudent(Draco, Graham);
        Hufflepuff.hufflepuffTopStudent(Zacharias, Cedric);
        Ravenclaw.ravenclawTopStudent(Zhou, Padma);

        Hogwarts.topTransgress(Harry, Cedric);
        Hogwarts.topWitchcraft(Zhou, Hermione);
        Hogwarts.topWitchcraft(Justin, Ron);
        Hogwarts.topTransgress(Marcus, Draco);
    }
}
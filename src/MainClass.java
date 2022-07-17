import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

// todo In the Main class create several families, so that every class uses all the available constructors. Display data about every person.
//  In the Main class: create a mother, father, child and his pet. Specify all the needed links (for child to his parents and to the pet), in order to form a full family.
//  Call all available methods for the child (including  toString() method) and his pet.
        
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Monday";
        schedule[0][1] = "Go to courses; watch a film";
        schedule[1][0] = "Tuesday";
        schedule[1][1] = "Go to gym; write a blog post";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "Go to instrument course";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "Go to programming course";
        schedule[4][0] = "Friday";
        schedule[4][1] = "Meet with friends after work";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "Go to camping";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "Home cleaning; go to programming course";

        Human father = new Human("Vito", "Karleone", 1952);
        Human mother = new Human("Jane", "Karleone", 1955);

        Human michael = new Human("Michael", "Karleone", 1977, 90, new Pet("dog", "Rock", 5,  75, new String[]{"eat", "drink", "sleep"}), mother, father, schedule);
        Human santino = new Human("Santino", "Karleone", 1972, mother, father);
        Human frederico = new Human();

        System.out.println("Name = " + michael.getName());
        System.out.println("Surname = " + michael.getSurname());
        System.out.println("Year = " + michael.getYear());
        System.out.println("IQ = " + michael.getIq());
        System.out.println("Mother = " + michael.getMother());
        System.out.println("Father = " + michael.getFather());
        System.out.println("Pet = " + michael.getPet());
        System.out.println("Michael = " + michael.toString());
        System.out.println("isFeed = " + michael.feedPet(false));
        System.out.println("----------------------------------");


        Human harryMother = new Human("Lily", "Potter", 1960);
        Human harryFather = new Human("James", "Potter", 1960);
        Pet harryOwl = new Pet("Owl", "Hedwig", 5, 23, new String[]{"eat", "fly", "deliver a letter"});
        Human harry = new Human("Harry", "Potter", 1980,120, harryOwl, harryMother, harryFather, schedule);

        Human ronMother = new Human("Molly", "Weasley", 1950);
        Human ronFather = new Human("Arthur", "Weasley", 1950);
        Human ron = new Human("Ron", "Weasley", 1980, ronMother, ronFather);
        Pet ronRat = new Pet("Rat");

        Human hermione = new Human();
        Pet hermioneCat = new Pet("Cat", "Crookshanks", 4, 90, new String[]{"sleep", "sleep", "sleep"});

        Pet toad = new Pet();


        System.out.println("Specy = " + harryOwl.getSpecies());
        System.out.println("Nickname = " + harryOwl.getNickname());
        System.out.println("Age = " + harryOwl.getAge());
        System.out.println("Trick level = " + harryOwl.getTrickLevel());
        System.out.println("Habbits = " + Arrays.toString(harryOwl.getHabits()));
        System.out.println("Owl to string = " + harryOwl.toString());
        harryOwl.eat();
        harryOwl.foul();
        harryOwl.respond();
        System.out.println();

        System.out.println("Harry = " + harry.getName());
        System.out.println("Harry surname = " + harry.getSurname());
        System.out.println("Harry mother = " + harry.getMother());
        System.out.println("Harry father = " + harry.getFather());
        System.out.println("Harry year = " + harry.getYear());
        System.out.println("Harry iq = " + harry.getIq());
        System.out.println("Harry schedule = " + Arrays.deepToString(harry.getSchedule()));
        System.out.println("isFeed = " + harry.feedPet(false));
        harry.describePet();
        harry.greetPet();
        System.out.println(harry.toString());

    }
}

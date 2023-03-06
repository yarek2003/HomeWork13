package pro.sky.java.course1.homework13;

public class Main {
    public static void main(String[] args) {
    Author dostoevsky = new Author("Федор", "Достоевский");
    Author golding = new Author("Уильям", "Голдинг");
    Author golding2 = new Author("Уильям", "Голдинг");
    Book idiot = new Book("Идиот", dostoevsky, 1998);
    Book idiot1 = new Book("Идиот", dostoevsky, 1998);
    Book idiot2 = new Book("Идиот", dostoevsky, 1998);
    Book lordOfTheFlies = new Book("Повелитель мух", golding, 2012);
        System.out.println(idiot.getTitle() +  " " + idiot.getAuthor().getFirstName() +
                " " + idiot.getAuthor().getLastName() +  " " + idiot.getYear());
        System.out.println(lordOfTheFlies.getTitle() + " " + golding.getFirstName() +
                " " + golding.getLastName()  + " " +  lordOfTheFlies.getYear());
    idiot.setYear(2000);
        System.out.println("Идиот, Издание " + idiot.getYear() + " года");
        System.out.println(idiot.toString());
        System.out.println(dostoevsky.equals(golding));
        System.out.println(idiot1.equals(idiot2));
        System.out.println(golding2.equals(golding));
        System.out.println(dostoevsky.hashCode());
        System.out.println(idiot.hashCode());
        System.out.println(idiot1.hashCode());
        System.out.println(idiot2.hashCode());
        System.out.println(golding.toString());

    }

}
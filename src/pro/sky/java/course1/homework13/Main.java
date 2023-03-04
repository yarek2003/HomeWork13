package pro.sky.java.course1.homework13;

public class Main {
    public static void main(String[] args) {
    Author dostoevsky = new Author("Федор", "Достоевский");
    Author golding = new Author("Уильям", "Голдинг");
    Book idiot = new Book("Идиот", dostoevsky, 1998);
    Book lordOfTheFlies = new Book("Повелитель мух", golding, 2012);
        System.out.println(idiot.getTitle() +  " " + idiot.getAuthor().getFirstName() +
                " " + idiot.getAuthor().getLastName() +  " " + idiot.getYear());
        System.out.println(lordOfTheFlies.getTitle() + " " + golding.getFirstName() +
                " " + golding.getLastName()  + " " +  lordOfTheFlies.getYear());
    idiot.setYear(2000);
        System.out.println("Идиот, Издание " + idiot.getYear() + " года");
    }

}
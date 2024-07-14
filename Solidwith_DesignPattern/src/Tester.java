public class Tester{
    public static void main(String[] args){

        System.out.println("\n================= SOLID With Design Pattern =================");
        
        System.out.println();
        Student student1 = new Student(1, "Sharon Grace Hangaan");
        Student student2 = new Student(2, "CHAWON NEU");

        Journal journal = new Journal(1914, "The Diary of a Young Girl", "by Anne Frank");
        Book book = new Book(1908, "Anne of Green Gables", "Novel by Lucy Maud Montgomery");

        ResourceBorrower resourceBorrower = new JournalBorrower();

        resourceBorrower.borrowResource(student1, journal);
        System.out.println();
        resourceBorrower = new BookBorrower();

        resourceBorrower.borrowResource(student2, book);
        System.out.println();
    }
}
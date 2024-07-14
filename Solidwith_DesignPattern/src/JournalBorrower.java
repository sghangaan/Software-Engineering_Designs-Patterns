public class JournalBorrower implements ResourceBorrower{

    @Override
    public void borrowResource(Student student, Resource resource) {
        System.out.println("Student: " + student.getName());
        System.out.println("borrowed: " + resource.getClass() + " titled: " + resource.getTitle());       
    }
}

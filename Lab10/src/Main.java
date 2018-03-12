public class Main {

    public static void main(String[] args) {
        // write your code here
        // Teacher
        Faculty faculty = new Faculty(new Name("T", "t"), "Com-eng");
        // Course
        Course course = new Course("Java", 60, faculty);
        Course course1 = new Course("Dis", 60, faculty);
        Course course2 = new Course("Genbiz",60, faculty);
        Course course3 = new Course("Eng",60, faculty);
        // Address
        Address a1 = new Address("Nongrua", "Nonngrua", "Khonkaen", "4021");
        Address a2 = new Address("aslkdm", "a;sdk", "aslkdjd", "askdjasjkd");
        Address a3 = new Address("asd", "asdasd", "sdasd", "sdasd");
        // Student
        Student student = new Student(new Name("Nonny", "naa"), a1);
        Student student1 = new Student(new Name("sklfj", "asd"), a2);
        Student student2 = new Student(new Name("sadasd", "askdjn"), a2);
        Student student3 = new Student(new Name("asjd", "askldjaksd"), a2);
        Student student4 = new Student(new Name("asdasd", "asdasd"), a2);


        //student.addCourse(course);
        //student.addCourse(course1);
        //student.addCourse(course2);
        // addStudent
        course.addStudent(student);
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        //course.addStudent(student4);

        //addCooe
        faculty.addCourse(course);
        faculty.addCourse(course1);
        faculty.addCourse(course2);
        faculty.addCourse(course3);

        if (course.getCountStudent() < 5) {
            System.out.println("Kuy tee");
        } else {
            System.out.println(course);
        }
        System.out.println(faculty);
        System.out.println(student);
    }
}

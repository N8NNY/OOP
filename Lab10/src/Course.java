import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student> students = new ArrayList<Student>();
    private int maxStudent;
    private int countStudent;
    private Faculty faculty;

    public Course(String name, int maxStudent, Faculty faculty) {
        this.name = name;
        this.maxStudent = maxStudent;
        this.faculty = faculty;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student e) {
        if(students.size() > maxStudent){
            System.out.println("Limitless");
        } else {
            countStudent++;
            students.add(e);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String studentList() {
        String n = "";
        for (Student x: students) {
            n += x.getName();
        }
        return n;
    }
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + studentList() +
                ", maxStudent=" + maxStudent +
                ", countStudent=" + countStudent +
                ", faculty=" + faculty +
                '}';
    }
}

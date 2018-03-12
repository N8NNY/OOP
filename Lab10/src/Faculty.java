import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String faculty;
    private Name name;
    private List<Course> courses = new ArrayList<Course>();

    public Faculty(Name name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    public Faculty() {
    }

    public void addCourse(Course e){
        if(courses.size() < 3) {
            courses.add(e);
        } else {
            System.out.println("Can't add course");
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String courseList() {
        String course_ = "";
        for (Course a: courses) {
            course_ += a.getName() + ",";
        }
        return course_;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "faculty='" + faculty + '\'' +
                ", name=" + name +
                ", courses=" + courseList() +
                '}';
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private Name name;
    private List<Course> courses = new ArrayList<Course>();
    private Address address;

    private static Map<Address,Integer> addressIntegerMap = new HashMap<Address, Integer>();

    public Student(Name name, Address address) {
        this.name = name;

        if(!addressIntegerMap.containsKey(address)){
            addressIntegerMap.put(address,1);
            this.address = address;
        }
        else{
            int v = addressIntegerMap.get(address);
            if(v+1 > 3){
                System.out.println("Can't add Address" + " " +name);
            }
            else{
                this.address = address;
                addressIntegerMap.put(address,v+1);
            }
        }

        this.address = address;
    }

    public Student() {
    }

    public void addCourse(Course e) {
        courses.add(e);
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
        return "Student{" +
                "name=" + name +
                ", courses=" + courseList() +
                ", address=" + address +
                '}';
    }
}

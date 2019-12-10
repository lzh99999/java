/**
 * Created with IntelliJ IDEA.
 * Description:
 */
public class Student {
    private int sn;
    private String name;
    private int courseId;

    @Override
    public String toString() {
        return "Student{" +
                "sn=" + sn +
                ", name='" + name + '\'' +
                ", courseId=" + courseId +
                '}';
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}

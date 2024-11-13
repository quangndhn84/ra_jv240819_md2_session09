package generic;

public class Student extends Person {
    private String studentId;
    private String studentName;
    private int age;
    private boolean status;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StudentID: " + this.studentId + " - Student Name: " + this.studentName
                + " - Age: " + this.age + " - Status: " + (this.status ? "Male" : "Female");
    }
}

package sort;

public class Student implements Comparable<Student> {
    private String studentId;
    private String studentName;
    private int age;
    private boolean status;

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

    @Override
    public int compareTo(Student o) {
        //Cài đặt sắp xếp - Tuổi tăng dần
        /*
        Tăng dần
        * Lớn hơn: >0
        * Bằng nhau: 0
        * Nhỏ hơn: <0
        * */
//        if (this.age > o.getAge()) {
//            return 1;
//        } else if (this.age == o.getAge()) {
//            return 0;
//        } else {
//            return -1;
//        }
        return this.age - o.getAge();
    }
}

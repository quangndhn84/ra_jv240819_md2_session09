package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 22, true);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 24, false);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 18, false);
        Student student4 = new Student("SV004", "Nguyễn Văn E", 22, true);
        Student student5 = new Student("SV005", "Nguyễn Văn D", 22, false);
        //Khởi tạo danh sách sinh viên từ List Interface và lớp triển khai ArrayList
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);

        //1. Sắp xếp các sinh viên theo tuổi tăng dần sử dụng Comparabale Interface
        /*
         * Sắp xếp với Comparable
         * B1: cho lớp sinh viên kế thừa từ Comparable
         * B2: Triển khai phương thức compareTo để cài đặt sắp xếp
         * B3: Sử dụng phương thức sort của Collection để sắp xếp danh sách
         * */
        Collections.sort(listStudent);
        System.out.println("Danh sách sinh viên sau khi sắp xếp tuổi tăng dần với Comparable:");
        for (Student student : listStudent) {
            System.out.println(student);
        }
        //2. Sắp xếp sinh viên theo tuổi giảm dần với Comparator
        /*
         * Sắp xếp với Comparator
         * B1: Sử dụng phương thức sort của Collection để sắp xếp với 1 instance Comparator
         * B2: triển khai phương thức compare của Comparator và cài đặt sắp xêp
         * */
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(o1.getAge() - o2.getAge());
            }
        });
        System.out.println("Danh sách sinh viên sau khi sắp xếp tuổi giảm dần với Comparator:");
        for (Student student : listStudent) {
            System.out.println(student);
        }
        //3. Sắp xếp danh sách sinh viên theo tên giảm dần với Comparator
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -o1.getStudentName().compareTo(o2.getStudentName());
            }
        });
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo tên giảm dần:");
        for (Student student : listStudent) {
            System.out.println(student);
        }


    }
}

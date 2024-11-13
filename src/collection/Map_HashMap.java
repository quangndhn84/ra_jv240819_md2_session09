package collection;

import generic.Student;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 22, true);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 24, false);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 18, false);
        //Map chứa các đối tượng có định dạng Key-Value
        //1. Khởi tạo đối tuợng Map từ Map Interface và lớp triển khai HashMap
        Map<Integer, Student> mapStudents = new HashMap<>();
        //2. Thêm các phần tử vào map (Key là duy nhất, không trùng lặp)
        mapStudents.put(1, student1);
        mapStudents.put(2, student2);
        mapStudents.put(3, student3);
        //3. truy cập vào phần tử của map
        System.out.println("Tên sinh viên có key 2 là: " + mapStudents.get(2).getStudentName());
        System.out.println("Các đối tượng trong map là: ");
        System.out.println(mapStudents);
    }
}

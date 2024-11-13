package collection;

import generic.Student;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 22, true);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 24, false);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 18, false);
        Student student4 = new Student("SV004", "Nguyễn Văn E", 22, true);
        Student student5 = new Student("SV005", "Nguyễn Văn D", 22, false);
        //Khởi tạo danh sách sinh viên từ List Interface và lớp triển khai ArrayList
        List<Student> listStudent = new ArrayList<>();
        //1. boolean add(E element): Thêm 1 phần tử vào cuối danh sách
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        //2. int size(): trả ra số phần tử của danh sách
        System.out.println("Số sinh viên trong danh sách là: " + listStudent.size());
        //3. boolean isEmpty(): Kiểm tra danh sách đã có phần tử chưa
        System.out.println("Kiểm tra listStudent có sinh viên chưa: " + listStudent.isEmpty());
        //4. boolean contains(Object obj): Kiểm tra trong danh sách có đối tượng obj không
        System.out.println("Kiểm tra trong listStudent có student2 hay không: " + listStudent.contains(student2));
        //5. boolean remove(Object obj): xóa đối tuợng obj trong danh sách
        listStudent.remove(student2);
        //6. boolean addAll(list): add toàn bộ list vào danh sách hiện tại
        List<Student> listChild = new ArrayList<>();
        listChild.add(student2);
        listChild.add(student5);
        listStudent.addAll(listChild);
        //7. boolean containsAll(list): kiểm tra danh sách list có trong danh sách hiện tại hay không
        System.out.println("Kiểm tra listChild có trong listStudent hay không: " + listStudent.containsAll(listChild));
        //8. void clear(): xóa tất cả các phần tử trong danh sách
//        listStudent.clear();
        //9. Element get(int index): Lấy phần tử tại chỉ số index
        System.out.println("Thông tin sinh viên có chỉ số 2 trong danh sách là: " + listStudent.get(2));
        //10. Element add(int index, Object obj): chèn đối tượng obj vào chỉ số index trong danh sách
        listStudent.add(2, student2);
        //11. Element set(int index, Object obj): đè đối tượng obj vào chỉ số index của danh sách
        listStudent.set(2, student5);
        //12. remove(int index): xóa phần tử theo chỉ số
        listStudent.remove(2);
        //13. int indexOf(Object obj): trả ra chỉ số phần tử obj trong danh sachs
        System.out.println("Chỉ số student 4 trong danh sách là: " + listStudent.indexOf(student4));
        //14. subList(int fromIndex, int endIndex): Cắt danh sách từ chỉ số fromIndex đến chỉ số endIndex
        List<Student> listSub = listStudent.subList(1, 4);
        System.out.println("Các sinh viên trong listSub là: ");
        for (Student student : listSub) {
            System.out.println(student);
        }
        //In thông tin sinh viên trong danh sách
        System.out.println("Các sinh viên trong danh sách sinh viên là: ");
        for (Student student : listStudent) {
            System.out.println(student);
        }

    }
}

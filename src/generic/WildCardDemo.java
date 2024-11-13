package generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void main(String[] args) {
        Book book = new Book();
        Person person = new Person();
        Student student = new Student();
        Child child = new Child();
        List<Book> listBook = new ArrayList<>();
        List<Person> listPerson = new ArrayList<>();
        List<Student> listStudent = new ArrayList<>();
        List<Child> listChild = new ArrayList<>();
        //Ký tự đại diện ? đại diện cho tất cả các kiểu dữ liệu
        printElements(listBook);
        printElements(listChild);
        printElements(listPerson);
        //Child extends Student extend Person
        //? extends Student: chỉ chấp nhận các kiểu dữ liệu kế thừa từ Student
        printElement2(listStudent);
        printElement2(listChild);
        //? super Student: chỉ chấp nhận các kiểu dữ liệu mà Student kế thừa
        printElement3(listPerson);
        printElement3(listStudent);

    }

    public static void printElements(List<?> list) {
        System.out.println(list);
    }

    public static void printElement2(List<? extends Student> list) {
        System.out.println(list);
    }

    public static void printElement3(List<? super Student> list) {
        System.out.println(list);
    }
}

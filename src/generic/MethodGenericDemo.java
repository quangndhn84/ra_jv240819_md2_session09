package generic;

public class MethodGenericDemo {
    //Xây dựng 1 phương thức cho phép in giá trị các phần tử của mảng có kiểu dữ liệu là String, Integer, Float
    public <E> void printArray(E[] arr) {
        System.out.println("Các phần tử trong mảng là:");
        for (E element : arr) {
            System.out.println(element);
        }
    }
}

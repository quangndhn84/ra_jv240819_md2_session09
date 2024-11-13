package generic;

public class Demo {
    public static void main(String[] args) {
        //1. Khởi tạo đối tượng Dictionary
        Dictionary<String, String> dictionary1 = new Dictionary<>();
        dictionary1.setKey("Study");
        dictionary1.setValue("Học");
        System.out.printf("Nghĩa của từ %s là %s\n", dictionary1.getKey(), dictionary1.getValue());
        Dictionary<Integer, String> dictionary2 = new Dictionary<>();
        dictionary2.setKey(1);
        dictionary2.setValue("Một");
        System.out.printf("Phiên âm %d là %s\n", dictionary2.getKey(), dictionary2.getValue());
        Dictionary<Float, String> dictionary3 = new Dictionary<>();
        dictionary3.setKey(3.5F);
        dictionary3.setValue("Ba phảy năm");
        System.out.printf("Phiên âm %f là %s\n", dictionary3.getKey(), dictionary3.getValue());
        //Khởi tạo đối tượng book1
        Book1 book1 = new Book1();
        //Khởi tạo đối tượng book2
        Book2<Integer> book2 = new Book2<>();
        //Khởi tao đối tượng book3
        Book3<Integer, String, Float> book3 = new Book3<>();
        //In các phần tử của mảng String, Integer, Float
        MethodGenericDemo mgd = new MethodGenericDemo();
        String[] arrString = {"Nguyễn Văn A", "Nguyễn Văn B"};
        mgd.printArray(arrString);
        Integer[] arrInteger = {1, 3, 5, 7};
        mgd.printArray(arrInteger);
        Float[] arrFloat = {3.5F, 9.2F};
        mgd.printArray(arrFloat);

    }
}

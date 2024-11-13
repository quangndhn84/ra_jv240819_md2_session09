package generic;

public class Book1 extends Dictionary<Integer, String> {
    //Không kế thừa bất cứ tham số đại diện nào của lớp cha
    public Book1() {
    }

    public Book1(Integer key, String value) {
        super(key, value);
    }
}

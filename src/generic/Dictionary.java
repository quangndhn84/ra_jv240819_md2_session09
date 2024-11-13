package generic;

public class Dictionary<K, V> {
    //Study: Học
    //1: Một
    //3.5: Ba phảy năm
    //--> Định nghĩa 2 tham số đại diện: Key - K, Value - V
    private K key;
    private V value;

    public Dictionary() {
    }

    public Dictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

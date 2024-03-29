package ADS.Lesson8;

public interface HashTable<K, V> {
    boolean put(K key, V value);

    V get(K key);

    V remove(K key);

    int size();

    boolean isEmpty();

    void display();

    interface Entry<K, V> {

        K getKey();

        V getValue();

        void setValue(V value);
    }
}

package DataStructureAlgorithm;

public interface List {

    boolean isEmpty();

    void add(String Item);

    void remove(String Item);


    int size();

    String get(int index);

    int capacity();

    boolean contain(String item);
}

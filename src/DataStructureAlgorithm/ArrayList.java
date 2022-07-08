package DataStructureAlgorithm;

import java.util.Objects;

public class ArrayList implements List {
    private int size;
    private String[] elements = new String[5];


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String Item) {
        if(size == elements.length){
            String[] newElements = new String[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = Item;


    }


    @Override
    public void remove(String Item) {
        --size;
        for(int i =0; i<elements.length-1;i++){
            elements[i]=elements[i+1];
        }
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int capacity() {
        return elements.length;
    }

    @Override
    public boolean contain(String item) {
        for (String container : elements) {
            if(Objects.equals(container, item)){
                return true;
            }
        }
        return false;
    }
}

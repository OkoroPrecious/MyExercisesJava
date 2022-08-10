package DataStructureAlgorithm;

public class Stack {

    private ArrayList myStack = new ArrayList();
    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    public void push(String item) {
        myStack.add(item);
    }

    public void pop() {
        myStack.remove(myStack.get(size() -1));
    }

    public int size() {
        return myStack.size();
    }

    public String peek() {
        return myStack.get(myStack.size() - 1);
    }

    public String searchElement(int index) {
        return myStack.get(index);
    }
}

package DataStructureAlgorithm;


public class bigSet implements Set {
    private ArrayList elements = new ArrayList();

    @Override
    public boolean isEmpty() {
        if(elements.size() == 0){
            return true;
        }
        return false;
    }

    @Override
    public void add(String item) {
        if (elements.contain(item)){
            System.out.println("Item already exist");
        }else elements.add(item);

    }

    @Override
    public int size() {
        return elements.size();
    }
}

import java.util.HashSet;

public class SetImplementation {
    private HashSet<Integer> set;

    public SetImplementation() {
        set = new HashSet<>();
    }

    public void add(int element) {
        set.add(element);
    }

    public void remove(int element) {
        set.remove(element);
    }

    public boolean contains(int element) {
        return set.contains(element);
    }

    public static void main(String[] args) {
        SetImplementation setImpl = new SetImplementation();
        setImpl.add(5);
        setImpl.add(10);
        setImpl.add(5);

        System.out.println("Contains 5: " + setImpl.contains(5));  // true
        System.out.println("Contains 15: " + setImpl.contains(15));  // false

        setImpl.remove(10);
        System.out.println("Contains 10 after removal: " + setImpl.contains(10));  // false
    }
}

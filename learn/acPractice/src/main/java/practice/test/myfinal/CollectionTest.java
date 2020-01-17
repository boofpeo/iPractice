package practice.test.myfinal;

public class CollectionTest {

    public static void main(String[] args) {

        int oldCapacity = 10;
        int addCapacity = (oldCapacity >> 1);
        int newCapacity = oldCapacity + addCapacity;
        System.out.println(newCapacity);

        int testCapacity = 100 >>1;
        System.out.println(testCapacity);
    }
}

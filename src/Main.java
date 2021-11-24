import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from java");
        Calculator cl = new Calculator();
        System.out.println(cl.Add(4, 2));

        int result = cl.Mul(5, 4);
        if (result < 20) {
            System.out.println("result is less than 20 ");
        } else if (result > 20) {
            System.out.println("result is less than 20 ");
        } else {
            System.out.println("result is 20");
        }
        int[] testArr = new int[20];

        for (int i = 0; i < result; i++) {
            testArr[i] = i;
        }
        for (int test: testArr) {
            System.out.println(test);
        }

        Animal[] Animals = new Animal[3];
        Animals[0] = new Dog();
        Animals[1] = new Cat();
        System.out.println("Dog says : " + Animals[0].voice());
        System.out.println("Cat says : " + Animals[1].voice());
        ArrayList<String> Animals2  = new ArrayList<>();
        Animals2.add("Dog");
        Animals2.add("Cat");

        Iterator itr=Animals2.iterator();//getting the Iterator
        while(itr.hasNext()) {//check if iterator has the elements
            System.out.println(itr.next().toString());//printing the element and move to next
        }

    }
}

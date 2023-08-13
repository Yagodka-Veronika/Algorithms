package HW5;
// import java.util.ArrayList;
// import java.util.List;
import java.util.Random;

public class Main {
   public static void main(String[] args) {
       BinaryTree<Integer> tree = new BinaryTree<>();
       for (int i = 0; i < 10; i++)
           tree.add(new Random().nextInt(20));

       tree.print();

   }

}


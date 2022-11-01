import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Java Implementation of LinkedList
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(3);
//        ll.add(4);
//        ll.add(1);
//        ll.add(5);
//        ll.add(9);
//
//        System.out.println(ll);

        //Custom LinkedList
        LL ls = new LL();
        ls.insertFirst(3);
        ls.insertFirst(4);
        ls.insertFirst(7);
        ls.insertFirst(2);
        ls.insertFirst(1);
        ls.insert(100,4);
        ls.insertLast(99);

        ls.printList();
        System.out.println(ls.deleteFirst());
        ls.printList();
        System.out.println(ls.deleteLast());
        ls.printList();
    }
}

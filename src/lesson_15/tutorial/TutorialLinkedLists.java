package lesson_15.tutorial;

/*
LinkedLists are a useful data structure when dealing with certain scientific application.

LinkedLists store data in nodes, which hold a value (of any type), and a next value, which points to the next node.

A LinkedList may look something like this:

1->2->3->10->23;

1, in this case, is called the head node, which is how all the other members are accessed, 23 would be called the
tail node
 */

import java.util.LinkedList;

public class TutorialLinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(23);
        System.out.println(list);
    }
}

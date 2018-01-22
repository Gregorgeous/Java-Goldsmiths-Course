import java.util.Arrays;
import java.util.Collections;
public class LinkedListInt {
    private Node head;
//    The constructor - takes an item as an argument, creates a new Node object in the "head" variable, stores the head.value as with the argument provided and initially assigns head.link to null (as there's no other nodes in the linkedList initially)
    public LinkedListInt(int item) {
        head = new Node();
        head.value=item;
        head.link=null;
    }
//    at method insertItemAtBack we, again, take one argument from the user..
    public  void insertItemAtBack(int item) {
//        We create a new node called backNode.
        Node backNode = new Node();
//        We store the value of the arg to the backNode.value
        backNode.value = item;
//        make link to null (as this is going to be our last el. of the linkedList)
        backNode.link = null;
//        Now we check for 2 cases ..
//          .. if the head has no link anyway ..
        if (this.head.link == null){
//            ..we just assign it to our newly-created backNode
            this.head.link = backNode;
        }
//        Otherwise ..
        else {
//            we traverse (go deeper down) through ALL the links
            Node traverseNode = this.head.link;
//            .. until we find the very last node in our chain of links
            while (traverseNode.link != null){
                traverseNode = traverseNode.link;
            }
//                .. and to this last node we assign our backNode as the link

            traverseNode.link = backNode;
        }

    }
//    This one is easier than the previous method
    public  void insertItemAtFront(int item) {
//        We initialize the frontNode and it's values..
        Node frontNode = new Node();
        frontNode.value = item;
//        and assign the link of our front node to the so-far first node of the linked list (stored at the head)
        frontNode.link = this.head;
//        ... and once we do it, we can assign the the head to our from-now-on first node of the linked list.
        this.head = frontNode;
    }
// This method deletes any occurrence of the value provided in the argument from our linked list.
    public  void deleteItem(int item) {
        Node traverseNode = this.head;
//        Node grandChildNode = this.head.link.link;
//      We check for 2 main cases: 1. when the list has only 1 node 2. when there's more nodes
        if (traverseNode.link == null){
//            when there's only one we execute one of the below conditions (code self-explanatory)
            if (traverseNode.value == item){
                traverseNode.value = 0;
                System.out.println("That was the only element in this list. You now have an empty linked list");
            }
            else {
                System.out.println("no element with given value existed in the list, so nothing was deleted");
            }
        }
//        otherwise ...
        else {
//            create an int counting how many items we will delete...
            int countHowManyDeleted = 0;
//            we check the edge-case when we need to delete thing at the beginning ..
            if (traverseNode.value == item){
                traverseNode.value = 0;
                this.head = traverseNode.link;
                countHowManyDeleted++;
            }
//            then we create a pointer to the next-of-kin node of our current traverse node.
            Node traverseChildNode = this.head.link;
//            and the we iterate through the whole linked list
            do {
//                if we occur on a value we need to delete, we do so..
                if (traverseChildNode.value == item){
                    traverseChildNode.value = 0;
                    countHowManyDeleted++;
//                    .. and we "omit" the deleted node by changing the link of the node one before to point to the node of one after the one we want to delete.
                    traverseNode.link = traverseChildNode.link;
                }
//                and then we "traverse" further into our linked list for both the traverseNode and also traverseChildNode
                traverseNode = traverseChildNode;
                traverseChildNode = traverseChildNode.link;
//                we do this until the 1 before the end of the list (as we aren't able to go to the last one sadly ..)
            }while (traverseChildNode.link != null);

//            So .. we need to check the edge-case condition, when a provided "item" argument occurs at the last element of the list (which won't be triggered in the do while loop)
            if (traverseChildNode.value == item){
                traverseChildNode.value = 0;
                countHowManyDeleted++;
                traverseNode.link = null;
            }
//          and then we provide user with the information how many items were deleted
            if (countHowManyDeleted == 0){
                System.out.println("there weren't any elements in the list with the given value, so NOTHING was deleted");
            }
            else {
                System.out.println("Value: " + item + " was deleted from the whole list " + countHowManyDeleted + " time(s)");
            }
        }
    }
//    here I traverse through all the list and just s.o.p. all the ".value" of each node.
    public void printList() {
        System.out.println(this.head.value);
        Node traverseNode = this.head;
        while (traverseNode.link != null){
            traverseNode = traverseNode.link;
            System.out.println(traverseNode.value);
        }
    }
    public void sortListDesc() {
//        Check of an edge case when there's only 1 element in the linked list.
        if (this.head.link == null){
            System.out.println(this.head.value);
            return;
        }
        int arraySize = 1;
        Node traverseNode = this.head;
        while (traverseNode.link != null){
            arraySize++;
            traverseNode = traverseNode.link;
        }
        Integer[] sortedList = new Integer[arraySize];
        traverseNode = this.head;
        for (int i = 0; i < sortedList.length; i++) {
            sortedList[i] = traverseNode.value;
            traverseNode = traverseNode.link;
        }
        Arrays.sort(sortedList, Collections.reverseOrder());

        traverseNode = this.head;
        for (Integer aSortedList : sortedList) {
            traverseNode.value = aSortedList;
            traverseNode = traverseNode.link;
        }


    }
    class Node{
        private int value;
        private Node link;
    }

    public static void main(String args[]){
//        And here we just check the class and it's methods.
        LinkedListInt list = new LinkedListInt(2);
        list.insertItemAtFront(4);
        list.insertItemAtFront(8);
        list.insertItemAtBack(5);
        list.insertItemAtBack(9);
        list.deleteItem(2);
        System.out.println("========unsorted list =========");
        list.printList();
        System.out.println("========sorted list ========");
        list.sortListDesc();
        list.printList();
    }
}

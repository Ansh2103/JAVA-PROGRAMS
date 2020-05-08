
import java.util.HashSet;

public class LinkedList {

    private static class Node {
        private int value = 0;
        private Node next;

        public Node(int v, Node n) {
            value = v;
            next = n;
        }

    }

    private Node head;

    private int size = 0;

    // get size
    public int size() {
        return size;
    }

    // check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // insert element at head
    public void addHead(int value) {
        head = new Node(value, head);
        size++;
    }

    // insrting node at last

    public void addTail(int value) {
        Node newNode = new Node(value, null);
        Node curr = head;
        if (head == null)
            head = newNode;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Print the linkedlist

    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    public void sortedInsert(int value) {
        Node newNode = new Node(value, null);
        Node curr = head;
        if (curr == null && curr.value > value) {
            newNode.next = head;
            head = newNode.next;
            return;
        }
        while (curr.next != null && curr.next.value < value) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    // search data in linkedlist
    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Delete first node from list
    public int deleteHeadNode() throws IllegalStateException {
        if (isEmpty())
            throw new IllegalStateException("Empty linked List");

        int temp = head.value;
        head = head.next;
        size--;
        return temp;
    }

    // Delete node from Match value
    public boolean deleteNodeSerach(int data) {
        Node temp = head;
        if (data == head.value) {
            head = head.next;
            size--;
            return true;
        }

        while (temp.next != null) {
            if (temp.next.value == data) {
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //	Delete all the occurrence of particular value in linked list.
    public void deleteAllSameNodes(int data) {
        Node currNode = head;
        Node nextNode;

        while (currNode.next != null && currNode.value == data) {
            head = currNode.next;
            currNode = head;
        }
        while (currNode != null) {
            nextNode = currNode.next;
            if (nextNode.next != null && nextNode.value == data) {
                currNode.next = nextNode.next;
            } else {
                currNode = nextNode;
            }
        }
    }

    // delete whole single list
    public void freeList() {
        head = null;
        size = 0;
    }

    // reverse linked list
    public void reverseList() {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Remove Duplicates from linked list

    public void RemoveDuplicate() {
        Node curr = head;
        while (curr != null) {
            if (curr.next != null && curr.value == curr.next.value) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }

    // Copy reversed linkedlist
    public LinkedList copyRevList() {
        Node curr = head;
        Node tempNode = null;
        Node tempNode2 = null;
        while (curr != null) {
            tempNode2 = new Node(curr.value, tempNode);
            curr = curr.next;
            tempNode = tempNode2;
        }
        LinkedList l2 = new LinkedList();
        l2.head = tempNode;
        return l2;
    }

    // Copy Full linkedList
    public LinkedList copyList() {
        Node curr = head;
        Node tempNode = null;
        Node headNode = null;
        Node tailNode = null;

        if (curr == null)
            return null;

        headNode = new Node(curr.value, null);
        tailNode = headNode;
        curr = curr.next;

        while (curr != null) {
            tempNode = new Node(curr.value, null);
            tailNode.next = tempNode;
            tailNode = tempNode;
            curr = curr.next;
        }
        LinkedList l1 = new LinkedList();
        l1.head = headNode;
        return l1;
    }

    // Compare List
    public boolean compare(LinkedList l1) {
        return compareList(head, l1.head);
    }

    public boolean compareList(Node head, Node head1) {

        if (head == null && head1 == null)
            return true;
        else if ((head1 == null) || (head == null) || (head1.value != head.value))
            return false;
        else
            return compareList(head.next, head1.next);
    }

    // find full length of list
    public int findLength() {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Find the nth Element of the list from begining
    public int findNthElement(int index) {
        Node curr = head;
        if (index > size() || index < 1) {
            return 0;
        }

        int count = 0;
        while (curr != null && count < index - 1) {
            count++;
            curr = curr.next;
        }
        return curr.value;
    }

    // Find the nth Element of the list from End
    public int findNthElementEnd(int index) {
        int size = findLength();
        int startIndex;
        if (size != 0 && size < index) {
            return 0;
        }
        startIndex = size - index + 1;
        return findNthElement(startIndex);
    }

    // Loop detect Loop using hashing
    public boolean loopCheckHashing() {
        Node curr = head;
        HashSet<Node> set = new HashSet<Node>();
        while (curr != null) {
            if (set.contains(curr)) {
                return true;
            }
            set.add(curr);
            curr = curr.next;

        }
        return false;
    }

    // Loop detect Loop using SPFP
    public boolean loopCheckSPFP() {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("loop detected");
                return true;
            }
        }
        System.out.println("No loop");
        return false;
    }

    // Loop detect Loop using REVERSE
    public boolean loopCheckRev() {
        Node temp = head;
        reverseList();
        if (temp == head) {
            reverseList();
            System.out.println(" found ");
            return true;
        } else {
            reverseList();
            System.out.println("not found ");
            return false;
        }
    }

    // Type loop detect in the list 2=circular 1=loop 0=no loop
    public int typeCheckloop() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            if (head == fast.next || head == fast.next.next) {
                System.out.println("circular loop");
                return 2;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("simple loop");
                return 1;
            }
        }
        System.out.println("no loop");
        return 0;
    }

    // Remove loop first Detect point then Remove

    public Node loopPointDetect() {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public void removeLoop() {
        Node loop = loopPointDetect();
        if (loop == null)
            return;
        Node first = head;
        // circular case
        if (loop == first) {
            while (first.next != head) {
                first = first.next;

            }
            first.next = null;
            return;
        }
        Node second = loop;
        while (first.next != second.next) {
            first = first.next;
            second = second.next;
        }
        second.next = null;

    }

    // find intersection point of two list

    public Node findIntersection(Node head, Node head2) {
        int l1 = 0;
        int l2 = 0;
        Node tempHead = head;
        Node tempHead2 = head2;
        while (tempHead != null) {
            l1++;
            tempHead = tempHead.next;
        }
        while (tempHead2 != null) {
            l2++;
            tempHead2 = tempHead2.next;
        }
        int diff;
        if (l1 < l2) {
            Node temp = head;
            head = head2;
            head2 = temp;
            diff = l2 - l1;
        } else
            diff = l1 - l2;
        for (; diff > 0; diff--)
            head = head.next;
        while (head != head2) {
            head = head.next;
            head2 = head2.next;
        }
        return head;
    }

    // Middle point of linked list
    public void midElement() {
        Node slow = head;
        Node fast = head;
        if (head != null) {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }



            System.out.println("middle element is " + slow.value);
        }
    }

    // Move last element to front of a given Linked List
    public void moveToFront() {
        if (head != null && head.next != null) {
            return;
        }
        Node secLast = null;
        Node last = head;

        while (last.next != null) {
            secLast = last;
            last = last.next;
        }
        secLast.next = null;
        last.next = head;
        head = last;
    }

    // Move even nodes to the end of linked list in reverse order
    public static Node rearrange(Node head) {
        // empty list
        if (head == null) {
            return null;
        }

        // maintain two lists odd and even
        Node odd = head;
        Node even = null, prev = null;

        // do for each odd node
        while (odd != null && odd.next != null) {
            // "move" next node (which will be even)
            // to the front of even list
            if (odd.next != null) {
                Node newNode = odd.next;
                odd.next = odd.next.next;

                newNode.next = even;
                even = newNode;
            }

            // update prev and move to next odd node
            prev = odd;
            odd = odd.next;
        }

        // append even list to odd list
        if (odd != null) {
            odd.next = even;
        } else {
            prev.next = even;
        }

        return head;
    }

    // Print linked list from End travers to end while back print
    public void printFromEnd(Node temp) {
        if (temp == null)
            return;
        printFromEnd(temp.next);
        System.out.println(temp.value);

    }

    public void setSimplTemp() {
        Node temp = head;
        printFromEnd(temp);

    }

    // Check given LinkedList is even or odd length one pointer move 2x speed if it
    // null then even or last then odd
    public int checkEvenOrOdd() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next.next;
        }
        if (temp == null)
            return 0;
        else
            return 1;
    }
    //sort the linked list

    public void sortList() {
        int temp;
        Node curr=head;
        Node index=null;
        if(head==null)
            return;
        else {
            while(curr!=null) {
                index=curr.next;
                while(index!=null) {
                    if(curr.value > index.value) {
                        temp=curr.value;
                        curr.value=index.value;
                        index.value=temp;
                    }
                    index=index.next;
                }
                curr=curr.next;
            }
        }
    }

    //delete alternate elemets of linked list
    public void DeleteAlternateNodes() {
        Node current=head;
        Node prev=head;
        if(head==null)
            return;
        else if(current.next==null)
            return;
        while(current!=null && current.next!=null)
        {
            prev.next=current.next.next;
            current=current.next;
            prev=prev.next;


        }
    }


    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addHead(10);
        l.addHead(10);
        l.addHead(20);
        l.addTail(50);
        l.addHead(30);
////		System.out.println(l.checkEvenOrOdd());
        l.sortList();
        l.Print();
//
//		System.out.println("-----------------");
//
//		l.DeleteAlternateNodes();
//		l.Print();

//		l.setSimplTemp();

        l.midElement();
//		l.reverseList();
//		l.RemoveDuplicate();
//		l.Print();

//		LinkedList temp = l.copyList();
//		temp.Print();

    }

}

public class LinkedList_3702{
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    // Insert at the end
    public static LinkedList_3702 insert(LinkedList_3702 list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    // Insert at a specific position
    public void insertAtPosition(int data, int position) {
        Node new_node = new Node(data);
        if (position == 0) {
            new_node.next = head;
            head = new_node;
            return;
        }
        Node currNode = head;
        for (int i = 0; currNode != null && i < position - 1; i++) {
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println("Position out of range");
        } else {
            new_node.next = currNode.next;
            currNode.next = new_node;
        }
    }
    // Insert after a specific node
    public void insertAfterNode(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prevNode.next;
        prevNode.next = new_node;
    }
    // Insert before a specific node
    public void insertBeforeNode(Node nextNode, int data) {
        if (head == nextNode) {
            insertAtBeginning(data);
            return;
        }
        Node new_node = new Node(data);
        Node currNode = head;
        while (currNode != null && currNode.next != nextNode) {
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println("The given next node is not present in the list");
        } else {
            new_node.next = currNode.next;
            currNode.next = new_node;
        }
    }
    // Print the linked list
    public static void printList(LinkedList_3702 list) {
        Node currNode = list.head;
        System.out.print("List: ");
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    // Delete by key
    public static void deleteByKey(LinkedList_3702 list, int key) {

        Node currNode = list.head, prev = null;
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + " found and deleted");
            return;
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }
        if (currNode == null) {
            System.out.println(key + " not found");
        }
    }
    // Delete at a position
    public static void deleteAtPosition(LinkedList_3702 list, int index) {
        Node currNode = list.head, prev = null;
        if (index == 0 && currNode != null) {
            list.head = currNode.next;
            System.out.println(index + " position element deleted");
            return;
        }
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                prev.next = currNode.next;
                System.out.println(index + " position element deleted");
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            System.out.println(index + " position element not found");
        }
    }
    // Find the length of the linked list
    public static void length(LinkedList_3702 list) {
        Node currNode = list.head;
        int counter = 0;
        while (currNode != null) {
            counter++;
            currNode = currNode.next;
        }
        System.out.println("Length of List: " + counter);
    }
    // Count occurrences of a specific value
    public static void occurance(LinkedList_3702 list, int o) {
        Node currNode = list.head;
        int counter = 0;
        while (currNode != null) {
            if (currNode.data == o) {
                counter++;
            }
            currNode = currNode.next;
        }
        System.out.println("Occurrence of value - " + o + " : " + counter);
    }
    // Search by position
    public static void searchAtPosition(LinkedList_3702 list, int index) {
        Node currNode = list.head;
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                System.out.println("Element at position " + index + " is " + currNode.data);
                return;
            }
            counter++;
            currNode = currNode.next;
        }
        System.out.println("Element at position " + index + " not found");
    }
    // Search by value
    public static void searchByKey(LinkedList_3702 list, int key) {
        Node currNode = list.head;
        int position = 0;
        while (currNode != null) {
            if (currNode.data == key) {
                System.out.println("Element : " + key + " - found at position " + position);
                return;
            }
            position++;
            currNode = currNode.next;
        }
        System.out.println("Element : " + key + " - not found");
    }
    // Join two lists
    public static void joinList(LinkedList_3702 list, LinkedList_3702 list2,
                                LinkedList_3702 list3) {
        Node currNode = list.head;
        while (currNode != null) {
            insert(list3, currNode.data);
            currNode = currNode.next;
        }
        Node currNode1 = list2.head;
        while (currNode1 != null) {
            insert(list3, currNode1.data);
            currNode1 = currNode1.next;
        }
        printList(list3);
    }
    // Reverse and print the linked list
    public static void reverseList(LinkedList_3702 list) {
        Node prev = null;
        Node current = list.head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
        printList(list);
    }
    // Remove duplicates from the linked list
    public static void removeDuplicates(LinkedList_3702 list) {
        Node currNode = list.head;
        while (currNode != null && currNode.next != null) {
            Node nextNode = currNode;
            while (nextNode.next != null) {
                if (currNode.data == nextNode.next.data) {
                    nextNode.next = nextNode.next.next;
                } else {
                    nextNode = nextNode.next;
                }
            }
            currNode = currNode.next;
        }
        printList(list);
    }
    // Sort the linked list
    public static void sortList(LinkedList_3702 list) {
        Node current = list.head;
        Node index = null;
        int temp;
        if (list.head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
        printList(list);
    }
    // Main method to run the code
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        LinkedList_3702 list = new LinkedList_3702();
        LinkedList_3702 list2 = new LinkedList_3702();
        LinkedList_3702 list3 = new LinkedList_3702();
        // Insert operations
        insert(list, 1);
        insert(list, 3);
        insert(list, 2);
        insert(list, 3);
        insert(list, 3);
        printList(list);
        // Delete by value
        deleteByKey(list, 2);
        printList(list);
        // Delete by index
        deleteAtPosition(list, 0);
        printList(list);
        // Search by index
        searchAtPosition(list, 1);
        // Search by value
        searchByKey(list, 3);
        // Length of the linked list
        length(list);
        // Occurrence of specific value in the list
        occurance(list, 3);
        // Insert into list2
        insert(list2, 4);
        insert(list2, 6);
        insert(list2, 2);
        insert(list2, 9);
        insert(list2, 0);
        printList(list2);
        // Concatenate lists
        joinList(list, list2, list3);
        // Reverse the list
        reverseList(list);
        // Sort the list
        sortList(list);
        // Remove duplicates from the list
        removeDuplicates(list);
    }
}
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Unchecked_Exception_3702 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        String cf = null;
        do {
            System.out.println("\nException List: " +
                    "\n1. Array Index Out Of Bound" +
                    "\n2. Array Store Exception" +
                    "\n3. Class Cast Exception" +
                    "\n4. Illegal Argument Exception" +
                    "\n5. Index Out Of Bounds" +
                    "\n6. Negative Array Size Exception" +
                    "\n7. Null Pointer Exception" +
                    "\n8. Number Format Exception" +
                    "\n9. String Index Out Of Bounds" +
                    "\n10. Unsupported Operation Exception\n");

            try {

                System.out.print("Select the number to experience the Exception: ");
                int op = i.nextInt();
                switch (op) {

                    case 1:
                        System.out.print("\nEnter the size of array: ");
                        int size = i.nextInt();
                        int array[] = new int[size];
                        for (int j = 0; j < size; j++) {
                            System.out.print("Enter the value for array position-\'" + j + "\': ");
                            array[j] = i.nextInt();
                        }
                        System.out.println("The arrar: " + Arrays.toString(array));

                        System.out.print("Enter the array position to print: ");
                        int array_pos = i.nextInt();       //Index Out of Bound
                        System.out.println("Array value at position \'" + array_pos + "\' is " + array[array_pos] + "\n");

                        break;

                    case 2:
                        Object a[] = new Integer[10];
                        a[0] = 2.3;
                        break;

                    case 3:
                        Object ob = new Object();
                        String s = (String) ob;
                        break;

                    case 4:
                        try {
                            Thread.sleep(-10); // Illegal Argument Exception
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e + "\n");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 5:
                        int array2[] = new int[4];
                        array2[5] = 10;
                        break;

                    case 6:
                        int array3[] = new int[-4];
                        break;

                    case 7:
                        String pointer = null;
                        if (pointer.equals("athi")) {
                            System.out.println("No error\n");
                        }
                        break;

                    case 8:
                        Integer a1 = Integer.parseInt(" 2");
                        break;

                    case 9:
                        String a2 = "athithraja";
                        System.out.println(a2.charAt(19));
                        break;

                    case 10:
                        List<String> l = Arrays.asList("Apple", "Orange", "Mango");
                        l.add("Ninja");
                        break;
                }

            } catch (IndexOutOfBoundsException |
                     ArrayStoreException |
                     ClassCastException |
                     IllegalArgumentException |
                     NegativeArraySizeException |
                     NullPointerException |
                     UnsupportedOperationException e) {
                System.out.println("Error: " + e + "\n");
            }


            System.out.print("Enter \'y\' to Check again: ");
            i.nextLine();
            cf = i.nextLine();

        } while (Objects.equals(cf, "y"));
    }
}

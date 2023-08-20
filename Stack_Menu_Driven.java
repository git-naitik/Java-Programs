import java.util.*;

public class Stack_Menu_Driven {
    static int top = -1, size;

    public static void stack_push(Stack<Integer> stack) {
        if (top == size - 1) {
            System.out.println("The stack is full! No empty space remaining!");
        } else {
            Scanner sc = new Scanner(System.in);
            int j;
            System.out.println("Push Operation");
            System.out.println("Enter the elements to push into the stack : ");
            while (top < size - 1) {
                j = sc.nextInt();
                stack.push(j);
                top++;

            }

        }
    }

    public static void stack_pop(Stack<Integer> stack) {
        if (top == -1) {
            System.out.println("The stack is Empty! Nothing remaining to pop!");
        } else {

            System.out.println("Pop Operation");
            int i = stack.pop();
            System.out.println("The popped element is : " + i);
            top--;
            System.out.println("The new stack size is : " + (top + 1));
        }
    }

    public static void stack_peek(Stack<Integer> stack) {
        if (top == -1) {
            System.out.println("The stack is empty!");
        } else {

            System.out.println("Peek Operation");
            System.out.println("The peeked element is : " + stack.peek());
            System.out.println("The position of the element peeked is : " + (top + 1));
            System.out.println("The new stack size is : " + (top + 1));
        }
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();

        int choice;
        while (true) {
            System.out.println(("Enter choice : \n1. for Push\n2. for Pop\n3. for Peek\n4. to Exit"));
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (top == -1) {
                        System.out.println("Enter the size of the stack : ");
                        size = sc.nextInt();
                        stack.setSize(size);
                        stack_push(stack);
                        break;
                    } else {
                        stack_push(stack);
                        break;
                    }
                case 2:
                    stack_pop(stack);
                    break;
                case 3:
                    stack_peek(stack);
                    break;
                case 4:
                    System.out.println("Exiting!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong choice! Enter a correct number!");
            }

        }
    }
}

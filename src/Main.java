public class Main {
    public static void main(String[] args) {

        StackLinkedList<Object> stack = new StackLinkedList<>();
        stack.push("This is a string");
        stack.push(3);
        stack.push(45);
        stack.push(3.4);
        stack.push(5);
        stack.push("this is a test");
        stack.displayStack();
        System.out.println(stack);
        stack.peek();
        System.out.println("Is empty "
        +stack.isEmpty() );
        System.out.println("Pop = " +
                stack.pop());
        stack.peek();
    }
}
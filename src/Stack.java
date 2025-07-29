public class Stack {

    private int arr[];
    private int top;
    private int capacity;
    public Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        System.out.println("After popping out..");
        stack.printStack();
    }

    private void printStack() {
        for(int i =0; i <= top; i++){
            System.out.println(arr[i]);
        }
    }

    private int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return arr[top--];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private void push(int i) {
        if(isStackFull()){
            System.out.println("Stack Overflow exception");
            System.exit(1);
        }
        System.out.println("Stack insertion of..." + i);
        arr[++top] = i;
    }

    private boolean isStackFull() {
        return top == capacity - 1 ;
    }
}

package Task4_5;

import java.util.Stack;

class StackOperations {
    private Stack<Integer> stack;

    public StackOperations() {
        stack = new Stack<>();
    }

    // Pushes an element onto the stack
    public void push(int element) {
        stack.push(element);
    }

    // Pops an element onto the stack
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack.pop();
    }
    // Display the emlements onto the stack
    public void displayElements() {
        System.out.println("Stack:" + stack);
    }

        // Checks if the stack is empty
    public boolean isEmpty()
    return stack.isEmpty();
    }







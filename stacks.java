import java.util.Stack;
public class stacks {
    public static void main(String[] args) {
        // stack  = LIFO data structure. Last in first out stores the object in a sort of "vertical tower" 
        // push() to add to the top and pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        // String myFavGame =  stack.pop();  // we dont need to specify which one we want to pop because last in first out which means last one will get out first
        // The pop method returns an object of the element that got popped so you can use it 

        // System.out.println(stack.empty());
        // System.out.println(myFavGame);

        // System.out.println(stack.peek());  // you can see the elememt on top of the stack/last added element by using peek
        // System.out.println(stack);

        // System.out.println(stack.search("doom")); // youll get starting position from 1 not 0

        for (int i = 0; i < 1000000000; i++) {
            stack.push("Fallout 76");
        }

        // uses of stack ?
        // 1. Undo/redo features in text editors 
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze , file directories)
        // 4. calling functions (call stack)

    }
}

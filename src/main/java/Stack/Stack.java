package Stack;

public class Stack {

    int[] stack = new int[5];
    int count = 0;

    public void push(int data){
        if (count == 5){
            System.out.println("Stack is full");
        } else {
            stack[count] = data;
            count++;
        }

    }

    public int pop(){
        int data;
        count--;
        data = stack[count];
        stack[count] = 0;
        return data;
    }

    public int peak(){
        int data;
        data = stack[count - 1];
        return data;
    }

    public void show(){
        for (int n : stack){
            System.out.print(n + " ");
        }
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){

        return count <= 0;
    }
}

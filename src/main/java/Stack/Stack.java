package Stack;

public class Stack {

    int[] stack = new int[5];
    int count = 0;

    public void push(int data){
        stack[count] = data;
        count++;
    }

    public int pop(){
        int data;
        count--;
        data = stack[count];
        stack[count] = 0;
        return data;
    }

    public void show(){
        for (int n : stack){
            System.out.print(n + " ");
        }
    }
}

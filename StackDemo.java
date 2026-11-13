import java.util.Scanner;
class Stack {
int a[] = new int[10];
int top = -1;//stack empty

void push(int x) { //function definition
if (top == 9)
System.out.println("Stack Overflow");
else
a[++top] = x;
}

void pop() {
if (top == -1)
System.out.println("Stack Underflow");
else
System.out.println("Popped: " + a[top--]);//index is decremented 9;8
}

void peek() {
if (top == -1)
System.out.println("Stack is Empty");
else
System.out.println("Top: " + a[top]); //element is shown ;90
}

void display() {
if (top == -1)
System.out.println("Stack is Empty");
else {
for (int i = top; i >= 0; i--)
System.out.println(a[i]);
}
}
}

public class StackDemo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Stack s = new Stack();
int ch, x;
do {
System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\n");
System.out.print("Enter choice: ");
ch = sc.nextInt();

switch (ch) { //ch=1,2,3,4,5

case 1: //push
System.out.print("Enter value: ");
x = sc.nextInt();
s.push(x); //function call
break;

case 2:
s.pop();
break;

case 3:
s.peek();
break;

case 4:
s.display();
break;

case 5:
System.out.println("Exit");
break;

default:
System.out.println("Invalid Choice");
}
} while (ch != 5);
sc.close();
}
}
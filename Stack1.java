//simple stack class implemented in a linked list way through java
//implemented such that no modules were imported
public class Stack1 {

    private Stack1 start = null; //start begins at the null pointer and thus is equal to null
    private Object data; //data is the variable that is linked to the pointer and the next element
    private Stack1 next; //next is the pointer after start; the first element pushed links next to start

    // constructor

    public Stack1() {}
    
    // selectors

    public Stack1(Object o, Stack1 link){
        data = o;
        next = link;
    }

    public Object getData(){
        return data;
    }

    /*public void setData(Object o){
        data = o;
    }*/

    public Stack1 getNext(){
        return next;
    }

    /*public void setNext(Stack1 link){
        next = link;
    }*/

    public void push(Object o) {
        start = new Stack1(o, start);
    }

    public Object pop() {
        if (start == null)
          throw new RuntimeException("Tried to pop an empty stack");
        else {
          data = start.getData();
          start = start.getNext();
          return data;
        }
    }

    public Object top() {
        if (start == null)
          return null;
        else return start.getData();
    }

    public boolean isEmpty() {
        return (start == null);
    }

    public static void main(String[] args){
        Stack1 s = new Stack1();
        s.push("Hello again");
        s.push("This is line 2");
        s.push("This is line 3");
        s.push(4);
        s.push("This line will pop out first even though it was pushed in last");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }


}

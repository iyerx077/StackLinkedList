public class Stack {

    private Stack1 start = null; //start begins at the null pointer and thus is equal to null
    private Object data; //data is the variable that is linked to the pointer and the next element
    private Stack next; //next is the pointer after start; the first element pushed links next to start

    // constructor

    public Stack() {}
    
    // selectors

    public Stack(Object o, Stack link){
        data = o;
        next = link;
    }

    public Object getData(){
        return data;
    }

    public Stack1 getNext(){
        return next;
    }

    public void push(Object o) {
        start = new Stack(o, start);
    }

    public Object pop() {
          data = start.getData();
          start = start.getNext();
          return data;
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
        Stack s = new Stack();
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

    // instance variables

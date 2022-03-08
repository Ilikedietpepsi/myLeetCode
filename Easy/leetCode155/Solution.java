class MinStack {
    Stack<Integer> stack;
    List<Integer> list;
    int min = Integer.MAX_VALUE;
   
    public MinStack() {
        stack = new Stack<Integer>();
        list = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        list.add(val);
        min = Math.min(min, val);
    }
    
    public void pop() {
        int a = stack.pop();
        list.remove(list.indexOf(a));
        min = Integer.MAX_VALUE;
        for (int i : list) {
            min = Math.min(min, i);
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

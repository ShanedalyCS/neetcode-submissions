class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();

    public MinStack() {
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        int val =stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
    int min = Integer.MAX_VALUE;
    for(int val : stack){
        if(val < min) min = val;
    }

    
    return min;
    }
}

class twoStacks {
    int top1,top2;
    int size;
    int[] arr;
    
    twoStacks() {
        
     
        size=100;
        arr=new int[size];
        top1=-1;
        top2=size;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(top1+1<top2){
            top1=top1+1;
            arr[top1]=x; 
        }
       
        
        
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        
        // code here
         if(top1+1<top2){
            top2=top2-1;
            arr[top2]=x; 
        }
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
        if(top1>=0){
            return arr[top1--];
        }
        else{
            return -1;
        }
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
          if(top2<size){
            return arr[top2++];
        }
        else{
            return -1;
        }
    }
}
public class queue1
{  private static Object[] qarray;
   private static int size;
   private static int rear;
   private static int front;
   public queue1(int size)
   {
         this.size=size;
         this.rear=-1;
          this.front=-1;
         qarray=new Object[size];
         
   }
   public void push(Object value)
   { if(rear==size-1)
       {
        System.out.println("queue overflow");
       }
       else
       {
     qarray[++rear]=value;
     
       }

   }
public Object pop()
{
    if(front==rear)
    {
        System.out.println("queue underflow");
        return -1;
    }
    else{
            ++front;
           int oldfront=front;
           qarray[oldfront]=null;
        return qarray[oldfront];
    }
    // else{
    //     return qarray[++front];
    // }
}
public Object peek()
{
    return qarray[rear];
}
    public static void main(String args[])
    { 
        queue1 s=new queue1(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
       s.pop();
         for(int i=front+1;i<=rear;i++)
         {
            System.out.println(qarray[i]);
         }
        System.out.println(s.peek());
     

    }
}

public class Assignment02{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(50);
        list.addLast(40);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.addLast(602);
        System.out.println(list);
    }
}


/////////////////----DESIGN
class LinkedList{
  
  public class node{
    public int data;
    public node next;
    public node(int d){
      data=d;
      next=null; //rec
    }
  }
  node head;
  node last;
  
  //A_START-----------------
  public void addLast(int x){
    node newnode = new node(x);
    if(head == null){
      head=newnode;
    }
    else{
      node temp= head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next=newnode;
    }
  }
  //A_END----------------------
  
  //B_START--------------------
  public void removeLast(){
    if(head == null){
      System.out.println("No item to remove.");
    }
    else if(head.next==null){
      System.out.println("Removing last item, "+head.data);
      head=null;
    }
    else{
      node temp= head;
      node nextnod=temp.next;
      while(nextnod.next!=null){
        temp = temp.next;
      }
      System.out.println("Removing last item, "+temp.next.data);
      temp.next=null;
    }
  }
  //B_END-------------------
  
  //C_START-----------------
  public void removeFirst(){
    if(head == null){
      //head==null;
      System.out.println("No item to remove.");
    }
    else{
      System.out.println("Removing first item, "+head.data);
      head=head.next;
    }
  }
  //C_END-------------------------
  //D_START-----------------------
  
  
  
  //override
      public String toString() {
        StringBuilder sb = new StringBuilder();
        node temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append(" -> ");
            }
            temp = temp.next;
        }
        return sb.toString();
    }

}
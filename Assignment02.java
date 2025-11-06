public class Assignment02{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(50);
        list.addLast(40);
        System.out.println(list);
        list.removeFirst();
        list.addLast(82);
        System.out.println(list);
        list.addLast(45);
        list.addLast(602);
        //list.head=list.reverselist(list.head);
        System.out.println(list);
        list.removeKthNodeFromLast(2);
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
  
  //D_START-----------------NEED HELP!------
  public node reverselist(node head){
    if(head==null|| head.next==null){
      return null;
    }
   // else{
      node n= reverselist(head.next);
        head.next.next= head;
        head.next=null;
        
        return null;
      //}
  }
  //D_END????????????????
  
  //E_START-------------sir er tai modify korsi :)
  public node removeKthNodeFromLast(int k){
        node tempSlow = head;
        node tempFast = head;
        node temprem;
        if(head==null){
            throw new IllegalStateException();
        }
        
        for (int i =0; i<k-1; i++) {
            tempFast = tempFast.next;
            if(tempFast==null){
                throw new IllegalArgumentException();
            }
        }
        
    System.out.println();
        while(tempFast.next != null) {
          ///  temprem=tempSlow;
            tempSlow = tempSlow.next;
            tempFast = tempFast.next;
            
        }
    System.out.println("Removing the "+k+"th Node from Last: "+ tempSlow.data);
    tempSlow.next=tempSlow.next.next;
    return tempSlow.next;
  }
  
  //E_END------------------
  
  
  //override--from class
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

package uygulama_Hafta8;

public class LinkedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ListNode list = new ListNode();
    list.data =3; 
    list.next =new ListNode();
    list.data =7 ;
    list.next.next=new ListNode();
    list.next.next.data=12;
    list.next.next.next = null;
  
    System.out.println(list.data + " " + list.next.data + " " );
	}

}

package uygulama_Hafta10;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedIntList linkList = new LinkedIntList();
	     linkList.add(9);
	     linkList.add(4);
	     linkList.add(12);
	     System.out.println(linkList.toString());
	     linkList.remove(1);
	     System.out.println(linkList.toString());
	     System.out.println(linkList.size());
	}

}

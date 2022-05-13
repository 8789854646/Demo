package qsp;

public class EncapB {

	public static void main(String[] args) {
      EncapA a1=new EncapA(10);
      int x=a1.getValue();
      System.out.println(x);
      a1.setValue(30);
      System.out.println(a1.getValue());
	}

}

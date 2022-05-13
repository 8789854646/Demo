package qsp;

public class EncapA {
	private int i;                    //declaration
	public EncapA(int k)
	{
		i=k;                  //intilisation
	}
	public int getValue()     //giving read access
	{
		return i;
	}
	public void setValue(int j)  //giving write access
	{  
		i=j;
	}

}

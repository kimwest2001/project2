package test;

public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�ý��� �����մϴ�.11");
        
        String resultArray [] = getArray(10);
        
        for(String idx : resultArray) {
        	System.out.println("get Array : "+idx);
        }
        System.out.println("�ý��� �����մϴ�.");

	}
	
	public static String[] getArray(int inVal) {
		
		String [] array = new String[10];
		
		for(int i=0; i<inVal; i++) {
			
			array[i] = "int ="+i;
		}
		
		return array;
	}

}

//https://github.com/kimwest2001/projetct1
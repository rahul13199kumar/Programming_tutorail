package findname;

public class searchName {
	
	public static void main(String args[]) {
		String str1="rahulstudyinuniversityRahultakepartinmraHulanyactivitesrAhulRahul";
		String str2 ="rahul";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		int count=0;
		for(int i=0 ; i<str1.length()+1;i++) {
			int indexo=str1.indexOf(str2);
			str1 =str1.substring(indexo+str2.length());
			
			System.out.println(str1);
			count++;
			
		}
		
		System.out.println(count);
	}

}

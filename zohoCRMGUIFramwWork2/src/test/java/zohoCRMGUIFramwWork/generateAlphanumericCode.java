package zohoCRMGUIFramwWork;

import org.testng.annotations.Test;

public class generateAlphanumericCode {
		
	@Test
	
	public void alphanumericCodeTest() {
		int num=20;
		
		String alphanumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		
		// create aplhanumeriv string lenght
		StringBuffer sb=new StringBuffer(num);
		
		for(int i=0;i<=num;i++) {
			
			//concatinate 0 to alpha numaric
			int index=(int) (alphanumericString.length()*Math.random());
			
			// add chracter one by one at the end
			sb.append(alphanumericString.charAt(index));
		}
		System.out.println(sb);
	}
}

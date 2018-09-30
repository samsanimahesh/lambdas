package com.mahesh.batch;


public class Batch {
	public static void main(String[] args) {
//		for(int sim=107;sim<=121;sim++){
			for(int i=1;i<=125;i++){
				if(i<=9){
					System.out.println("cmedit set NetworkElement=K104"+"TCU0200"+"00"+i+",PmFunction=1 pmEnabled=true");
				}else if(i>=10 && i<100){
					System.out.println("cmedit set NetworkElement=K104"+"TCU0200"+"0"+i+",PmFunction=1 pmEnabled=true");
				}else{
					System.out.println("cmedit set NetworkElement=K104"+"TCU0200"+i+",PmFunction=1 pmEnabled=true");
				}
				
			}
//		}
		
	}

}

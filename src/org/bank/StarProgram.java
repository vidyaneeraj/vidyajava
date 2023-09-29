package org.bank;

public class StarProgram {
public static void main(String[] args) {
	int r=5;
for(int i=1;i<=r;i++) {
	for(int j=r-i;j>0;j--) {
		System.out.print(" ");
	}
	for(int j=0;j<i;j++) {
		System.out.print(j+"  " );
	}
	System.out.println();
}
	
	
	
}
}

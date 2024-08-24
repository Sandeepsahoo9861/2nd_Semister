public class H5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [4][4];
		System.out.println("Matrix is: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=(int)(Math.random()*2);
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
	}
		int maxRow=0, temp=0, maxCol=0, temp1=0;
		for(int i=0; i<a.length; i++) {
			int rowCount=0, colCount=0;
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]==1) {
					rowCount++;
				}
				if(rowCount>temp) {
					temp=rowCount;
					maxRow=i;
				}
				if(a[j][i]==1) {
					colCount++;
				}
				if(colCount>temp1) {
					temp1=colCount;
					maxCol=i;
		}
		}
		}
			System.out.println("The largest row index: "+maxRow);
			System.out.println("The largest column index: "+maxCol);
	}
}
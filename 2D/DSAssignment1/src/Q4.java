
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'C','A','R','B','O', 'N'};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				for(int k=0; k<a.length; k++) {
					for(int l=0; l<a.length; l++) {
						for(int m=0; m<a.length; m++) {
							for(int n=0; n<a.length; n++) {
						
					if(i!=j && i!=k && i!=l && i!=m && i!=n &&
							j!=k && j!=l && j!=m && j!=n &&
							k!=l && k!=m && k!=n &&
							l!=m && l!=n &&
							m!=n) {
						System.out.println(""+a[i]+a[j]+a[k]+a[l]+a[m]+a[n]);
				}
			}
		}
	}
			}
		}
	}
	}
}

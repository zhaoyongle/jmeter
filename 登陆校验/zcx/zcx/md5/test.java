package zcx.md5;

public class test {
	public static void main(String args[]){
		long requestTime = System.currentTimeMillis();
		String req = String.valueOf(requestTime);
		System.out.println(requestTime);
		System.out.println(req);
		String res = new StrMD5().MD5("1491565495000");
		System.out.println(res);
		
	}
}

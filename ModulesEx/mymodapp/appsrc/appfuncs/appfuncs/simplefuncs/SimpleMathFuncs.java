package appfuncs.simplefuncs;

import appsupport.supportfuncs.SupportFuncs;

public class SimpleMathFuncs {

	/*public static boolean isFactor(int a, int b){
		if((b%a) == 0) return true;
		return false;
	}*/
	public static int lcf(int a, int b) {
	a = Math.abs(a);
	b = Math.abs(b);

	int min = a < b ? a : b;

	for(int i = 2; i <= min/2; i++) {
		if(SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b))
			return i;
	}
	return 1;
}
public static int gcf(int a, int b) {
	a = Math.abs(a);
	b = Math.abs(b);

	int min = a < b ? a : b;

	for(int i = 2; i >= min/2; i--){
		if(SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b))
			return i;
	}
	return 1;
}
}

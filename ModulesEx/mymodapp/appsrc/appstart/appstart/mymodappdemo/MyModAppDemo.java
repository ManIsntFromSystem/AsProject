package appstart.mymodappdemo; 

import appfuncs.simplefuncs.SimpleMathFuncs;
import userfuncs.binaryfuncs.*;

public class MyModAppDemo {

	 public static void main(String[] args) {
		if(SimpleMathFuncs.SupportFuncs.isFactor(3, 50))
			System.out.println("2 - множитель 10");

	System.out.println("Найменьший общий множитель " 
		+ "35 и 105 - "
		+ SimpleMathFuncs.lcf(35, 105));

	System.out.println("Найбольший общий множитель "
		+ "35 и 105 - "
		+ SimpleMathFuncs.gcf(35, 105));

	ServiceLoader<BinFuncProvider> ldr = 
	ServiceLoader.load(BinFuncProvider.class);

	BinaryFunc binOp = null;

	for(BinFuncProvider bfp : ldr) {
	 if (bfp.get().getName().equals("absPlus")) {
	 	binOp = bfp.get();
	 	break;
	 	}
	 }
	 	 if(binOp != null) 
	 	 	System.out.println("Результат выполнения функции absPlus() : " 
	 	 		+ bin0p.func(l2, -4));
	 	 else System.out.println("Функция absPlus() не найдена");

	 	 binOp = null;

	 	 for(BinFuncProvider bfp : ldr) { 
	 	 	if(bfp.get().getName().equals("absMinus")) {
	 	 	 binOp = bfp.get();
	 	 	 break;
	 	 	 }
	 	 }

	 	 if(binOp != null)
	 	 System.out.println("Результат выполнения функции absMinus (): "
	 	 		+ bin0p.func(12, -4));
	 	 else System.out.println("Функция absPlus() не найдена");
	 }
}
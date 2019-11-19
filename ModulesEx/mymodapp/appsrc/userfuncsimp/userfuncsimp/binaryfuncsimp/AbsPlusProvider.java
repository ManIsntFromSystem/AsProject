package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.*; 

class AbsPlusProvider implements BinFuncProvider {
	public BinaryFunc get()	{return new AbsPlus;}
}
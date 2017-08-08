/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main(String[] args) throws java.lang.Exception
	{
		int [] array = {2,3,4,10,11,12,13};
		int tmp1;
		int tmp2;
		
		System.out.println(Arrays.toString(array));
		for (int i=0; i <= (array.length - 1) / 2; i++){
			tmp1 = array[i];
			array[i] = array[array.length - 1 -i];
			array[array.length - 1 -i] = tmp1;
		}
		System.out.println(Arrays.toString(array));
	}
}

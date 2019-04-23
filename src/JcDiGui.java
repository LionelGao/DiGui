import org.junit.Test;

public class JcDiGui {

	@Test
	public void test() {
		System.out.println(jcdigui(5));
	}

	public int jcdigui(int n) {
		if (n != 1) {
			return n * jcdigui(n - 1);
		}

		return n * 1;
	}

	@Test
	// 不死神兔问题，一对兔子，从出生后第三个月开始，每三个月生一对兔子，小兔子涨到第三个月又生兔子，假设兔子不死，第二十个月的 时候 有多少兔子

//		
//	兔子对数 
//	第一个月： 1 
//	第二个月： 1 
//	第三个月： 2 
//	第四个月： 3
//	五个月： 5 
//	第六个月： 8 ...
//		  
//	由此可见兔子对象的数据是： 1,1,2,3,5,8... 规则： A:从第三项开始，每一项是前两项之和 B:而且说明前两项是已知的
//	  
//	如何实现这个程序呢? 
//	A:数组实现 
//	B:变量的变化实现 
//	C:递归实现
//	  
//	假如相邻的两个月的兔子对数是a,b 
//	第一个相邻的数据：a=1,b=1 
//	第二个相邻的数据：a=1,b=2 
//	第三个相邻的数据：a=2,b=3
//	第四个相邻的数据：a=3,b=5 
//	看到了：下一次的a是以前的b，下一次是以前的a+b

	public void test2() {
		// A数组实现
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < 20; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}

		System.out.println(arr[19]);
		System.out.println("-----以上是数组实现------");

		// B 变量转换
		int a = 1;
		int b = 1;

		for (int i = 0; i < 18; i++) {
			int tem = a;
			a = b;
			b = tem + b;
		}

		System.out.println(b);
		System.out.println("-----------以上是变量转换实现----------");
		System.out.println(tuzi(20));
		System.out.println("-----------以上是递归实现----------");

	}

	/*
	 * 方法实现： 返回值类型：int 参数：n
	 * 
	 * 
	 */
	public int tuzi(int n) {
		if (n == 1 | n == 2) {
			return 1;
		}

		return tuzi(n - 1) + tuzi(n - 2);
	}
}
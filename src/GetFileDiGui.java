import java.io.File;

import org.junit.Test;

public class GetFileDiGui {
	@Test

	// 把D盘所有的java文件

	public void test1() {
		File srcFolder = new File("D:\\eclipse-workspace");
		getAllJavaFilePaths(srcFolder);

	}

//	步骤：
//		A:把文件子目录转为数组
//		B:判断每一个数组元素是否是文件夹
//		 	是：A
//			否：说明它是文件，判断其名字是否是  以.java结尾的
// 					是：输出这个文件的绝对路径

	private void getAllJavaFilePaths(File srcFolder) {
		// TODO Auto-generated method stub
		File[] fileArray = srcFolder.listFiles();
		for (File file : fileArray) {
			if (file.isDirectory()) {
				getAllJavaFilePaths(file);
			} else {
				if (file.getName().endsWith(".java")) {
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
}

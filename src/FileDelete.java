import java.io.File;

import org.junit.Test;

public class FileDelete {

	@Test
	// A:封装目录
	// B：获取该目录下的所有的子目录或文件 数组
	// C：遍历该数组
	// D：判断该数组元素是否是文件夹
	// 是：回到B
	// 否：删除
	// E: 以上步骤删掉了所有的文件，这一步将空文件夹删除

	public void test1() {

		File srcFolder = new File("ddddd");
		deleteF(srcFolder);
	}

	private void deleteF(File srcFolder) {
		// TODO Auto-generated method stub
		File[] fileArray = srcFolder.listFiles();
		for (File file : fileArray) {
			if (file.isDirectory()) {
				deleteF(file);
			} else {
				System.out.println(file.getName() + "--" + file.delete());
			}
		}

		System.out.println(srcFolder.getName() + "---" + srcFolder.delete());
	}

}

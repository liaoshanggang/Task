package com.lanqiao.task12;
/*4、现在有个字符串是按照如下格式保存的:“张三:90|李四:80|王五:100”
*/
/*显示后的数据如下所示，按不同的人员显示：
	姓名：张三，成绩是：90；
	姓名：李四，成绩是：90；
	姓名：王五，成绩是：100；
	*/

public class TestString4 {
	public static void main(String[] args) {
		String str = "张三:90|李四:80|王五:100";
		//用","替换"|"
		String str1 = str.replace("|", ",");
		//第一次分开
		String[] s = str1.split(",");
		//第二次对每个分开后的字符串再分开并显示
		for(int i=0;i<s.length;i++){
			String[] s2 = s[i].split(":");
			System.out.println("姓名："+s2[0]+",成绩是："+s2[1]);
		}
	}
}

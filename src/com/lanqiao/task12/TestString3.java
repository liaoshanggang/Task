package com.lanqiao.task12;
/*3、编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转
例：“To be or not to be"，将变成"oT eb ro ton ot eb"。
*/
public class TestString3 {
	public static void main(String[] args) {
		String aText = "To be or not to be";
		System.out.println("这段文本为："+aText);
		//按空格分隔
		String[] strs = aText.split(" ");
		//因为要对字符串内容经常修改，所以要想到用StringBuffer
		StringBuffer sbf = new StringBuffer();
		for(int i=0;i<strs.length;i++){
			//把每个String子串变为StringBufffer字符串
			StringBuffer sbf1 = new StringBuffer(strs[i]);
			//反转
			sbf1.reverse();
			//每个子串加空格并加到可变序列中
			sbf.append(sbf1+" ");
		}
		//删除最后一个空格
		sbf.deleteCharAt(sbf.length()-1);
		//输出最后的反转后的字符串
		System.out.println("把这段文本中的各个单词的字母顺序翻转后变为:"+sbf);
	}
}

/*String aText = "To be or not to be";
//根据空隔分割成几个子字符串
String[] strs = aText.split(" ");

//
String[] strs1 = new String[strs.length];
//把反转后的子字符串连接起来并存到新的一个字符串中
String reveStr = "";
for(int i=0;i<strs.length;i++){
	System.out.println("分割成的子串："+strs[i]);
	
	//反转
	char[] c = strs[i].toCharArray(); 
	char temp = c[0];
	c[0] = c[c.length-1];
	c[c.length-1] = temp;
	//字符转为字符串
	strs1[i] = String.valueOf(c);
	System.out.println("对应子串反转后变为："+strs1[i]);
	
	//插入字符串间隔的空格数
	if(i==0){
		reveStr = strs1[0];
	}else{
		reveStr = reveStr + " " + strs1[i];
	}
}
//最终输出这一段文本中的各个单词的字母顺序翻转后的字符串
System.out.println("reveStr:"+reveStr);*/
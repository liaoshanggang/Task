package com.lanqiao.date170316.test1;

/* •	需求说明：
–	采用面向接口编程思想书写一封家书
–	家书内容包含：
•	称谓
•	问候
•	内容
•	祝福
•	落款*/
public interface HomeLetter {
	String writeTitle();//书写称谓
	String writeHello();//书写问候
	String writeBody();//书写内柔
	String writeGreeting();//书写祝福
	String writeSelft();//书写落款
}

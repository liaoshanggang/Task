package com.lanqiao.date170316.test1;

public class HomeLetterImpl implements HomeLetter{

	@Override
	public String writeTitle() {
		return "亲爱的爸爸、妈妈\n";
	}

	@Override
	public String writeHello() {
		return "\t你们好吗？\n";
	}

	@Override
	public String writeBody() {
		return "\t我在这里挺好的。\n\t我会努力学习的，已经学到Java OOP啦\n"
				+ "\t您二老保重身体啊！\n";
	}

	@Override
	public String writeGreeting() {
		return "\t此致\n敬礼\n";
	}

	@Override
	public String writeSelft() {
		return "\t\t\t\t周杰\n\t\t\t2010年6月1日";
	}

}

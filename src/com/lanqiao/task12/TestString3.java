package com.lanqiao.task12;
/*3����дһ�����򣬽������һ���ı��еĸ������ʵ���ĸ˳��ת
������To be or not to be"�������"oT eb ro ton ot eb"��
*/
public class TestString3 {
	public static void main(String[] args) {
		String aText = "To be or not to be";
		System.out.println("����ı�Ϊ��"+aText);
		//���ո�ָ�
		String[] strs = aText.split(" ");
		//��ΪҪ���ַ������ݾ����޸ģ�����Ҫ�뵽��StringBuffer
		StringBuffer sbf = new StringBuffer();
		for(int i=0;i<strs.length;i++){
			//��ÿ��String�Ӵ���ΪStringBufffer�ַ���
			StringBuffer sbf1 = new StringBuffer(strs[i]);
			//��ת
			sbf1.reverse();
			//ÿ���Ӵ��ӿո񲢼ӵ��ɱ�������
			sbf.append(sbf1+" ");
		}
		//ɾ�����һ���ո�
		sbf.deleteCharAt(sbf.length()-1);
		//������ķ�ת����ַ���
		System.out.println("������ı��еĸ������ʵ���ĸ˳��ת���Ϊ:"+sbf);
	}
}

/*String aText = "To be or not to be";
//���ݿո��ָ�ɼ������ַ���
String[] strs = aText.split(" ");

//
String[] strs1 = new String[strs.length];
//�ѷ�ת������ַ��������������浽�µ�һ���ַ�����
String reveStr = "";
for(int i=0;i<strs.length;i++){
	System.out.println("�ָ�ɵ��Ӵ���"+strs[i]);
	
	//��ת
	char[] c = strs[i].toCharArray(); 
	char temp = c[0];
	c[0] = c[c.length-1];
	c[c.length-1] = temp;
	//�ַ�תΪ�ַ���
	strs1[i] = String.valueOf(c);
	System.out.println("��Ӧ�Ӵ���ת���Ϊ��"+strs1[i]);
	
	//�����ַ�������Ŀո���
	if(i==0){
		reveStr = strs1[0];
	}else{
		reveStr = reveStr + " " + strs1[i];
	}
}
//���������һ���ı��еĸ������ʵ���ĸ˳��ת����ַ���
System.out.println("reveStr:"+reveStr);*/
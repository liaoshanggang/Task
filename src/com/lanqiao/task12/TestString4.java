package com.lanqiao.task12;
/*4�������и��ַ����ǰ������¸�ʽ�����:������:90|����:80|����:100��
*/
/*��ʾ�������������ʾ������ͬ����Ա��ʾ��
	�������������ɼ��ǣ�90��
	���������ģ��ɼ��ǣ�90��
	���������壬�ɼ��ǣ�100��
	*/

public class TestString4 {
	public static void main(String[] args) {
		String str = "����:90|����:80|����:100";
		//��","�滻"|"
		String str1 = str.replace("|", ",");
		//��һ�ηֿ�
		String[] s = str1.split(",");
		//�ڶ��ζ�ÿ���ֿ�����ַ����ٷֿ�����ʾ
		for(int i=0;i<s.length;i++){
			String[] s2 = s[i].split(":");
			System.out.println("������"+s2[0]+",�ɼ��ǣ�"+s2[1]);
		}
	}
}

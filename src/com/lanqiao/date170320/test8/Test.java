package com.lanqiao.date170320.test8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*���ˣ�ʹ��LinkedList������һ�����϶���ѭ�����롰С��1������С��2��,��С��3��,��С��4��,��С��5��������С��100����
 * ���������ϵĴ�С����ʹ��ѭ��ɾ�������������������Ϊż���Ķ��󣬱��硰С��6������С��100��������ż������
 * ���ѭ��������������еĶ��󣬿��Ƿ�ɾ���ɹ���
 */
public class Test {
	public static void main(String[] args) {
		// ѭ�����롰С��1������С��2��,��С��3��,��С��4��,��С��5��������С��100��
		List list = new LinkedList();
		for (int i = 1; i <= 100; i++) {
			list.add(i - 1, "С��" + i);
		}

		System.out.println("������ϴ�СΪ��" + list.size());

		// ɾ�������������������Ϊż���Ķ���
		for (int i = list.size() - 1; i >= 0; i--) {
			//�Ӽ�����ȡ��Ԫ�ز���ȡ���ֲ����ַ���
			String s = list.get(i).toString().substring(2);
			int j = Integer.parseInt(s);
			if (j % 2 == 0) {
				// System.out.println(list.get(j-1));//�鿴�Ƿ�Ϊż����
				list.remove(j - 1);
			}
		}
		
		System.out.println("ɾ�������������������Ϊż���Ķ���󼯺ϱ�Ϊ:");
		// ���ѭ��������������еĶ��󣬿��Ƿ�ɾ���ɹ���
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}

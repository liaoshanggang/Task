package com.lanqiao.date170320.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*ʮ������һ��Map����,key��value���涨���ͣ�����������ݣ���keySet()��
 entrySet()���ַ�ʽ������Map���ϵ�����
 */
public class Test10 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("����", "����");
		map.put(1, "hello");
		map.put('o', "^V^");
		map.put(new Double(33.4), 33.4);
		
		//��keySet()�ͱ�����Map���ϵ�����
		for (Object o : map.keySet()) {
			System.out.println(map.get(o));
		}

		//entrySet()������Map���ϵ�����
		Iterator it = map.entrySet().iterator();
	
		while (it.hasNext()) {
			Object object = (Object) it.next();
			Entry entry = (Entry) object;
			System.out.println(entry + "\t��:" + entry.getKey() + "ֵ:"
					+ entry.getValue());
		}
	}
}

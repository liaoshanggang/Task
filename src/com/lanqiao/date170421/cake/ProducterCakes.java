package com.lanqiao.date170421.cake;


public class ProducterCakes implements Runnable {

	private Cakes cakes;
	int total = 0;

	public ProducterCakes(Cakes cakes) {
		super();
		this.cakes = cakes;
	}

	@Override
	public void run() {

		while (true) {

			// wait �� notify һ��Ҫд�� Synchronized �������
			synchronized (cakes) {

				while (cakes.isFlag()) {
					try {
						// ����д�������ô����������ү����
						cakes.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // α����

				if (total % 2 == 0) {
					cakes.setName("��Ĵ���");
					cakes.setPrice(3.00);
				} else if (total % 3 == 0) {
					cakes.setName("�����Ĵ���");
					cakes.setPrice(6.50);
				} else {
					cakes.setName("��������");
					cakes.setPrice(10.50);
				}

				System.out.println(Thread.currentThread().getName() + "������һ��" + cakes.toString());
				total++;

				cakes.setFlag(true);
				cakes.notify();

			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

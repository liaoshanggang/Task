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

			// wait 与 notify 一定要写在 Synchronized 代码块中
			synchronized (cakes) {

				while (cakes.isFlag()) {
					try {
						// 如果有大煎饼，那么不生产，大爷等着
						cakes.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // 伪唤醒

				if (total % 2 == 0) {
					cakes.setName("光的大煎饼");
					cakes.setPrice(3.00);
				} else if (total % 3 == 0) {
					cakes.setName("带蛋的大煎饼");
					cakes.setPrice(6.50);
				} else {
					cakes.setName("超级大煎饼");
					cakes.setPrice(10.50);
				}

				System.out.println(Thread.currentThread().getName() + "生产了一个" + cakes.toString());
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

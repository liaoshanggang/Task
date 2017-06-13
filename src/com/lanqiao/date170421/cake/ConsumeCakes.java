package com.lanqiao.date170421.cake;


public class ConsumeCakes implements Runnable {

	private Cakes cakes;

	public ConsumeCakes(Cakes cakes) {
		super();
		this.cakes = cakes;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (cakes) {
				while (!cakes.isFlag()) {
					try {
						cakes.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + "≥‘¡À“ª∏ˆ" + cakes.toString());

				cakes.setFlag(false);
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

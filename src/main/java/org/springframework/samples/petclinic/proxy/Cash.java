package org.springframework.samples.petclinic.proxy;

public class Cash implements Payment {

	@Override
	public void pay(int amount) {
		System.out.printf(amount + " 현금 결제");
	}

}

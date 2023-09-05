package com.denyaar.paywithecocashpos;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayWithEcocashPosApplication {

	public static void main(String[] args) {

		//SpringApplication.run(PayWithEcocashPosApplication.class, args);

		PaymentFacade paymentFacade = new PaymentFacade(771815579,3322);

		paymentFacade.makePayment(1_000.00);

	}

}

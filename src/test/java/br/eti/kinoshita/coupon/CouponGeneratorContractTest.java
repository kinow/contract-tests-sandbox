package br.eti.kinoshita.coupon;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractTest;
import org.xenei.junit.contract.IProducer;

@Contract(CouponGenerator.class)
public class CouponGeneratorContractTest<T extends CouponGenerator> {

	// the producer we will user
	private IProducer<T> producer;

	@Contract.Inject
	// define the method to set producer.
	public final void setProducer(IProducer<T> producer) {
		this.producer = producer;
	}

	protected final IProducer<T> getProducer() {
		return producer;
	}

	@After
	public final void cleanupAT() {
		getProducer().cleanUp(); // clean up the producer for the next run
	}

	@ContractTest
	public void shouldGenerateACouponWhenEnabled() throws CouponException {
		CouponGenerator couponGenerator = getProducer().newInstance();
		couponGenerator.generateCoupon();
		assertNotNull(couponGenerator);
	}

	@ContractTest
	public void shouldFailWhenDisabled() throws CouponException {
		CouponGenerator couponGenerator = getProducer().newInstance();
		couponGenerator.generateCoupon();
		assertNotNull(couponGenerator);
		try {
			couponGenerator.setEnabled(false);
			couponGenerator.generateCoupon();
			fail("Coupon Generator must fail if disabled!");
		} catch (CouponException ce) {
			// ignore
		}
		
	}
}

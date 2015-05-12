package br.eti.kinoshita.coupon;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;

@RunWith(ContractSuite.class)
@ContractImpl(value = CouponGeneratorImpl.class)
public class CouponGeneratorImplTest {

	protected IProducer<CouponGenerator> couponGeneratorProducer;

	public CouponGeneratorImplTest() {
		couponGeneratorProducer = new IProducer<CouponGenerator>() {

			public void cleanUp() {
				// nothing to do
			}

			public CouponGenerator newInstance() {
				return new CouponGeneratorImpl(true);
			}
		};
	}

	@Contract.Inject
	// define the method to set producer.
	public final void setProducer(IProducer<CouponGenerator> producer) {
		this.couponGeneratorProducer = producer;
	}

	protected final IProducer<CouponGenerator> getProducer() {
		return couponGeneratorProducer;
	}

}

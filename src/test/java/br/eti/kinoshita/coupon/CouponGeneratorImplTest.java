package br.eti.kinoshita.coupon;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.ContractTestRunner;
import org.xenei.junit.contract.IProducer;

@RunWith(ContractTestRunner.class)
public class CouponGeneratorImplTest extends CouponGeneratorContractTest<CouponGeneratorImpl> {

	public CouponGeneratorImplTest() {
		setProducer(new IProducer<CouponGeneratorImpl>() {

			public void cleanUp() {
				// nothing to do
			}

			public CouponGeneratorImpl newInstance() {
				return new CouponGeneratorImpl(true);
			}
		});
	}

}

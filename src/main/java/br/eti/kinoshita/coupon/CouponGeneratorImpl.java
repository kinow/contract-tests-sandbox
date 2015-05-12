package br.eti.kinoshita.coupon;

public class CouponGeneratorImpl implements CouponGenerator {
	
	private boolean enabled;

	public CouponGeneratorImpl(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void generateCoupon() throws CouponException {
		if (!isEnabled())
			throw new CouponException("Coupon generator disabled");
		System.out.println("Coupon generated!");
	}

}

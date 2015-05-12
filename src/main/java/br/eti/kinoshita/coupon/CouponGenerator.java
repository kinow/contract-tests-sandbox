package br.eti.kinoshita.coupon;

public interface CouponGenerator {

	void setEnabled(boolean enabled);

	boolean isEnabled();

	/**
	 * Generates a coupon, unless the coupon generation has been disabled.
	 *
	 * @throws CouponException if the coupon generation has been disabled
	 */
	void generateCoupon() throws CouponException;

}

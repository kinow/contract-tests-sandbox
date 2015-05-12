package br.eti.kinoshita.coupon;

/**
 * Coupon exception.
 */
public class CouponException extends Exception {

	private static final long serialVersionUID = 1275182857605204357L;

	public CouponException() {
	}

	public CouponException(String message) {
		super(message);
	}

	public CouponException(Throwable cause) {
		super(cause);
	}

	public CouponException(String message, Throwable cause) {
		super(message, cause);
	}

	public CouponException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

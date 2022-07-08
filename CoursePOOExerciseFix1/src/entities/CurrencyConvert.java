package entities;

public class CurrencyConvert {

	public static double IOF = 0.06;
	
	public static double dollarToReal (double quant, double dollarPrice) {
		return quant * dollarPrice * (1.0 + IOF);
	}
}
package NewPack;

public class HomeWork2 {
	public static void main(String[] args) {
		/**
		 * F to C
		 * F to K
		 * K to C
		 * K to F
		 * C to F
		 * C to K
		 */
		
		double fTemp=76;
		double cTemp=38;
		double kTemp=302;
		
		/**
		 * Fahrenheit to celsius formula C=(F-32)*(5/9)
		 * Fahrenheit to Kalvin formula K=(F-32)*(5/9)+ 273.15
		 * Kalvin to Celsious formula C=K-273.15
		 * K to F formula F=(K-273.15)*1.8+32
		 * C to F formula F=(c*9/5)+32
		 * C to K formula K=C+273.15
		 */
		System.out.println(fTemp+" in fehrenheit= "+(fTemp-32)*5/9+" degrees in celsius");
		
		double k=(fTemp-32)*(5.0/9)+273.15;
		System.out.println(fTemp+" in fehrenheit= "+k+" degrees in Kelvin");
		
		double kToC=kTemp-273.15;
		System.out.println(kTemp+" in Kelvin= "+kToC+" degrees in Celsius");
		
		double kToF=(kTemp-273.15)*1.8+32;
		System.out.println(kTemp+" in Kelvin= "+kToF+" degrees in Fahrenheit");
		
		double cToF=(cTemp*9.0/5)+32;
		System.out.println(cTemp+" in Celsius= "+cToF+" degrees in Fahrenheit");
		
		double cToK=cTemp+273.15;
		System.out.println(cTemp+" in Celsius= "+cToK+" degrees in Kelvin");

}
}
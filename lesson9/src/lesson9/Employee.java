package lesson9;

public abstract class Employee {
	protected static String name;
	protected static int type;
	protected static double rate;
	protected static int hours;	
	protected static double totalPay;
	public Employee() {
	 name = "";
	 type = 0;
	 rate = 0;
	 hours = 0;	
	}

	
	public static String getNameRules() {
	 	return "nonblank";
	}

	public static String getTypeRules() {
		return "1 or 2";
	}


	public static String getRateRules() {
		return "between 6.75 and 30.50, inclusive";
	}

	
	public static String getHoursRules() {
		return "between 1 and 60, inclusive";
	}

	public static boolean setName(String nm) {
		if (nm.equals(""))
			return false;
		else{
			name=nm;
			return true;
		}
	}

	
	public static boolean setType(int tp) {
		if (tp != 1 && tp != 2)
			return false;
		else{
			type=tp;
			return true;
		}
	}

	
	public  static boolean setRate(double rt) {
		if (rt < 6.75 || rt > 30.50)
			return false;
		else{
			rate=rt;
			return true;
		}
	}

	public static boolean setHours(int hrs) {
		if (hrs < 1 || hrs > 60)
			return false;
		else{
			hours=hrs;
			return true;
		}
	}

	public static String getName() {
		return name;
	}

	
        public abstract double getPay();
        
        public static double getTotalPay(){
            return totalPay;
        }
}

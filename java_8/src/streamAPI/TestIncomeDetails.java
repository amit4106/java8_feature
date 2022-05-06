package streamAPI;


import java.util.Arrays;
import java.util.List;

public class TestIncomeDetails {
	public static List<IncomeDetails> getIncomeTestData(){
		List<IncomeDetails> Income=Arrays.asList(new IncomeDetails("IND","IND","M","INR",987.9));
			  /*new IncomeDetails("IND","F","INR",96.30),
				new IncomeDetails("New Delhi","M","INR",56.00),
				new IncomeDetails("New Delhi","F","INR",56.02),
				new IncomeDetails("UK","F","GBP",7861.31),
				new IncomeDetails("UK","M","GBP",7862.62),
				new IncomeDetails("USA","F","USD",500.00),
				new IncomeDetails("USA","M","USD",600.00));*/
		return Income;
	}

	public static void main(String[] args) {

	}

}

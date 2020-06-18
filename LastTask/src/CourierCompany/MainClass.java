package CourierCompany;

import java.util.Random;

public class MainClass {

	private static Employee getChain() {
		Employee plovdivCityEmployee = new PlovdivCityEmployee();
		Employee countryEmployee = new CountryEmployee();
		Employee abroadEmployee = new AbroadEmployee();
		
		plovdivCityEmployee.setNextEmployee(countryEmployee);
		countryEmployee.setNextEmployee(abroadEmployee);
		return plovdivCityEmployee;
	}
	
	public static void main(String[] args) {

		Context plovdivCity = new Context("PLovdivCity");
		Context country = new Context("Country");
		Context abroad = new Context("Abroad");
		
		Employee chain = getChain();
		chain.logMessage(3, "Hello");
		
		StandAndWaitState standAndWaitState = new StandAndWaitState();
		PreparationState preparationState = new PreparationState();

		standAndWaitState.applyState(plovdivCity);
		standAndWaitState.applyState(country);
		standAndWaitState.applyState(abroad);
		
		Topic topic = new Topic();
		
		//The customer chooses one of the three counters
		Random rand = new Random();
        int selectCounter = rand.nextInt(3) + 1;
		
		if (selectCounter == 1) {
			System.out.println("First counter state is: " + plovdivCity.getState().getStateName());
			preparationState.applyState(plovdivCity);
			System.out.println("Order confirmed and state updated to: " + plovdivCity.getState().getStateName());
		}else if(selectCounter == 2) {
			System.out.println("Second counter state is: " + country.getState().getStateName());
			preparationState.applyState(country);
			System.out.println("Order confirmed and state updated to: " + country.getState().getStateName());
		}else if (selectCounter == 3) {
			System.out.println("Third counter state is: " + abroad.getState().getStateName());
			preparationState.applyState(abroad);
			System.out.println("Order confirmed and state updated to: " + abroad.getState().getStateName());
			}
		
		Observer observer = new TheBoy("Boy:");
		topic.subscribe(observer);		
		topic.setName(standAndWaitState.getStateName());	
		
		}
	}

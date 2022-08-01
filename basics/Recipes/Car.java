package Recipes;

public class Car{
	private int wheelNumber;
	private String colour;

	public Car(int wheelNumber, String colour){
		this.wheelNumber = wheelNumber;
		this.colour = colour;
	}

	public void setWheelNumber(int wheelNumber) {
		if(wheelNumber < 1){
			return;
		}
		this.wheelNumber = wheelNumber;
	}

	public int getWheelNumber(){
		return this.wheelNumber;
	}

	public void setColour(String colour){
		this.colour = colour;
	}

	public String getColour(){
		return colour;
	}

	@Override
	public String toString() {
		return "Recipes.Car{" +
				"wheelNumber=" + wheelNumber +
				", colour='" + colour + '\'' +
				'}';
	}
}

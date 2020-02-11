package testclasses;

public class Mix {

	private double mlBase;
	private double mlAroma;
	private double mlNic;
	private String name;
	
	
	public Mix(double b, double a, double n) {
		this.mlBase = b;
		this.mlAroma = a;
		this.mlNic = n;
	 
	}



	public double getMlBase() {
		return mlBase;
	}



	public void setMlBase(double mlBase) {
		this.mlBase = mlBase;
	}



	public double getMlAroma() {
		return mlAroma;
	}



	public void setMlAroma(double mlAroma) {
		this.mlAroma = mlAroma;
	}



	public double getMlNic() {
		return mlNic;
	}



	public void setMlNic(double mlNic) {
		this.mlNic = mlNic;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Mix [mlBase=" + mlBase + ", mlAroma=" + mlAroma + ", mlNic=" + mlNic + ", name=" + name + "]";
	}



	
	

}

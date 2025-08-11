class Vechicle { 
	static int code = 100;
    int vehicleCode;
    private String brand;
    
    Vechicle(String brand) {
        this.vehicleCode = code++;
        this.brand = brand;
    }
    public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
class Car extends Vechicle {
    private String model;
    Car(String brand, String model) {
        super(brand); 
        this.model = model;
    }
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
    
}

class Owner extends Car {
	
    private String ownerName;

    Owner(String brand, String model, String ownerName) {
        super(brand, model);   
        this.ownerName = ownerName;
    }
    
    public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	void displayOwner() {
        System.out.println("Vehicle Code: " + vehicleCode);
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel()); 
        System.out.println("Owner Name: " + getOwnerName());
    }
    
}
public class Multilevel {
    public static void main(String[] args) {
        Owner obj = new Owner("TVS", "Raider", "Pragatheesh");
        obj.displayOwner();
    }
}

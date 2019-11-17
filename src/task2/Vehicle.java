package task2;

public class Vehicle {
    private String typeVehicle;
    private String mark;
    private String model;
    private String yearbook;
    private int vehicleMileage;
    private String vin;

    public Vehicle(String typeVehicle, String mark, String model, String yearbook, int vehicleMileage, String vin) {
        this.typeVehicle = typeVehicle;
        this.mark = mark;
        this.model = model;
        this.yearbook = yearbook;
        this.vehicleMileage = vehicleMileage;
        this.vin = vin;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearbook() {
        return yearbook;
    }

    public void setYearbook(String yearbook) {
        this.yearbook = yearbook;
    }

    public int getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(int vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "typeVehicle='" + typeVehicle + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearbook='" + yearbook + '\'' +
                ", vehicleMileage=" + vehicleMileage +
                ", vin='" + vin + '\'' +
                '}';
    }
}

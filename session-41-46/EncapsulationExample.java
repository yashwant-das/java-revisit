public class EncapsulationExample {

    public static class Car {
        // Private attributes
        private String brand;
        private String model;
        private int year;

        // Constructor
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Getter methods
        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        // Setter methods
        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setYear(int year) {
            // Validate that the year is not negative
            if (year >= 0) {
                this.year = year;
            } else {
                System.out.println("Invalid year. Year cannot be negative.");
            }
        }

        // Additional method
        public void displayCarInfo() {
            System.out.println("Car: " + brand + " " + model + " (" + year + ")");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022);

        // Use getter methods to access attributes
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Use setter methods to modify attributes
        myCar.setYear(2023);

        // Display updated car information
        myCar.displayCarInfo();
    }
}

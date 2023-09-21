package MetodiArray;

import java.util.*;
import java.util.stream.Collectors;

public class Car {

    static class CarInsurance {
        String company;
        String riskClass;
        long yearlyCost;

        public CarInsurance() {
        }

        public CarInsurance(String company, String riskClass, long yearlyCost) {
            this.company = company;
            this.riskClass = riskClass;
            this.yearlyCost = yearlyCost;
        }

        public String getCompany() {
            return this.company;
        }

        public String getRiskClass() {
            return this.riskClass;
        }

        public long getYearlyCost() {
            return this.yearlyCost;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            if (this.company != null) {
                builder.append(this.company);
            }
            if (this.riskClass != null) {
                builder.append(" [risk class = " + this.riskClass + " - cost: " + this.yearlyCost + "€ ]");
            }
            return builder.toString();
        }
    }

    private String plate;
    private String model;
    private int maxSpeed;
    private CarInsurance insurance;
    private String buildCountry;

    public Car() {
    }

    public Car(String plate, String model, int maxSpeed, CarInsurance insurance, String buildCountry) {
        this.plate = plate;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.insurance = insurance;
        this.buildCountry = buildCountry;
    }

    public String getPlate() {
        return this.plate;
    }

    public String getModel() {
        return this.model;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public CarInsurance getInsurance() {
        return this.insurance;
    }

    public String getBuildCountry() {
        return this.buildCountry;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Car:");
        if (this.plate != null) {
            builder.append(" plate = " + this.plate);
        }
        if (this.model != null) {
            builder.append(" model = " + this.model);
        }
        if (this.maxSpeed > 0) {
            builder.append(" max speed = " + this.maxSpeed);
        }
        if (this.buildCountry != null) {
            builder.append(" built in " + this.buildCountry);
        }
        if (this.insurance != null) {
            builder.append(" insured with " + this.insurance.toString());
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        List<Car> cars = initCarList();
        // All cars built in Germany
        List<Car> carsBuiltInGermany = cars.stream().filter(c -> c.getBuildCountry().equalsIgnoreCase("Germania"))
                .collect(Collectors.toList());
        carsBuiltInGermany.forEach(System.out::println);

        // Filter cars with max speed > 180 (fast cars)
        List<Car> fastCars = cars.stream().filter(c -> c.getMaxSpeed() > 180).collect(Collectors.toList());
        fastCars.forEach(System.out::println);

        // Distinct insurance companies
        List<String> insuranceCompanies = cars.stream().map(c -> c.getInsurance().getCompany())
                .distinct().collect(Collectors.toList());
        insuranceCompanies.forEach(System.out::println);

        // Distinct build countries
        List<String> buildCountries = cars.stream().map(c -> c.getBuildCountry())
                .distinct().collect(Collectors.toList());
        buildCountries.forEach(System.out::println);

        // Produce a map (model, list of cars)
        List<String> carsByModel = cars.stream().map(el -> el.model).collect(Collectors.toList());
        carsByModel.forEach(System.out::println);

        // Cars with risk class B*
        List<Car> carsWithRiskClassB = cars.stream().filter(c -> c.getInsurance().getRiskClass().startsWith("B"))
                .collect(Collectors.toList());
        carsWithRiskClassB.forEach(System.out::println);

        // Cars with insurance yearly cost less than 1000 (cheap insurance)
        List<Car> carsWithCheapInsurance = cars.stream().filter(c -> c.getInsurance().getYearlyCost() < 1000)
                .collect(Collectors.toList());
        carsWithCheapInsurance.forEach(System.out::println);

        // Sort by max speed (faster to slower)
        List<Car> carsSortedByMaxSpeed = cars.stream().sorted(Comparator.comparing(Car::getMaxSpeed))
                .collect(Collectors.toList());
        carsSortedByMaxSpeed.forEach(System.out::println);

        // Sort by yearly insurance cost (from lower to higher)
        List<Car> carsSortedByInsuranceCost = cars.stream()
                .sorted(Comparator.comparing(c -> c.getInsurance().getYearlyCost()))
                .collect(Collectors.toList());
        carsSortedByInsuranceCost.forEach(System.out::println);
    }

    private static List<Car> initCarList() {
        Car car1 = new Car("EM 977 DM", "Fiat Panda", 150, new CarInsurance("Zurich Assicurazioni", "B4", 850),
                "Italia");
        Car car2 = new Car("AG 784 BY", "Fiat Punto", 175, new CarInsurance("Zurich Assicurazioni", "C1", 625),
                "Italia");
        Car car3 = new Car("FG 134 MD", "Volkswagen Polo", 210, new CarInsurance("Allianz Assicurazioni", "A3", 1215),
                "Germania");
        Car car4 = new Car("FW 357 HA", "Opel Corsa E", 220, new CarInsurance("Unipol SAI", "A1", 700), "Germania");
        Car car5 = new Car("FZ 767 GR", "Opel Corsa ZX", 240, new CarInsurance("Sara Assicurazioni", "A4", 1098),
                "Germania");
        Car car6 = new Car("FJ 002 FX", "Renault Clio", 210, new CarInsurance("Unipol SAI", "A2", 980), "Francia");
        Car car7 = new Car("EW 854 JJ", "Fiat 500 L", 180, new CarInsurance("Assicurazioni Generali", "B2", 1105),
                "Italia");
        Car car8 = new Car("FX 975 FG", "Citroen C3", 175, new CarInsurance("Genertel Assicurazioni", "B1", 990),
                "Francia");
        Car car9 = new Car("FV 642 PJ", "Volkswagen T-Roc", 260, new CarInsurance("Conte.it Assicurazioni", "A2", 789),
                "Germania");
        Car car10 = new Car("ES 494 MD", "BMW X1", 280, new CarInsurance("Allianz Assicurazioni", "A5", 1560),
                "Germania");
        return Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);
    }

}

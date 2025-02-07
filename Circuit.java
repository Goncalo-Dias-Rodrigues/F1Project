public class Circuit {
    public String name;
    public TypeOfCircuit typeOfCircuit;
    public double distanceKilometers;
    public double distanceMiles;
    public int numberOfCorners;
    public int numberOfDRSZones;
    public Country country;

    public Circuit(String name, TypeOfCircuit typeOfCircuit, double distanceKilometers,
                   double distanceMiles, int numberOfCorners, int numberOfDRSZones, Country country) {
        this.name = name;
        this.typeOfCircuit = typeOfCircuit;
        this.distanceKilometers = distanceKilometers;
        this.distanceMiles = calculateToMiles();
        this.numberOfCorners = numberOfCorners;
        this.numberOfDRSZones = numberOfDRSZones;
        this.country = country;
    }

    public double getDistanceKilometers() {
        return distanceKilometers;
    }

    public void setDistanceKilometers(double distanceKilometers) {
        this.distanceKilometers = distanceKilometers;
        this.distanceMiles = calculateToMiles();
    }

    public int getNumberOfCorners() {
        return numberOfCorners;
    }

    public void setNumberOfCorners(int numberOfCorners) {
        this.numberOfCorners = numberOfCorners;
    }

    public int getNumberOfDRSZones() {
        return numberOfDRSZones;
    }

    public void setNumberOfDRSZones(int numberOfDRSZones) {
        this.numberOfDRSZones = numberOfDRSZones;
    }

    public String getName() {
        return name;
    }

    public TypeOfCircuit getTypeOfCircuit() {
        return typeOfCircuit;
    }

    public double getDistanceMiles() {
        return distanceMiles;
    }

    public Country getCountry() {
        return country;
    }

    private double calculateToMiles(){
        return (this.distanceKilometers * 0.621371);
    }
}

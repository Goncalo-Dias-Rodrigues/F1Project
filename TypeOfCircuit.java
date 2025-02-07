public enum TypeOfCircuit {
    STREET("Street Track"),
    RACETRACK("Race Track");

    private final String typeOfCircuit;

    TypeOfCircuit(String typeOfCircuit) {
        this.typeOfCircuit = typeOfCircuit;
    }

    public String gettypeOfCircuit() {
        return typeOfCircuit;
    }
}

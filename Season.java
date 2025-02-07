public enum Season {
    YEAR_2024(2024),
    YEAR_2025(2025),
    YEAR_2026(2026),
    YEAR_2027(2027);

    private final int year;

    Season(int year) {
        this.year = year;
    }

    public String getYearAsString() {
        return String.valueOf(year);
    }
}
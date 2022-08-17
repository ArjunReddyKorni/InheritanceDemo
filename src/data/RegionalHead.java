package data;

public class RegionalHead extends  Employee {
    private String regionalName;
    private  int regionalPerformance;
    private  int reviewRatings;

    public RegionalHead(String name, String dob, int age, double salary, Address address, String regionalName, int regionalPerformance, int reviewRatings) {
        super(name, dob, age, salary, address);
        this.regionalName = regionalName;
        this.regionalPerformance = regionalPerformance;
        this.reviewRatings = reviewRatings;
    }

    public double calculateIncrement() {
        double response = 0;
        if(regionalPerformance > 8 && reviewRatings > 7) {
            response = (getSalary()*10.5)/100;
        }

        return response;
    }



    public String getRegionalName() {
        return regionalName;
    }

    public void setRegionalName(String regionalName) {
        this.regionalName = regionalName;
    }

    public int getRegionalPerformance() {
        return regionalPerformance;
    }

    public void setRegionalPerformance(int regionalPerformance) {
        this.regionalPerformance = regionalPerformance;
    }

    public int getReviewRatings() {
        return reviewRatings;
    }

    public void setReviewRatings(int reviewRatings) {
        this.reviewRatings = reviewRatings;
    }
}

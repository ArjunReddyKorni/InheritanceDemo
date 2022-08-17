package data;

public class Manager extends Employee {
    private  int teamSize;
    private int teamRatings;

    public Manager(String name, String dob, int age, double salary, Address address, int teamSize, int teamRatings) {
        super(name, dob, age, salary, address);
        this.teamSize = teamSize;
        this.teamRatings = teamRatings;
    }

    public double calculateIncrement() {
        double response = 0;
        if(teamRatings > 8 )
            response = (getSalary()*12.5)/100;


        return response;
    }


    public void show() {
        display();
        System.out.println("teamSize = " + teamSize);
        System.out.println("teamRatings = " + teamRatings);
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamRatings() {
        return teamRatings;
    }

    public void setTeamRatings(int teamRatings) {
        this.teamRatings = teamRatings;
    }
}

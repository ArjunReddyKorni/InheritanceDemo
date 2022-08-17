package data;

public class Manager extends Employee {
    private  int teamSize;
    private int teamRatings;

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

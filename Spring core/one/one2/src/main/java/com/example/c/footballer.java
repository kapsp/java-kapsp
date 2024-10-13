package com.example.c;

public class footballer {
    private String player;
    private int goals;
    private int assists;

    public footballer(){}
    public footballer(String player, int goals, int assists) {
        super();
        this.player = player;
        this.goals = goals;
        this.assists = assists;
    }
    public void setPlayer(String player) {
        this.player = player;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }



    public void setAssists(int assists) {
        this.assists = assists;
    }

    public String getPlayer() {
        return player;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public String toString(){
        return player+" has scored "+goals+" goals and "+assists+" assits";
    }
}

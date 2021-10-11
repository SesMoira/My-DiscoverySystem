package za.ac.nwu.domain.persistence;

import javax.persistence.Id;
@Entity
public class Miles {


    @Id
    private int idMiles;
    private String date;
    private int idMember;
    private int reward;

    public int getIdMiles() {
        return idMiles;
    }

    public void setIdMiles(int idMiles) {
        this.idMiles = idMiles;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}

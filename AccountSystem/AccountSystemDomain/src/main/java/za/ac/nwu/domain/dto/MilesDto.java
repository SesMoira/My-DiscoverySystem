package za.ac.nwu.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import za.ac.nwu.domain.persistence.Miles;

import java.util.Optional;

public class MilesDto {

        private int idMiles;
        private String date;
        private int idMember;
        private int reward;


    public MilesDto(int idMiles, String date, int idMember) {
        this.idMiles = idMiles;
        this.date = date;
        this.idMember = idMember;
        this.reward = reward;
    }

    public MilesDto(Optional<Miles> miles) {

    }

    public MilesDto(int idMiles, String date, int idMember, int reward) {
    }

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


    @JsonIgnore
    public MilesDto getMiles(){
        return new MilesDto(getIdMiles(),getDate(),getIdMember(),getReward());
    }
 }

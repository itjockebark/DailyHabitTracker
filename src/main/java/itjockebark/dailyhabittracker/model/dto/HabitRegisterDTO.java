package itjockebark.dailyhabittracker.model.dto;

import itjockebark.dailyhabittracker.utils.ColumnDescription;

public class HabitRegisterDTO {

    @ColumnDescription(value = "Name of the habit", example = "Gym")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

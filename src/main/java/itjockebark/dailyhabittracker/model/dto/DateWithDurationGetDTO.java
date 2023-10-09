package itjockebark.dailyhabittracker.model.dto;

import itjockebark.dailyhabittracker.utils.ColumnDescription;

public class DateWithDurationGetDTO {

    @ColumnDescription(value = "The hours spent on a habit", example = "2")
    private Long hours;

    @ColumnDescription(value = "The minutes spent on a habit", example = "15")
    private Long minutes;

    @ColumnDescription(value = "The date of completing a habit", example = "2023-01-30")
    private String date;

    public DateWithDurationGetDTO() {
    }

    public DateWithDurationGetDTO(Long hours, Long minutes, String date) {
        this.hours = hours;
        this.minutes = minutes;
        this.date = date;
    }

    public long getHours() {
        return hours;
    }

    public void setHours(Long hours) {
        this.hours = hours;
    }

    public Long getMinutes() {
        return minutes;
    }

    public void setMinutes(Long minutes) {
        this.minutes = minutes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

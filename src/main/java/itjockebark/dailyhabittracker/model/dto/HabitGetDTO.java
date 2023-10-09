package itjockebark.dailyhabittracker.model.dto;

import itjockebark.dailyhabittracker.model.entity.DateWithDuration;
import itjockebark.dailyhabittracker.utils.ColumnDescription;

import java.util.Set;

public class HabitGetDTO {

    @ColumnDescription(value = "Name of the habit", example = "Gym")
    private String name;

    @ColumnDescription(value = "The streak of the habit", example = "13")
    private Long streak;

    @ColumnDescription(value = "Total completions of a habit", example = "28")
    private Long totalCompletionCount = 0L;

    @ColumnDescription(value = "Total completions of a habit this month", example = "15")
    private Long completionCountThisMonth = 0L;

    @ColumnDescription(value = "The dates and durations associated with the habit")
    private Set<DateWithDurationGetDTO> DateWithDurationGetDTO;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStreak() {
        return streak;
    }

    public void setStreak(Long streak) {
        this.streak = streak;
    }

    public Long getTotalCompletionCount() {
        return totalCompletionCount;
    }

    public void setTotalCompletionCount(Long totalCompletionCount) {
        this.totalCompletionCount = totalCompletionCount;
    }

    public Long getCompletionCountThisMonth() {
        return completionCountThisMonth;
    }

    public void setCompletionCountThisMonth(Long completionCountThisMonth) {
        this.completionCountThisMonth = completionCountThisMonth;
    }

    public Set<itjockebark.dailyhabittracker.model.dto.DateWithDurationGetDTO> getDateWithDurationGetDTO() {
        return DateWithDurationGetDTO;
    }

    public void setDateWithDurationGetDTO(Set<itjockebark.dailyhabittracker.model.dto.DateWithDurationGetDTO> dateWithDurationGetDTO) {
        DateWithDurationGetDTO = dateWithDurationGetDTO;
    }
}

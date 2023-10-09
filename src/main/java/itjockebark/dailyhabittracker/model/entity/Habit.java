package itjockebark.dailyhabittracker.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Habit {
    @Id
    private String name;
    @Column(name = "streak")
    private Long streak = 0L;
    @Column(name = "total_completion_count")
    private Long totalCompletionCount = 0L;
    @Column(name = "completion_count_this_month")
    private Long completionCountThisMonth = 0L;
    @OneToMany(mappedBy = "habit", fetch = FetchType.EAGER)
    private Set<DateWithDuration> dateWithDurations;


    public Habit() {
    }

    public Habit(String name) {
        this.name = name;
    }


    public Long getStreak() {
        return streak;
    }

    public void setStreak(Long streak) {
        this.streak = streak;
    }

    public Set<DateWithDuration> getDateWithDurations() {
        return dateWithDurations;
    }

    public void setDateWithDurations(Set<DateWithDuration> dateWithDurations) {
        this.dateWithDurations = dateWithDurations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
}

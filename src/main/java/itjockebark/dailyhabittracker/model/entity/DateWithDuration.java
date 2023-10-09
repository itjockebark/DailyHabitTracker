package itjockebark.dailyhabittracker.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class DateWithDuration {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "hours")
    private long hours = 0L;
    @Column(name = "minutes")
    private long minutes = 0L;
    @Column(name = "date")
    private LocalDateTime date;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "habit_id")
    private Habit habit;

    public String getDate() {
        try {
            return date.toString();
        } catch (NullPointerException exception) {
            return null;
        }
    }

    public void setDate(String date) {
        try {
            this.date = LocalDateTime.parse(date);
        } catch(NullPointerException exception) {
            this.date = null;
        }
    }

    public long getHours() {
        return hours;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Habit getHabit() {
        return habit;
    }

    public void setHabit(Habit habit) {
    }
}

package itjockebark.dailyhabittracker.dao;

import itjockebark.dailyhabittracker.model.entity.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitDAO extends JpaRepository<Habit, String> {
}

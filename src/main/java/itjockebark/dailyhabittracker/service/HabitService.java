package itjockebark.dailyhabittracker.service;

import itjockebark.dailyhabittracker.dao.HabitDAO;
import itjockebark.dailyhabittracker.model.dto.DateWithDurationGetDTO;
import itjockebark.dailyhabittracker.model.dto.HabitGetDTO;
import itjockebark.dailyhabittracker.model.dto.HabitRegisterDTO;
import itjockebark.dailyhabittracker.model.entity.Habit;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class HabitService {

    public final String habitNotFoundPrefix = "Habit with name [\"%s\"] was not found";

    private final HabitDAO habitDAO;

    private final ValidationService validationService;

    public HabitService(HabitDAO habitDAO, ValidationService validationService) {
        this.habitDAO = habitDAO;
        this.validationService = validationService;
    }

    public void registerHabit(HabitRegisterDTO dto) {
        validationService.validateHabitName(dto.getName());

        Habit habit = new Habit(dto.getName());

        habitDAO.save(habit);
    }

    public HabitGetDTO getHabitById(String id) {
        return habitDAO.findById(id).map(HabitService::getHabitByEntity).orElseThrow(() ->
                new IllegalArgumentException(String.format(habitNotFoundPrefix, id)));
    }

    public static HabitGetDTO getHabitByEntity(Habit habit) {
        HabitGetDTO dto = new HabitGetDTO();

        dto.setName(habit.getName());
        dto.setStreak(habit.getStreak());
        dto.setCompletionCountThisMonth(habit.getCompletionCountThisMonth());
        dto.setTotalCompletionCount(habit.getTotalCompletionCount());
        dto.setDateWithDurationGetDTO(habit.getDateWithDurations()
                .stream()
                .map(dateWithDuration -> new DateWithDurationGetDTO(dateWithDuration.getHours(), dateWithDuration.getMinutes(), dateWithDuration.getDate()))
                .collect(Collectors.toSet()));
        return dto;
    }


}

package itjockebark.dailyhabittracker.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    public void validateHabitName(String name) {
        if (name == null || name.length() < 1 || name.length() > 32)
            throw new IllegalArgumentException("Habit name can not be null, less than 1 character or more than 32 characters long");
    }

}

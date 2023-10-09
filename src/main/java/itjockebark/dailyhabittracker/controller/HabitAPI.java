package itjockebark.dailyhabittracker.controller;

import itjockebark.dailyhabittracker.model.dto.HabitGetDTO;
import itjockebark.dailyhabittracker.model.dto.HabitRegisterDTO;
import itjockebark.dailyhabittracker.service.HabitService;
import itjockebark.dailyhabittracker.utils.ApiDescription;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/habit-api")
public class HabitAPI {

    private final HabitService habitService;

    public HabitAPI(HabitService habitService) {
        this.habitService = habitService;
    }

    @PostMapping("/register")
    @ApiDescription("Register a habit")
    ResponseEntity<String> registerUser(@RequestBody HabitRegisterDTO dto) {
        try {
            habitService.registerHabit(dto);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    @ApiDescription("Get habit by id")
    ResponseEntity<HabitGetDTO> getAttendanceById(@PathVariable String id) {
        return ResponseEntity.ok(habitService.getHabitById(id));
    }

}

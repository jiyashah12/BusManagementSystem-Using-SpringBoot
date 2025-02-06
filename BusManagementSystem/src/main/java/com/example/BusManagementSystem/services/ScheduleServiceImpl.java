package com.example.BusManagementSystem.services;

import com.example.BusManagementSystem.entities.Schedule;
import com.example.BusManagementSystem.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public void addSchedule(Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    @Override
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule getScheduleById(long schedule_id) {
        Optional<Schedule> scheduleOptional = scheduleRepository.findById(schedule_id);
        return scheduleOptional.get();
    }

    @Override
    public Schedule updateSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public void deleteScheduleById(long schedule_id) {
        scheduleRepository.deleteById(schedule_id);
    }
}


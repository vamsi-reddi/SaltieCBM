package com.saltie.CBM.service;

import com.saltie.CBM.model.CreateScheduleLines;
import com.saltie.CBM.model.Cruise;
import com.saltie.CBM.model.ScheduleLines;
import com.saltie.CBM.model.SearchScheduleLines;
import com.saltie.CBM.repository.ScheduleLinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleLinesServiceImpl implements ScheduleLinesService{

    @Autowired
    ScheduleLinesRepository scheduleLinesRepository;

    @Autowired
    CruiseService cruiseService;
    @Override
    public ScheduleLines viewScheduleLine(Long id) {

        return scheduleLinesRepository.findById(id).get();
    }

    @Override
    public List<ScheduleLines> viewAllScheduleLines() {

        return scheduleLinesRepository.findAll();
    }

    @Override
    public ScheduleLines createScheduleLines(CreateScheduleLines createScheduleLines) {
        ScheduleLines temp = new ScheduleLines();
        Cruise cruise = cruiseService.viewCruise(createScheduleLines.getCruiseId());
        temp.setCruise(cruise);
        temp.setDate(createScheduleLines.getDate());
        temp.setEndName(createScheduleLines.getEndName());
        temp.setStartName(createScheduleLines.getStartName());
        temp.setEndTime(createScheduleLines.getEndTime());
        temp.setStartTime(createScheduleLines.getStartTime());
        return scheduleLinesRepository.save(temp);
    }

    @Override
    public ScheduleLines updateScheduleLines(ScheduleLines scheduleLines) {
        ScheduleLines temp = scheduleLinesRepository.findById(scheduleLines.getId()).get();
        temp.setCruise(scheduleLines.getCruise());
        temp.setDate(scheduleLines.getDate());
        temp.setEndName(scheduleLines.getEndName());
        temp.setStartName(scheduleLines.getStartName());
        temp.setEndTime(scheduleLines.getEndTime());
        temp.setStartTime(scheduleLines.getStartTime());
        return scheduleLinesRepository.save(temp);
    }

    @Override
    public String deleteScheduleLines(Long id) {
        if (scheduleLinesRepository.findById(id).isPresent()){
            scheduleLinesRepository.deleteById(id);
            return "delete Successfully";
        };
        return "scheduleLine doesn't exist";
    }

    @Override
    public List<ScheduleLines> viewScheduleByCruise(Long cruiseId) {

        return scheduleLinesRepository.findAllByCruiseCruiseId(cruiseId);
    }

    @Override
    public List<ScheduleLines> viewScheduleByFilter(SearchScheduleLines searchScheduleLines) {


        return scheduleLinesRepository.findAllByStartNameAndEndNameAndDate(searchScheduleLines.getStartPort(), searchScheduleLines.getEndPort(), searchScheduleLines.getDate());
    }
}

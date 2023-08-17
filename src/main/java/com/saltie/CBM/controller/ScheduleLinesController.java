package com.saltie.CBM.controller;

import com.saltie.CBM.model.CreateScheduleLines;
import com.saltie.CBM.model.ScheduleLines;
import com.saltie.CBM.model.SearchScheduleLines;
import com.saltie.CBM.service.ScheduleLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scheduleLines")
public class ScheduleLinesController {

    @Autowired
    ScheduleLinesService scheduleLinesService;

    @GetMapping("/viewById/{id}")
    public ScheduleLines viewScheduleLine(@PathVariable("id") Long id) {
        return scheduleLinesService.viewScheduleLine(id);
    }

    @GetMapping("/view")
    public List<ScheduleLines> viewAllScheduleLines() {
        return scheduleLinesService.viewAllScheduleLines();
    }

    @PostMapping("/create")
    public ScheduleLines addScheduleLine(@RequestBody CreateScheduleLines createScheduleLines) {
        return scheduleLinesService.createScheduleLines(createScheduleLines);
    }

    @PutMapping("/update")
    public ScheduleLines updateScheduleLines(@RequestBody ScheduleLines scheduleLines) {
        return scheduleLinesService.updateScheduleLines(scheduleLines);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteScheduleLines(@PathVariable("id") Long id) {
        return scheduleLinesService.deleteScheduleLines(id);
    }

    @GetMapping("/search")
    public List<ScheduleLines> searchScheduleLines(@RequestBody SearchScheduleLines searchScheduleLines) {
        return scheduleLinesService.viewScheduleByFilter(searchScheduleLines);
    }

    @GetMapping("/searchById/{id}")
    public List<ScheduleLines> searchScheduleLinesByCruise(@PathVariable("id") Long cruiseId) {
        return scheduleLinesService.viewScheduleByCruise(cruiseId);
    }

}

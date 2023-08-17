package com.saltie.CBM.service;

import com.saltie.CBM.model.CreateScheduleLines;
import com.saltie.CBM.model.ScheduleLines;
import com.saltie.CBM.model.SearchScheduleLines;

import java.util.List;
import java.util.Optional;

public interface ScheduleLinesService {
    ScheduleLines viewScheduleLine(Long id);

    List<ScheduleLines> viewAllScheduleLines();

    ScheduleLines createScheduleLines(CreateScheduleLines createScheduleLines);

    ScheduleLines updateScheduleLines(ScheduleLines scheduleLines);

    String deleteScheduleLines(Long id);

    List<ScheduleLines> viewScheduleByCruise(Long cruiseId);

    List<ScheduleLines> viewScheduleByFilter(   SearchScheduleLines searchScheduleLines);
}

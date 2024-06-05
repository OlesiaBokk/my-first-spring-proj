package ru.itgirl.my_first_spring_proj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enummapping")
public class FirstController {
    @GetMapping("/get")
    public String today(@RequestParam(value = "day", defaultValue = "MONDAY") WeekDay day, String dayName){
        switch (day){
            case MONDAY -> dayName = "Понедельник";
            case TUESDAY -> dayName = "Вторник";
            case WEDNESDAY -> dayName = "Среда";
            case THURSDAY -> dayName = "Четверг";
            case FRIDAY -> dayName = "Пятница";
            case SATURDAY -> dayName = "Суббота";
            case SUNDAY -> dayName = "Воскресенье";
        }
        return String.format("Сегодня %s!", dayName);
    }

}

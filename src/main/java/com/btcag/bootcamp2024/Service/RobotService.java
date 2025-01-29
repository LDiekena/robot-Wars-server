package com.btcag.bootcamp2024.Service;

import com.btcag.bootcamp2024.Model.Robot;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController

@RequestMapping("/robot")
public class RobotService {

    //Konstruktor für Beispiel Robotererstellung
    public RobotService() {
        robots[0] = new Robot("1", "testRobot", 5, 5, 5, 5);
        robots[1] = new Robot("2", "testRobot2", 8, 3, 1, 2);
        robots[2] = new Robot("3", "testRobot3", 1, 5, 3, 4);
    }

    Robot[] robots = new Robot[10];

    @GetMapping("/getFirstRobotInList")
    public Robot getFirstRobotInList() {
        return robots[0];
    }

    @GetMapping("/getRobotList")
    public Robot[] getRobots() {
        return robots;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void createRobot(@RequestBody Robot robot){
        this.robots[4] = robot;
    }

    @GetMapping
    public String hello() {
        return "Hello";
    }
}

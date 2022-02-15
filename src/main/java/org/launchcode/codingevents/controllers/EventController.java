package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model){
        List<String> events = new ArrayList<>();
//        events.add("Moe");
//        events.add("joe");
//        events.add("koe");
        model.addAttribute("events", events);
        model.addAttribute("events",events);
        return "events/index";
//        HashMap<String,String> events =  new HashMap<>();
//        events.put("Pi Pizza eating contest", "winner wins lifetime supply of ranch");
//        events.put("implement instrument", "can you use a piano? lets find out..");
//        events.put("String", "coding");
//        model.addAttribute("events", events);
//        return "events/index";

    }

    // lives at /events/create events come from the request mapping annotation
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

    //lives at /events/create
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName){
        events.add(eventName);
        return "redirect:";
    }
}

package com.example.crush_api.demo.crush.api.controller;

import com.example.crush_api.demo.crush.api.mood.LoveResponse;
import com.example.crush_api.demo.crush.api.mood.MoodRequest;
import com.example.crush_api.demo.crush.api.response.MessageResponse;
import com.example.crush_api.demo.crush.api.service.CrushService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CrushController {

    //deployed on--> render.com
    // https://crush-api-01ol.onrender.com
    private final CrushService crushService;

    public CrushController(CrushService crushService) {
        this.crushService = crushService;
    }

    @GetMapping("/compliment")
    public MessageResponse compliment() {
        return new MessageResponse(crushService.getCompliment());
    }

    @GetMapping("/flirt")
    public MessageResponse flirt() {
        return new MessageResponse(crushService.getFlirt());
    }

    @GetMapping("/miss-me")
    public MessageResponse missMe() {
        return new MessageResponse(crushService.missMe());
    }

    @GetMapping("/good-morning")
    public MessageResponse goodMorning() {
        return new MessageResponse("Good morning! Hope your day is as amazing as your cute smile.");
    }

    @GetMapping("/secret")
    public MessageResponse secret() {
        return new MessageResponse("If you found this endpoint, you should go on a coffee date with the developer ☕");
    }

    // Ultimate Cute Feature
    @GetMapping("/message")
    public MessageResponse message(@RequestParam String name){
        return new MessageResponse(crushService.personalizedMessage(name));
    }

    // Mood Based Romantic Reply
    @PostMapping("/mood")
    public MessageResponse mood(@RequestBody MoodRequest request){
        return new MessageResponse(crushService.moodReply(request.getMood()));
    }

    @GetMapping("/developer")
    public MessageResponse developer(){
        return new MessageResponse("This API was developed by Vivek, who clearly has good taste.");
    }

    @GetMapping("/combo")
    public MessageResponse combo(){
        return new MessageResponse(crushService.comboLine());
    }

    @GetMapping("/why-i-like-you")
    public MessageResponse whyILikeYou() {
        return new MessageResponse(crushService.whyILikeYou());
    }

    @GetMapping("/love-percentage")
    public LoveResponse lovePercentage(
            @RequestParam String name1,
            @RequestParam String name2) {

        return crushService.calculateLove(name1, name2);
    }
}
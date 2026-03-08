package com.example.crush_api.demo.crush.api.service;

import com.example.crush_api.demo.crush.api.mood.LoveResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class CrushService {

    private Random random = new Random();

    public String personalizedMessage(String name){
        return "Hi " + name + ", this API exists because someone thinks you're cute.";
    }

    public String comboLine() {
        return compliments.get(random.nextInt(compliments.size()))
                + " Also... " +
                flirts.get(random.nextInt(flirts.size()));
    }

    public String moodReply(String mood){
        Map<String,String> replies = new HashMap<>();

        replies.put("sad","If you're sad, remember someone out there thinks you're amazing.");
        replies.put("tired","Take some rest. The world works better when you're smiling.");
        replies.put("happy","Your happiness is contagious. Stay that way.");
        replies.put("bored","If you're bored, maybe you should text the developer of this API 😄");
        replies.put("angry","Take a deep breath. You look cuter when you're calm.");

        return replies.getOrDefault(mood.toLowerCase(),
                "Whatever you're feeling, just know someone cares about your day.");
    }

    List<String> compliments = List.of(
            "You just improved my day by existing.",
            "Your smile probably fixes bugs in the universe.",
            "You're the best notification I could ever receive.",
            "If happiness had a face, it would probably look like you.",
            "You have the kind of smile that could crash productivity servers.",
            "You're the reason the word 'beautiful' exists.",
            "You somehow make ordinary days feel special.",
            "You have main-character energy.",
            "If kindness had a leaderboard, you'd be #1.",
            "You’re the human version of a perfect commit — no bugs.",
            "Your vibe is better than any weekend plan.",
            "The world definitely got an upgrade when you showed up.",
            "You’re the type of person people write songs about.",
            "Even coffee gets jealous of how you wake up the room.",
            "You're proof that the universe has good design."
    );

    List<String> reasons = List.of(
            "Because talking to you is the best part of my day.",
            "Because you make ordinary moments feel special.",
            "Because your smile could fix a bad day instantly.",
            "Because you're effortlessly amazing.",
            "Because you have the kindest heart.",
            "Because life feels lighter when you're around.",
            "Because you make conversations interesting.",
            "Because you're the kind of person people feel lucky to know.",
            "Because you make me laugh even on stressful days.",
            "Because you're uniquely you, and that's pretty awesome."
    );

    List<String> flirts = List.of(
            "Are you a REST API? Because I keep calling you again and again.",
            "You must be my favorite dependency.",
            "Are you a Git commit? Because I want to push you to my future.",
            "Are you WiFi? Because I'm feeling a strong connection.",
            "If beauty were code, you'd be a perfectly optimized algorithm.",
            "You must be Java, because you've got my heart running in loops.",
            "Are you a pull request? Because I want to approve you immediately.",
            "My heart pings you more than any server.",
            "Are you Stack Overflow? Because you have all the answers.",
            "Are you a database index? Because you make everything faster.",
            "Are you production code? Because I want to protect you forever.",
            "You must be a high priority task in my life backlog.",
            "If you were an API endpoint, you'd be the most requested one.",
            "You're the only bug I'd never want to fix.",
            "You must be a perfect algorithm, because my heart runs in O(1) when I see you."
    );

    List<String> messages = List.of(
            "Looks like the universe ships you two.",
            "This might just be a perfect match.",
            "Something interesting could happen here.",
            "You two definitely have a vibe.",
            "Maybe coffee together would increase this score.",
            "This looks promising.",
            "The algorithm approves this pairing."
    );

    public LoveResponse calculateLove(String name1, String name2){

        int percentage = random.nextInt(51) + 50;
        // gives result between 50–100

        if(name2.equalsIgnoreCase("Nandini")){
            percentage = 95 + random.nextInt(5);
        }

        String message = messages.get(random.nextInt(messages.size()));

        return new LoveResponse(name1, name2, percentage, message);
    }

    public String getCompliment() {
        return compliments.get(random.nextInt(compliments.size()));
    }

    public String whyILikeYou() {
        return reasons.get(random.nextInt(reasons.size()));
    }

    public String getFlirt() {
        return flirts.get(random.nextInt(flirts.size()));
    }

    public String missMe() {
        return "Yes. 101% confirmed.";
    }

}
package com.feritagar.unitsevenlab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {
    @RequestMapping("/teams")
    public List<SoccerTeam> getAllTeams(){
        List<SoccerTeam> teams = new ArrayList<>();
        teams.add(new SoccerTeam("Galatasaray","Istanbul",63));
        teams.add(new SoccerTeam("Istanbul Basaksehir","Istanbul",63));
        teams.add(new SoccerTeam("Besiktas","Istanbul",59));
        teams.add(new SoccerTeam("Trabzonspor","Trabzon",56));
        teams.add(new SoccerTeam("Evkur Yeni Malatyaspor","Malatya",44));

        return teams;
    }
}
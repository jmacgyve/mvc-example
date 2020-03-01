package ru.sbt.twitts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TwittsController {
    @GetMapping("/")
    public String welcome(){
        return "Twitts welcome Page";
    }

    @RequestMapping("/{id}")
    public Twitt getTwitt(@PathVariable("id") long id){
        return new Twitt(id, LocalDateTime.now(), "Eugene", "new twitt = " + id);
    }
}

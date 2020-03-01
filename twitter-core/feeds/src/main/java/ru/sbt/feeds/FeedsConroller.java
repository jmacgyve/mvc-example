package ru.sbt.feeds;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class FeedsConroller {

    private final RestTemplate template;

    @GetMapping("/")
    public String welcome(){
        return "Feeds Welcome Page";
    }

    @GetMapping("/feed")
    public List<Twitt> getFeed() {
        return Arrays.asList(
                twitt(1),
                twitt(20)
        );
    }

    private Twitt twitt(long id) {
        return template.getForObject("http://twitts/" + id, Twitt.class);
    }
}

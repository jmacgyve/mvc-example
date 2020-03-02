package ru.sbt.jdbch2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class jdbcController {

    private final JdbcTemplate jdbcTemplate;
    private final RestTemplate template;

    public jdbcController(JdbcTemplate jdbcTemplate, RestTemplate template) {
        this.jdbcTemplate = jdbcTemplate;
        this.template = template;
    }

    @GetMapping("/createtable")
    public void createTable(){
        jdbcTemplate.execute("CREATE TABLE TWITTS (" +
                "TWITT_ID LONG NOT NULL, " +
                "AUTHOR VARCHAR(50) NOT NULL, " +
                "CONTENT VARCHAR(50) NOT NULL);"
        );
    }

    @GetMapping("/put/{id}")
    public void putTwittInDB(@PathVariable("id") long id){
        Twitt responseTwitt  = template.getForObject("http://twitts/" + id, Twitt.class);
        jdbcTemplate.execute(
                "INSERT INTO TWITTS VALUES (" +
                        responseTwitt.getId() + ", " +
                       "'" + responseTwitt.getAuthor() + "', " +
                        "'" + responseTwitt.getContent() + "'" +
                        ");"
        );
    }
}

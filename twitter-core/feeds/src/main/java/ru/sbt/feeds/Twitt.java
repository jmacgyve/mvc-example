package ru.sbt.feeds;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Twitt {
    private long id;
    private LocalDateTime creationTime;
    private String author;
    private String content;
}

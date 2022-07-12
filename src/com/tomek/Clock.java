package com.tomek;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {

    public String name;
    public LocalDateTime time = LocalDateTime.now();

    public Clock(String name, LocalDateTime time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}

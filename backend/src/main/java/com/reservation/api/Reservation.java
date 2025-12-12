package com.reservation.api;

public class Reservation {
    private static int counter = 1;

    private int id;
    private String name;
    private String email;
    private String train_number;
    private String travel_date;
    private String class_type;
    private String from_place;
    private String to_place;

    public Reservation() {
        this.id = counter++;
    }

    // getters and setters

    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTrain_number() { return train_number; }
    public void setTrain_number(String train_number) { this.train_number = train_number; }

    public String getTravel_date() { return travel_date; }
    public void setTravel_date(String travel_date) { this.travel_date = travel_date; }

    public String getClass_type() { return class_type; }
    public void setClass_type(String class_type) { this.class_type = class_type; }

    public String getFrom_place() { return from_place; }
    public void setFrom_place(String from_place) { this.from_place = from_place; }

    public String getTo_place() { return to_place; }
    public void setTo_place(String to_place) { this.to_place = to_place; }
}

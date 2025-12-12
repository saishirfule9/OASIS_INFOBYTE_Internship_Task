package com.reservation.api;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173") 
public class ReservationController {

    private final List<Reservation> list = new ArrayList<>();

    @PostMapping("/reservations")
    public Reservation create(@RequestBody Reservation r) {
        Reservation res = new Reservation();
        res.setName(r.getName());
        res.setEmail(r.getEmail());
        res.setTrain_number(r.getTrain_number());
        res.setTravel_date(r.getTravel_date());
        res.setClass_type(r.getClass_type());
        res.setFrom_place(r.getFrom_place());
        res.setTo_place(r.getTo_place());
        list.add(res);
        return res;
    }

    @GetMapping("/reservations")
    public List<Reservation> all() {
        return list;
    }
}

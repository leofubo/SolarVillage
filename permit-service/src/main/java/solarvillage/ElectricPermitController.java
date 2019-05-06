package solarvillage;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class ElectricPermitController {

    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/permit/electric")
    public String submitPermitRequest() {
        String id = "e" + String.valueOf(counter.incrementAndGet());
        System.out.println("called permit-electric-submitPermitRequest " + id);
        return id;
    }

    @GetMapping("/permit/electric/{id}")
    public String getPermitRequestStatus(@PathVariable String id) {
        System.out.println("called permit-electric-getPermitRequestStatus " + id);
        return "APPROVED";
    }

    @DeleteMapping("/permit/electric/{id}")
    public String rescindPermit(@PathVariable String id) {
        System.out.println("called permit-electric-rescindPermit " + id);
        return "Electric permit application " + id + " rescinded.";
    }

}

package solarvillage;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class ElectricPermitController {

    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/permit/electric")
    public String submitPermitRequest() {
        return String.valueOf(counter.incrementAndGet());
    }

    @GetMapping("/permit/electric/{id}")
    public PermitStatus getPermitRequestStatus(@PathVariable String id) {
        return new PermitStatus(id, "APPROVED");
    }

    @DeleteMapping("/permit/electric/{id}")
    public String rescindPermit(@PathVariable String id) {
        return "Electric permit application " + id + " rescinded.";
    }

}

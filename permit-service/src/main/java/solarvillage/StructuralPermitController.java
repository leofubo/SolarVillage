package solarvillage;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class StructuralPermitController {

    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/permit/structural")
    public String submitPermitRequest() {
        return String.valueOf(counter.incrementAndGet());
    }

    @GetMapping("/permit/structural/{id}")
    public PermitStatus getPermitRequestStatus(@PathVariable String id) {
        return new PermitStatus(id, "APPROVED");
    }

    @DeleteMapping("/permit/structural/{id}")
    public String rescindPermit(@PathVariable String id) {
        return "Structural permit application " + id + " rescinded.";
    }

}

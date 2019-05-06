package solarvillage;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class StructuralPermitController {

    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/permit/structural")
    public String submitPermitRequest() {
        String id = "s" + String.valueOf(counter.incrementAndGet());
        System.out.println("called permit-structural-submitPermitRequest " + id);
        return id;
    }

    @GetMapping("/permit/structural/{id}")
    public String getPermitRequestStatus(@PathVariable String id) {
        System.out.println("called permit-structural-getPermitRequestStatus " + id);
        return "APPROVED";
    }

    @DeleteMapping("/permit/structural/{id}")
    public String rescindPermit(@PathVariable String id) {
        System.out.println("called permit-structural-rescindPermit " + id);
        return "Structural permit application " + id + " rescinded.";
    }

}

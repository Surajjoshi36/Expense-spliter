import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participants")
public class ParticipantController {

    @Autowired
    private ExpenseSplitter expenseSplitter;

    @PostMapping("/add")
    public String addParticipant(@RequestParam String name) {
        expenseSplitter.addParticipant(name);
        return "Participant added.";
    }

    @GetMapping("/all")
    public List<Participant> getAllParticipants() {
        return expenseSplitter.getParticipants();
    }
}

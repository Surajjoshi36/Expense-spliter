import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseSplitter expenseSplitter;

    @PostMapping("/add")
    public String addExpense(@RequestParam String description, @RequestParam double amount, @RequestParam String payerName) {
        expenseSplitter.addExpense(description, amount, payerName);
        return "Expense added and split among participants.";
    }

    @GetMapping("/balances")
    public List<Participant> getBalances() {
        return expenseSplitter.getParticipants();
    }
}
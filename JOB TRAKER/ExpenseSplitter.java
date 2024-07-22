import java.util.ArrayList;
import java.util.List;

public class ExpenseSplitter {
    private List<Participant> participants = new ArrayList<>();

    public void addParticipant(String name) {
        participants.add(new Participant(name, 0.0));
    }

    public void addExpense(String description, double amount, String payerName) {
        // Find the payer participant
        Participant payer = findParticipant(payerName);
        if (payer == null) {
            throw new RuntimeException("Payer not found: " + payerName);
        }

        // Calculate the split amount per participant
        double splitAmount = amount / participants.size();

        // Update the balances of all participants
        for (Participant participant : participants) {
            if (participant != payer) {
                participant.setBalance(participant.getBalance() + splitAmount);
            }
        }

        // Update the payer's balance
        payer.setBalance(payer.getBalance() - amount + splitAmount);
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    private Participant findParticipant(String name) {
        for (Participant participant : participants) {
            if (participant.getName().equals(name)) {
                return participant;
            }
        }
        return null;
    }
}
package buoi5a.interface1;

public class VNpay implements IBank{
    @Override
    public int credit(int amount) {
        return 0;
    }

    @Override
    public int debit(int amount) {
        return 0;
    }

    @Override
    public int transferTo(Account account, int amount) {
        return 0;
    }
}

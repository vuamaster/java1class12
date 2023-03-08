package buoi5a.interface1;

public class App {
    public static void main(String[] args) {
        IBank iBank = new Vietcombank();
        iBank.debit(1000);
    }
}

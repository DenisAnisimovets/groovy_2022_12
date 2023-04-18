final class StorageUtil {
    private StorageUtil() {

    }

    static int getBalance(Storage2 storage) {
        int balance = 0;
        storage.countBanknotes().forEach((nominal, quantity) -> balance = balance + nominal * quantity);
        return balance;
    }

    static void showBanknotsInStorage(Storage2 storage) {
        System.out.println(storage.countBanknotes());
    }
}

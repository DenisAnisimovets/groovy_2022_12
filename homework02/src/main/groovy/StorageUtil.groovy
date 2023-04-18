final class StorageUtil {
    private StorageUtil() {

    }

    static int getBalance(Storage storage) {
        int balance = 0;
        storage.countBanknotes().forEach((nominal, quantity) -> balance = balance + nominal * quantity);
        return balance;
    }

    static void showBanknotsInStorage(Storage storage) {
        System.out.println(storage.countBanknotes());
    }
}

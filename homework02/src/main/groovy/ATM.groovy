class ATM {
    private final Storage storage;

    ATM(Storage storage) {
        this.storage = storage;
    }

    void addMoney(Banknote banknote, int quantity) {
        storage.addMoney(banknote, quantity);
    }

    int getBalance() {
        return StorageUtil.getBalance(storage);
    }

    boolean take(int sum) {
        return storage.take(sum);
    }

    Storage getStorage() {
        return storage;
    }
}

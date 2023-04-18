class ATM {
    private final Storage2 storage;

    ATM(Storage2 storage) {
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

    Storage2 getStorage() {
        return storage;
    }
}

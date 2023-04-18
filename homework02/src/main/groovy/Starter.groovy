class Starter {
    static void main(String[] args) {
        ATM atm = new ATM(new Storage2());
        StorageUtil.showBanknotsInStorage(atm.getStorage());
        atm.addMoney(Banknote.Nom_10, 5);
        atm.addMoney(Banknote.Nom_100, 5);
        atm.addMoney(Banknote.Nom_50, 10);
        StorageUtil.showBanknotsInStorage(atm.getStorage());
        atm.take(20);
        StorageUtil.showBanknotsInStorage(atm.getStorage());
    }
}

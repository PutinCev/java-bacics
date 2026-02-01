package org.itmo.lab6;

class Client extends Man implements BankService {
    private String nameOfBank;

    public Client(String firstName, String surname, String nameOfBank) {
        super(firstName, surname);
        this.nameOfBank = nameOfBank;
    }

    @Override
    public void vivodInformatsii() {
        System.out.println("Клиент: " + surname + " " + firstName);
        System.out.println("Банк: " + nameOfBank);
        System.out.println();

    }
    @Override
    public void showBankInfo() {
        System.out.println("Информация о банке клиента:");
        System.out.println("Название: " + nameOfBank);

    }

    @Override
    public String getBankName() {
        return nameOfBank;
    }

    @Override
    public void setBankName(String bankName) {
        this.nameOfBank = bankName;
    }

}

package org.itmo.lab6;

class BankEmployee extends Man implements BankService {
    private String nameOfBank;
    private String jobTitle;

    public BankEmployee(String firstName, String surname, String nameOfBank, String jobTitle) {
        super(firstName, surname);
        this.nameOfBank = nameOfBank;
        this.jobTitle = jobTitle;
    }

    @Override
    public void vivodInformatsii() {
        System.out.println("Работник банка: " + surname + " " + firstName);
        System.out.println("Должность: " + jobTitle);
        System.out.println("Банк: " + nameOfBank);
        System.out.println();
    }

    @Override
    public void showBankInfo() {
        System.out.println("Информация о банке работника:");
        System.out.println("Название: " + nameOfBank);
        System.out.println("Должность: " + jobTitle);
    }

    @Override
    public String getBankName() {
        return nameOfBank;
    }

    @Override
    public void setBankName(String bankName) {
        this.nameOfBank = bankName;
        System.out.println("Банк работника изменен на: " + bankName);
    }
}

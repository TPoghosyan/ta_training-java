
package student_Tigran_Poghosyan.javaClasses.mainTask1;

public class Costumer {
    private  static int num =0;
    private  int idNumber = 0;
    private String name;
    private String surName;
    private String fatherLand;
    private String address;
    private  Long creditCartNumber;
    private  String bankAccountNumber;

    public Costumer(String name, String surName, String fatherLand, String address, Long creditCartNumber,String bankAccountNumber) {
        this.idNumber = num++;
        this.name = name;
        this.surName = surName;
        this.fatherLand = fatherLand;
        this.address = address;
        this.creditCartNumber = creditCartNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFatherLand() {
        return fatherLand;
    }

    public void setFatherLand(String fatherLand) {
        this.fatherLand = fatherLand;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCreditCartNumber() {
        return creditCartNumber;
    }

    public void setCreditCartNumber(Long creditCartNumber) {
        this.creditCartNumber = creditCartNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }


    @Override
    public String toString() {
        return "Costumer{" +
                "idNumber=" + idNumber +
                ", name='" + name + "" +
                ", surName='" + surName + "" +
                ", fatherLand='" + fatherLand + "" +
                ", address='" + address + "" +
                ", creditCartNumber='" + creditCartNumber + "" +
                ", bankAccountNumber='" + bankAccountNumber + "" +
                '}';
    }

    Costumer[] createCostomersList(Costumer... costomers) {
        return costomers;
    }
}

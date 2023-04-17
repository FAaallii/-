package Contact;

public class Contacts {
    String photo;
    String name;
    String phone_num1;
    String phone_num2;
    String phone_num3;
    String email1;
    String email2;
    String address;
    String brith;
    String workplace;
    String code;
    String notes;
    public Contacts(){}
    public Contacts(String photo,String name, String phone_num1, String phone_num2, String phone_num3, String email1, String email2, String address, String brith, String workplace, String code,String notes) {
        this.photo=photo;
        this.name = name;
        this.phone_num1 = phone_num1;
        this.phone_num2 = phone_num2;
        this.phone_num3 = phone_num3;
        this.email1 = email1;
        this.email2 = email2;
        this.address = address;
        this.brith = brith;
        this.workplace = workplace;
        this.code = code;
        this.notes=notes;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_num1() {
        return phone_num1;
    }

    public void setPhone_num1(String phone_num1) {
        this.phone_num1 = phone_num1;
    }

    public String getPhone_num2() {
        return phone_num2;
    }

    public void setPhone_num2(String phone_num2) {
        this.phone_num2 = phone_num2;
    }

    public String getPhone_num3() {
        return phone_num3;
    }

    public void setPhone_num3(String phone_num3) {
        this.phone_num3 = phone_num3;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return  photo+','+
                name + ',' +
                 phone_num1 + ',' +
                phone_num2 + ',' +
                 phone_num3 + ',' +
                 email1 + ',' +
                 email2 + ',' +
                address + ',' +
                brith + ',' +
                 workplace + ',' +
                 code + ','+
                notes;
    }
}

package com.Utils;

public class NewUser {

    public String genderMale, firstName, lastName, email, password, days, months, years, state, newsletter, optin,
        company, address1, address2, city, postcode, additionalInfo, phone, phoneMobile, submitAccount;

    public NewUser() {
        this.firstName = "tw";
        this.lastName = "thoughtworks";
//        this.email = "tw@thoughtworks.com";
        this.password = "password123";
//        this.days = "04";
//        this.months ="11";
//        this.years= "1991";
//        this.company = "TW";
        this.address1 = "Bangalore Koramangala";
        this.address2 = "Bangalore";
        this.city = "Bangalore";
        this.postcode = "90876";
        this.state = "5";
//        this.phone = "081789567328";
        this.phoneMobile = "1234567890";
//        this.additionalInfo = "hello hello";
    }

    public NewUser addAdditionalAddress(String tw) {
        this.address2 = tw;
        return this;
    }

    public NewUser addAdditionInfo(String s) {
        this.additionalInfo = s;
        return this;
    }
}

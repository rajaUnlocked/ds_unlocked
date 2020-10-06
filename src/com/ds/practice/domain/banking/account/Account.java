package com.ds.practice.domain.banking.account;

import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;

import java.util.Date;

public class Account {
    String customerId;

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    private Float balance;
    Date openingDate;
    Date closingDate;

    public Account(String customerId, Float balance, Date openingDate, Date closingDate) {
        this.customerId = customerId;
        this.balance = balance;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
    }

    public Boolean deposit(Float amount) {

        balance = balance + amount;
        return true;
    }

    public Boolean withDraw(Float amount) {
        balance = balance - amount;
        return true;
    }


    public static void main(String args[]) {


        Account rajaAccount = new Account("1", 100.0f,  new Date(), null);
        Float a =  rajaAccount.balance;

        System.out.println(rajaAccount.getBalance());

        rajaAccount.deposit(200f);

        System.out.println(rajaAccount.getBalance());

        rajaAccount.withDraw(50f);

        System.out.println(rajaAccount.getBalance());

        rajaAccount.setBalance(500000f);

        Address rajaAddress = new Address("india", "up","farrukhabad", 209, "rajiv gandhi nagar",11);

        Customer raja = new Customer("raja", "mishra", "11223344556677",
                rajaAddress, "22113", "raja@11","rajaMishra", "123");

        System.out.println(raja);

    }


}

class Customer{
    String firstName, lastName;
    String aadharNumber;
    Address address;
    String panNumber;


    public Customer(String firstName, String lastName, String aadharNumber, Address address, String panNumber, String mobileBankingId, String netBankingId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.aadharNumber = aadharNumber;
        this.address = address;
        this.panNumber = panNumber;
        this.mobileBankingId = mobileBankingId;
        this.netBankingId = netBankingId;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", address=" + address +
                ", panNumber='" + panNumber + '\'' +
                ", mobileBankingId='" + mobileBankingId + '\'' +
                ", netBankingId='" + netBankingId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    String mobileBankingId;
    String netBankingId;
    String password;

}

class Address{
    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    public Address(String country, String state, String city, int pinCode, String streetName, int houseNumber) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    String country;
    String state;
    String city;
    int pinCode;

    String streetName;
    int houseNumber;

}
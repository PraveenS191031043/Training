package com.kgisl.Project.Entity;



import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class BusBookingForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String contactNumber;
    private String gender;
    private int age;
    private String identityProof;
    private String idNumber;
    private String boardingPointLocation;
    private LocalDateTime startDateAndTime;
    private String droppingPoint;
    private String seatPreference;
    private String paymentMethod;

    
    public BusBookingForm(int id,String firstName, String lastName, String emailId, String contactNumber, String gender,
            int age, String identityProof, String idNumber, String boardingPointLocation,
            LocalDateTime startDateAndTime, String droppingPoint,
            String seatPreference, String paymentMethod) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.age = age;
        this.identityProof = identityProof;
        this.idNumber = idNumber;
        this.boardingPointLocation = boardingPointLocation;
        this.startDateAndTime = startDateAndTime;
        this.droppingPoint = droppingPoint;
 
        this.seatPreference = seatPreference;
        this.paymentMethod = paymentMethod;
    }
    
    public BusBookingForm() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentityProof() {
        return identityProof;
    }

    public void setIdentityProof(String identityProof) {
        this.identityProof = identityProof;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getBoardingPointLocation() {
        return boardingPointLocation;
    }

    public void setBoardingPointLocation(String boardingPointLocation) {
        this.boardingPointLocation = boardingPointLocation;
    }

    public LocalDateTime getStartDateAndTime() {
        return startDateAndTime;
    }

    public void setStartDateAndTime(LocalDateTime startDateAndTime) {
        this.startDateAndTime = startDateAndTime;
    }

    public String getDroppingPoint() {
        return droppingPoint;
    }

    public void setDroppingPoint(String droppingPoint) {
        this.droppingPoint = droppingPoint;
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "BusBookingForm [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
                + emailId + ", contactNumber=" + contactNumber + ", gender=" + gender + ", age=" + age
                + ", identityProof=" + identityProof + ", idNumber=" + idNumber + ", boardingPointLocation="
                + boardingPointLocation + ", startDateAndTime=" + startDateAndTime + ", droppingPoint=" + droppingPoint
                + ", seatPreference=" + seatPreference + ", paymentMethod="
                + paymentMethod + "]";
    }




   
}


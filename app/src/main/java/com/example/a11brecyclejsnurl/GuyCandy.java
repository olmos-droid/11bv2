package com.example.a11brecyclejsnurl;

import java.util.ArrayList;

public class GuyCandy {//    {

    String name, relationship, interestedIn, country, careerStatus, gender, placeOfBirth, zodiacSign, ethnicity, hairColor, eyeColor, prepucio, hobbies;
    int profileVisits, dot, height, weight;
    Boolean facialhair, tattoos, piercing;
    ArrayList<String> urls;

    public GuyCandy(String name, String relationship, String interestedIn, String country, String careerStatus, String gender, String placeOfBirth, String zodiacSign, String ethnicity, String hairColor, String eyeColor, String prepucio, String hobbies, int profileVisits, int dot, int height, int weight, Boolean facialhair, Boolean tattoos, Boolean piercing, ArrayList<String> urls) {
        this.name = name;
        this.relationship = relationship;
        this.interestedIn = interestedIn;
        this.country = country;
        this.careerStatus = careerStatus;
        this.gender = gender;
        this.placeOfBirth = placeOfBirth;
        this.zodiacSign = zodiacSign;
        this.ethnicity = ethnicity;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.prepucio = prepucio;
        this.hobbies = hobbies;
        this.profileVisits = profileVisits;
        this.dot = dot;
        this.height = height;
        this.weight = weight;
        this.facialhair = facialhair;
        this.tattoos = tattoos;
        this.piercing = piercing;
        this.urls = urls;
    }

    public GuyCandy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getInterestedIn() {
        return interestedIn;
    }

    public void setInterestedIn(String interestedIn) {
        this.interestedIn = interestedIn;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCareerStatus() {
        return careerStatus;
    }

    public void setCareerStatus(String careerStatus) {
        this.careerStatus = careerStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getPrepucio() {
        return prepucio;
    }

    public void setPrepucio(String prepucio) {
        this.prepucio = prepucio;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }


    public int getProfileVisits() {
        return profileVisits;
    }

    public void setProfileVisits(int profileVisits) {
        this.profileVisits = profileVisits;
    }

    public int getDot() {
        return dot;
    }

    public void setDot(int dot) {
        this.dot = dot;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Boolean getFacialhair() {
        return facialhair;
    }

    public void setFacialhair(Boolean facialhair) {
        this.facialhair = facialhair;
    }

    public Boolean getTattoos() {
        return tattoos;
    }

    public void setTattoos(Boolean tattoos) {
        this.tattoos = tattoos;
    }

    public Boolean getPiercing() {
        return piercing;
    }

    public void setPiercing(Boolean piercing) {
        this.piercing = piercing;
    }

    @Override
    public String toString() {
        return "\nGuyCandy{" +
                "name='" + name + '\'' +
                ", relationship='" + relationship + '\'' +
                ", interestedIn='" + interestedIn + '\'' +
                ", country='" + country + '\'' +
                ", careerStatus='" + careerStatus + '\'' +
                ", gender='" + gender + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", zodiacSign='" + zodiacSign + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", prepucio='" + prepucio + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", profileVisits=" + profileVisits +
                ", dot=" + dot +
                ", Height=" + height +
                ", Weight=" + weight +
                ", facialhair=" + facialhair +
                ", Tattoos=" + tattoos +
                ", piercing=" + piercing +
                '}';
    }
}

package com.codeherenow.gson.helloworld;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class SuperHero {

    private String name;
    private String nickname;
    private Gender gender;
    private String firstAppearance;
    private String knownFor;
    private double heightInCms;
    private double weightInKgs;

    public SuperHero(String name, Gender gender, String knownFor) {
        this.name = name;
        this.gender = gender;
        this.knownFor = knownFor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getKnownFor() {
        return knownFor;
    }

    public void setKnownFor(String knownFor) {
        this.knownFor = knownFor;
    }

    public double getHeightInCms() {
        return heightInCms;
    }

    public void setHeightInCms(double heightInCms) {
        this.heightInCms = heightInCms;
    }

    public double getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(double weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender=" + gender +
                ", firstAppearance='" + firstAppearance + '\'' +
                ", knownFor='" + knownFor + '\'' +
                '}';
    }
}

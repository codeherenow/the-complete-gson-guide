package com.codeherenow.gson.arrayslistsnulls;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class SuperHero {

    private String name;
    private String[] nicknames;
    private Gender gender;
    private String firstAppearance;
    private String knownFor;
    private double heightInCms;
    private double weightInKgs;
    private List associates;

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

    public String[] getNicknames() {
        return nicknames;
    }

    public void setNickname(String[] nicknames) {
        this.nicknames = nicknames;
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

    public void setNicknames(String[] nicknames) {
        this.nicknames = nicknames;
    }

    public List getAssociates() {
        return associates;
    }

    public void setAssociates(List associates) {
        this.associates = associates;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", nicknames=" + Arrays.toString(nicknames) +
                ", gender=" + gender +
                ", firstAppearance='" + firstAppearance + '\'' +
                ", knownFor='" + knownFor + '\'' +
                ", heightInCms=" + heightInCms +
                ", weightInKgs=" + weightInKgs +
                ", associates=" + associates +
                '}';
    }
}

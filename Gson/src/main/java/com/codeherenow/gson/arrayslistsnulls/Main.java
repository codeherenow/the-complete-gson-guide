package com.codeherenow.gson.arrayslistsnulls;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class Main {

    public static void main(String[] args) {
        SuperHero batman = new SuperHero("Batman", Gender.MALE, "Intimidation");
        batman.setNickname(new String[] {
                "The Dark Night", "The Caped Crusader",
                "The World's Greatest Detective", "Matches Malone"
        });
        batman.setFirstAppearance("May, 1939");
        batman.setHeightInCms(188);
        batman.setWeightInKgs(95);

        // Associates
        batman.setAssociates(getAssociates());

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();
        System.out.println(gson.toJson(batman));
    }

    private static List getAssociates() {
        List associates = new ArrayList();
        associates.add(new Associate("Alfred", "Pennyworth", "Butler"));

        SuperHero robin = new SuperHero("Robin", Gender.MALE, "Master Acrobat");
        robin.setFirstAppearance("May, 1939");
        robin.setHeightInCms(178);
        robin.setWeightInKgs(79);
        associates.add(robin);

        return associates;
    }
}

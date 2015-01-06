package com.codeherenow.gson.helloworld;

import com.codeherenow.gson.helloworld.Gender;
import com.codeherenow.gson.helloworld.SuperHero;
import com.google.gson.Gson;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class Main {

    public static void main(String[] args) {
        SuperHero batman = new SuperHero("Batman", Gender.MALE, "Intimidation");
        batman.setNickname("The Dark Night");
        batman.setFirstAppearance("May, 1939");
        batman.setHeightInCms(188);
        batman.setWeightInKgs(95);

        Gson gson = new Gson();
        System.out.println(gson.toJson(batman));
    }

}

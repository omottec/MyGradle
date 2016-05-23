package com.example;

public class JokeWizard {
    public String tellAWizardJoke(){
        JokeSmith myJokeSmith = new JokeSmith();
        return "A Wizard says " + myJokeSmith.tellAHandCraftedJoke();
    }
}

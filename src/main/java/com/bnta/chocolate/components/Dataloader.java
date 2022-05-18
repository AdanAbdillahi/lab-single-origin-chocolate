package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired //depdendency injection
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate estate1 = new Estate("Nestle","Switzerland");
        estateRepository.save(estate1);

        Chocolate chocolate1 = new Chocolate("Kitkat",50, estate1);
        chocolateRepository.save(chocolate1);

        Chocolate chocolate2 = new Chocolate("Milkybar", 40,estate1);
        chocolateRepository.save(chocolate2);

        Estate estate2 = new Estate("Hershey","USA");
        estateRepository.save(estate2);

        Chocolate chocolate3 = new Chocolate("Reese", 40, estate2);
        chocolateRepository.save(chocolate3);


    }



}

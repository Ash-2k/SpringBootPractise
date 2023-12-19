package org.example.springBoot.repository;

import org.example.springBoot.model.Speaker;
import java.util.List;
import java.util.ArrayList;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("firstName");
        speaker.setLastName("lastName");
        speakers.add(speaker);

        return speakers;
    }
}

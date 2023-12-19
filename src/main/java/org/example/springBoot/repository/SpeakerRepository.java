package org.example.springBoot.repository;

import org.example.springBoot.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}

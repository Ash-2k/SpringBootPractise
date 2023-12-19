package org.example.springBoot.service;

import org.example.springBoot.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}

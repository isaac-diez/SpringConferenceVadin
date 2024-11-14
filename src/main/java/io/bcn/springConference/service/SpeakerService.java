package io.bcn.springConference.service;

import io.bcn.springConference.model.Speaker;
import java.util.List;
import java.util.UUID;

public interface SpeakerService {
    List<Speaker> findAll();
    Speaker findById(UUID id);
    Speaker save(Speaker speaker);
    void deleteById(UUID id);
}

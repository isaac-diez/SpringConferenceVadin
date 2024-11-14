package io.bcn.springConference.service;

import io.bcn.springConference.model.Conference;
import java.util.List;
import java.util.UUID;

public interface ConferenceService {
    List<Conference> findAll();
    Conference findById(UUID id);
    Conference save(Conference conference);
    void deleteById(UUID id);
}

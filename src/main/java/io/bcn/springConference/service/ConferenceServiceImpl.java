package io.bcn.springConference.service;

import io.bcn.springConference.model.Conference;
import io.bcn.springConference.repository.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ConferenceServiceImpl implements ConferenceService {

    private final ConferenceRepository conferenceRepository;

    @Autowired
    public ConferenceServiceImpl(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    @Override
    public List<Conference> findAll() {
        return conferenceRepository.findAll();
    }

    @Override
    public Conference findById(UUID id) {
        return conferenceRepository.findById(id).orElse(null);
    }

    @Override
    public Conference save(Conference conference) {
        return conferenceRepository.save(conference);
    }

    @Override
    public void deleteById(UUID id) {
        conferenceRepository.deleteById(id);
    }
}

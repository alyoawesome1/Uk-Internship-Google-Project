package com.google;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class FlaggingStore {


    private final Map<String, String> flagReason = new HashMap<>();


    public Optional<String> getFlagReason(String videoId) {
        return Optional.ofNullable(flagReason.get(videoId));
    }


    public void flag(String videoId, String reason) {
        flagReason.put(videoId, reason);
    }

    public void removeFlag(String videoId) {
        flagReason.remove(videoId);
    }
}
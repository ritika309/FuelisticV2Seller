package com.example.fuelisticv2seller.Model;

import java.util.List;

public class FCMResponse {
    private long multiCast_id;
    private int success, failure , canonical_ids;
    private List<FCMResult> results;
    private long message_id;

    public FCMResponse() {
    }

    public long getMultiCast_id() {
        return multiCast_id;
    }

    public void setMultiCast_id(long multiCast_id) {
        this.multiCast_id = multiCast_id;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getFailure() {
        return failure;
    }

    public void setFailure(int failure) {
        this.failure = failure;
    }

    public int getCanonical_ids() {
        return canonical_ids;
    }

    public void setCanonical_ids(int canonical_ids) {
        this.canonical_ids = canonical_ids;
    }

    public List<FCMResult> getResults() {
        return results;
    }

    public void setResults(List<FCMResult> results) {
        this.results = results;
    }

    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }
}

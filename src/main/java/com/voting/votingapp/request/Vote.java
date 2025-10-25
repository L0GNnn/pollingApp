package com.voting.votingapp.request;

import lombok.Data;
import lombok.NoArgsConstructor;

public class Vote {

    @Data
    @NoArgsConstructor
    private Long pollId;
    private int optionIndex;
}

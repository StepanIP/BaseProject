package org.example.baseproject.entity.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActorRequestDtoClass {
    private int movieId;
    private List<String> actorNameList;
    private String token;
}

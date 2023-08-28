package io.happyharbor.cardmarket.api.dto.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Value
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Expansion {
    @JsonProperty("idExpansion")
    Integer expansionId;
    String enName;
    @JsonProperty(value = "localization")
    List<Localization> localizations;
    String abbreviation;
    Integer icon;
    LocalDateTime releaseDate;
    Boolean isReleased;
    @JsonProperty("idGame")
    Integer gameId;
}

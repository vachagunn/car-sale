package vachik.carsale.entity;

import lombok.Data;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@Data
@ToString
public class RandomRequest {
    @NotNull
    private Integer from;
    @NotNull
    private Integer to;

    private Integer len;
}

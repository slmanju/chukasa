package pro.hirooka.chukasa.domain.model.epg;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class LastEpgdumpExecuted {
    @Id
    private int unique;
    private long date;
}

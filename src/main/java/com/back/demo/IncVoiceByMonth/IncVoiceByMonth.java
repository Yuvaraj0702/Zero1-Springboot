package com.back.demo.IncVoiceByMonth;
import javax.persistence.*;

@Entity
@Table
public class IncVoiceByMonth {
    @Id
    @SequenceGenerator(
            name = "IncVoiceByMonth_sequence",
            sequenceName = "IncVoiceByMonth_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IncVoiceByMonth_sequence"
    )
    private Long ID;
    private int IncCallByMonth ;

    public IncVoiceByMonth() {
    }

    public IncVoiceByMonth(Long id, int IncCallByMonth) {
        ID = id;
        this.IncCallByMonth = IncCallByMonth;
    }
    public IncVoiceByMonth(int IncCallByMonth) {
        IncCallByMonth = IncCallByMonth;
    }

    public int getIncCallByMonth() {
        return IncCallByMonth;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIncCallByMonth(int IncCallByMonth) {
        IncCallByMonth = IncCallByMonth;
    }
}

package com.back.demo.OutVoiceByMonth;
import javax.persistence.*;

@Entity
@Table
public class OutVoiceByMonth {
    @Id
    @SequenceGenerator(
            name = "OutVoiceByMonth_sequence",
            sequenceName = "OutVoiceByMonth_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "OutVoiceByMonth_sequence"
    )
    private Long ID;
    private int OutCallByMonth ;

    public OutVoiceByMonth() {
    }

    public OutVoiceByMonth(Long id, int outCallByMonth) {
        ID = id;
        this.OutCallByMonth = outCallByMonth;
    }
    public OutVoiceByMonth( int outCallByMonth) {
        OutCallByMonth = outCallByMonth;
    }

    public int getOutCallByMonth() {
        return OutCallByMonth;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setOutCallByMonth(int outCallByMonth) {
        OutCallByMonth = outCallByMonth;
    }
}

package com.back.demo.OutVoiceByYear;
import javax.persistence.*;

@Entity
@Table
public class OutVoiceByYear {
    @Id
    @SequenceGenerator(
            name = "OutVoiceByYear_sequence",
            sequenceName = "OutVoiceByYear_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "OutVoiceByYear_sequence"
    )
    private Long ID;
    private int OutCallByYear ;

    public OutVoiceByYear() {
    }

    public OutVoiceByYear(Long id, int outCallByYear) {
        ID = id;
        this.OutCallByYear = outCallByYear;
    }
    public OutVoiceByYear( int outCallByYear) {
        OutCallByYear = outCallByYear;
    }

    public int getOutCallByYear() {
        return OutCallByYear;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setOutCallByYear(int outCallByYear) {
        OutCallByYear = outCallByYear;
    }
}

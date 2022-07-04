package com.back.demo.IncVoiceByYear;
import javax.persistence.*;

@Entity
@Table
public class IncVoiceByYear {
    @Id
    @SequenceGenerator(
            name = "IncVoiceByYear_sequence",
            sequenceName = "IncVoiceByYear_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IncVoiceByYear_sequence"
    )
    private Long ID;
    private int IncCallByYear ;

    public IncVoiceByYear() {
    }

    public IncVoiceByYear(Long id, int IncCallByYear) {
        ID = id;
        this.IncCallByYear = IncCallByYear;
    }
    public IncVoiceByYear(int IncCallByYear) {
        IncCallByYear = IncCallByYear;
    }

    public int getIncCallByYear() {
        return IncCallByYear;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setIncCallByYear(int IncCallByYear) {
        IncCallByYear = IncCallByYear;
    }
}

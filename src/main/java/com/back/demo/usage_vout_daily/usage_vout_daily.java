package com.back.demo.usage_vout_daily;

import javax.persistence.*;

@Entity
@Table
public class usage_vout_daily {
    @Id
//    @SequenceGenerator(
//            name = "usage_vout_daily_sequence",
//            sequenceName = "usage_vout_daily_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "usage_vout_daily_sequence"
//    )
    private Long time;
    private int value;

    public usage_vout_daily() {
    }

    public usage_vout_daily(Long time, int value) {
        time = time;
        this.value = value;
    }

    public usage_vout_daily(int value) {
        value = value;
    }

    public int getvalue() {
        return value;
    }

    public Long gettime() {
        return time;
    }

    public void settime(Long time) {
        this.time = time;
    }

    public void setvalue(int value) {
        value = value;
    }
}

package com.back.demo.usage_sout_hourly;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class usage_sout_hourly {
    @Id
    private Long time;
    private int value;

    public usage_sout_hourly() {
    }

    public usage_sout_hourly(Long time, int value) {
        time = time;
        this.value = value;
    }

    public usage_sout_hourly(int value) {
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

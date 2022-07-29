package com.back.demo.usage_vout_hourly;

import javax.persistence.*;

@Entity
@Table
public class usage_vout_hourly {
    @Id
    private Long time;
    private int value;

    public usage_vout_hourly() {
    }

    public usage_vout_hourly(Long time, int value) {
        time = time;
        this.value = value;
    }

    public usage_vout_hourly(int value) {
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

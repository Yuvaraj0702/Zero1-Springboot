package com.back.demo.usage_data_hourly;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class usage_data_hourly {
    @Id
    private Long time;
    private Long value;

    public usage_data_hourly() {
    }

    public usage_data_hourly(Long time, Long value) {
        time = time;
        value = value;
    }

    public usage_data_hourly(Long value) {
        value = value;
    }

    public Long getvalue() {
        return value;
    }

    public Long gettime() {
        return time;
    }

    public void settime(Long time) {
        this.time = time;
    }

    public void setvalue(Long value) {
        value = value;
    }
}

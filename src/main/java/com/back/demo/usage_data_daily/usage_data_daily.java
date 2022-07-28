package com.back.demo.usage_data_daily;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class usage_data_daily {
    @Id
    private Long time;
    private Long value ;

    public usage_data_daily() {
    }

    public usage_data_daily(Long time, Long value) {
        time = time;
        value = value;
    }
    public usage_data_daily(Long value) {
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

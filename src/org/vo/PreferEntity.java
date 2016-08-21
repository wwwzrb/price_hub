package org.vo;

import java.sql.Timestamp;

/**
 * Created by wz on 2016/8/21.
 */
public class PreferEntity {
    private int id;
    private Timestamp preferTime;
    private UserEntity user;
    private PreferenceEntity preference;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public PreferenceEntity getPreference() {
        return preference;
    }

    public void setPreference(PreferenceEntity preference) {
        this.preference = preference;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getPreferTime() {
        return preferTime;
    }

    public void setPreferTime(Timestamp preferTime) {
        this.preferTime = preferTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PreferEntity that = (PreferEntity) o;

        if (id != that.id) return false;
        if (preferTime != null ? !preferTime.equals(that.preferTime) : that.preferTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (preferTime != null ? preferTime.hashCode() : 0);
        return result;
    }
}

package org.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wz on 2016/8/21.
 */
public class PreferenceEntity {
    private int id;
    private int preferenceId;
    private String preferenceContent;
    private Timestamp preferenceTime;
    private Set<PreferEntity> preferEntities=new HashSet<>();

    public Set<PreferEntity> getPreferEntities() {
        return preferEntities;
    }

    public void setPreferEntities(Set<PreferEntity> preferEntities) {
        this.preferEntities = preferEntities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPreferenceId() {
        return preferenceId;
    }

    public void setPreferenceId(int preferenceId) {
        this.preferenceId = preferenceId;
    }

    public String getPreferenceContent() {
        return preferenceContent;
    }

    public void setPreferenceContent(String preferenceContent) {
        this.preferenceContent = preferenceContent;
    }

    public Timestamp getPreferenceTime() {
        return preferenceTime;
    }

    public void setPreferenceTime(Timestamp preferenceTime) {
        this.preferenceTime = preferenceTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PreferenceEntity that = (PreferenceEntity) o;

        if (id != that.id) return false;
        if (preferenceId != that.preferenceId) return false;
        if (preferenceContent != null ? !preferenceContent.equals(that.preferenceContent) : that.preferenceContent != null)
            return false;
        if (preferenceTime != null ? !preferenceTime.equals(that.preferenceTime) : that.preferenceTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + preferenceId;
        result = 31 * result + (preferenceContent != null ? preferenceContent.hashCode() : 0);
        result = 31 * result + (preferenceTime != null ? preferenceTime.hashCode() : 0);
        return result;
    }
}

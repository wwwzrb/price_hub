package org.vo;

import java.sql.Timestamp;

/**
 * Created by wz on 2016/8/21.
 */
public class ReplyEntity {
    private int replyId;
    private String reply;
    private Timestamp replyTime;
    private int view;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Timestamp getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Timestamp replyTime) {
        this.replyTime = replyTime;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReplyEntity that = (ReplyEntity) o;

        if (replyId != that.replyId) return false;
        if (view != that.view) return false;
        if (reply != null ? !reply.equals(that.reply) : that.reply != null) return false;
        if (replyTime != null ? !replyTime.equals(that.replyTime) : that.replyTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = replyId;
        result = 31 * result + (reply != null ? reply.hashCode() : 0);
        result = 31 * result + (replyTime != null ? replyTime.hashCode() : 0);
        result = 31 * result + view;
        return result;
    }
}

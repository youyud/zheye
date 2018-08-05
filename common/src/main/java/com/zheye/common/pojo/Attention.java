package com.zheye.common.pojo;

public class Attention {
    private Long id;

    private Long attentionUserId;

    private String befocusedUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttentionUserId() {
        return attentionUserId;
    }

    public void setAttentionUserId(Long attentionUserId) {
        this.attentionUserId = attentionUserId;
    }

    public String getBefocusedUserId() {
        return befocusedUserId;
    }

    public void setBefocusedUserId(String befocusedUserId) {
        this.befocusedUserId = befocusedUserId == null ? null : befocusedUserId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", attentionUserId=").append(attentionUserId);
        sb.append(", befocusedUserId=").append(befocusedUserId);
        sb.append("]");
        return sb.toString();
    }
}
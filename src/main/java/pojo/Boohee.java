package pojo;

public class Boohee {
    private String taskid;

    private String url;

    private Double updatetime;

    private byte[] result;

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Double getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Double updatetime) {
        this.updatetime = updatetime;
    }

    public byte[] getResult() {
        return result;
    }

    public void setResult(byte[] result) {
        this.result = result;
    }
}
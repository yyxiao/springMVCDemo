package cn.springmvc.model;

/**
 * Boohee
 * cn.springmvc.model
 *
 * @author xiaoyy
 * @description
 * @create 2016-11-28 下午5:19
 * The word 'impossible' is not in my dictionary.
 */
public class Boohee {
    private String taskid;

    private String url;

    private Result result;


    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getTaskid() {

        return taskid;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

package mylearning.servicecomb.springboot.vertx.jar.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseResponse<T> {
  private boolean success = true;
  private String msg = "成功!";
  private String code = "200";
  private String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
  private T data;

  public void setMsg(BaseConstantsEnum baseEnum){
    this.code = baseEnum.getCode();
    this.msg = baseEnum.getAlias();
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}

package mylearning.servicecomb.springboot.vertx.jar.sample;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.mapping.Document;

@ApiModel(value = "位置点对象")
//@Document(collection="position")
public class Position implements Serializable {

  private static final long serialVersionUID = 1L;
  /**
   * mongo存储 id
   */
//    @Id
  @ApiModelProperty(value = "mongo存储主键id.只允许自动生成", required = false)
  private String id;
  /**
   * 精度
   */
  @ApiModelProperty(value = "精度", required = true)
  private double accuracy;

  /**
   * 电量
   */
  @ApiModelProperty(value = "电量", required = true)
  private String battery;

  /**
   * 角度
   */
  @ApiModelProperty(value = "角度", required = true)
  private double course;

  /**
   * 时间字符串yyyy-MM-dd HH:mm:ss
   */
  @ApiModelProperty(value = "时间字符串yyyy-MM-dd HH:mm:ss", required = true, example = "2020-01-01 12:12:12")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
//    @Indexed
  private Date gpsTime;


  /**
   * 经度
   */
  @ApiModelProperty(value = "经度", required = true)
  private double lat;

  /**
   * 纬度
   */
  @ApiModelProperty(value = "纬度", required = true)
  private double lon;

  /**
   * x
   */
  @ApiModelProperty(value = "x", required = true)
  private double x;

  /**
   * y
   */
  @ApiModelProperty(value = "y", required = true)
  private double y;

  /**
   * 速度
   */
  @ApiModelProperty(value = "速度", required = true)
  private double speed;

  /**
   * 状态
   */
  @ApiModelProperty(value = "状态", required = true)
  private int state;

  /**
   * 时间
   */
  @ApiModelProperty(value = "时间", required = true)
  private long time;

  /**
   * 姓名
   */
  @ApiModelProperty(value = "姓名", required = true)
  private String trueName;

  /**
   * 用户id
   */
  @ApiModelProperty(value = "用户id", required = true)
//    @Indexed
  private String userId;

  /**
   * 登录名
   */
  @ApiModelProperty(value = "登录名", required = true)
  private String userName;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(double accuracy) {
    this.accuracy = accuracy;
  }

  public String getBattery() {
    return battery;
  }

  public void setBattery(String battery) {
    this.battery = battery;
  }

  public double getCourse() {
    return course;
  }

  public void setCourse(double course) {
    this.course = course;
  }

  public Date getGpsTime() {
    return gpsTime;
  }

  public void setGpsTime(Date gpsTime) {
    this.gpsTime = gpsTime;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLon() {
    return lon;
  }

  public void setLon(double lon) {
    this.lon = lon;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }

  public String getTrueName() {
    return trueName;
  }

  public void setTrueName(String trueName) {
    this.trueName = trueName;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Position)) {
      return false;
    }

    Position position = (Position) o;

    if (Double.compare(position.getAccuracy(), getAccuracy()) != 0) {
      return false;
    }
    if (Double.compare(position.getCourse(), getCourse()) != 0) {
      return false;
    }
    if (Double.compare(position.getLat(), getLat()) != 0) {
      return false;
    }
    if (Double.compare(position.getLon(), getLon()) != 0) {
      return false;
    }
    if (Double.compare(position.getX(), getX()) != 0) {
      return false;
    }
    if (Double.compare(position.getY(), getY()) != 0) {
      return false;
    }
    if (Double.compare(position.getSpeed(), getSpeed()) != 0) {
      return false;
    }
    if (getState() != position.getState()) {
      return false;
    }
    if (getTime() != position.getTime()) {
      return false;
    }
    if (getBattery() != null ? !getBattery().equals(position.getBattery()) : position.getBattery() != null) {
      return false;
    }
    if (getGpsTime() != null ? !getGpsTime().equals(position.getGpsTime()) : position.getGpsTime() != null) {
      return false;
    }
    if (getTrueName() != null ? !getTrueName().equals(position.getTrueName()) : position.getTrueName() != null) {
      return false;
    }
    if (getUserId() != null ? !getUserId().equals(position.getUserId()) : position.getUserId() != null) {
      return false;
    }
    return getUserName() != null ? getUserName().equals(position.getUserName()) : position.getUserName() == null;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(getAccuracy());
    result = (int) (temp ^ (temp >>> 32));
    result = 31 * result + (getBattery() != null ? getBattery().hashCode() : 0);
    temp = Double.doubleToLongBits(getCourse());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (getGpsTime() != null ? getGpsTime().hashCode() : 0);
    temp = Double.doubleToLongBits(getLat());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(getLon());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(getX());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(getY());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(getSpeed());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + getState();
    result = 31 * result + (int) (getTime() ^ (getTime() >>> 32));
    result = 31 * result + (getTrueName() != null ? getTrueName().hashCode() : 0);
    result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
    result = 31 * result + (getUserName() != null ? getUserName().hashCode() : 0);
    return result;
  }


  public Position(double accuracy, String battery, double course, Date gpsTime, double lat, double lon, double x, double y, double speed, int state, long time, String trueName, String userId, String userName) {
    this.accuracy = accuracy;
    this.battery = battery;
    this.course = course;
    this.gpsTime = gpsTime;
    this.lat = lat;
    this.lon = lon;
    this.x = x;
    this.y = y;
    this.speed = speed;
    this.state = state;
    this.time = time;
    this.trueName = trueName;
    this.userId = userId;
    this.userName = userName;
  }

  public Position() {
  }
}

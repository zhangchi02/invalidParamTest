package mylearning.servicecomb.springboot.edge;

import java.text.SimpleDateFormat;

import org.apache.servicecomb.common.rest.codec.AbstractRestObjectMapper;
import org.apache.servicecomb.common.rest.codec.RestObjectMapperFactory;
import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;
import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class EdgeMain {
  public static void main(String[] args) throws Exception {
//   方案一：在这里配置时间格式，会导致网关在转发请求时会把时间格式设置为"yyyy-MM-dd HH:mm:ss"，生效范围为全局
//    AbstractRestObjectMapper mapper =  RestObjectMapperFactory.getRestObjectMapper();
//    SimpleDateFormat myDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    mapper.setDateFormat(myDateFormat);
//    RestObjectMapperFactory.setConsumerWriterMapper(mapper);
//    RestObjectMapperFactory.setDefaultRestObjectMapper(mapper);
//    方案二：将Position拷贝到edge服务,注意包路径要与服务端一致，这样给服务发送请求时，参数格式会以该类为准，缺点是当后端服务修改了该类时，此处也要做相应的修改，否则会报错
//    建议：将时间格式调整成long类型的时间戳格式
    Log4jUtils.init();
    SpringApplication.run(EdgeMain.class, args);
  }
}

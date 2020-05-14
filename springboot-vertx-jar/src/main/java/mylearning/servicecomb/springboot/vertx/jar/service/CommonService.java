package mylearning.servicecomb.springboot.vertx.jar.service;

import java.util.List;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import mylearning.servicecomb.springboot.vertx.jar.sample.BaseResponse;
import mylearning.servicecomb.springboot.vertx.jar.sample.Position;

@RestSchema(schemaId = "common")
@RequestMapping(path = "/springbootvertxjar/v0")
public class CommonService {
  private static final Logger LOG = LoggerFactory.getLogger(CommonService.class);

  @RequestMapping(path = "hello", method = RequestMethod.GET)
  public String sayHello(@RequestParam(name = "name") String name) {
    return "Hello " + name;
  }

  @ApiOperation(value = "位置上报（包含：实时位置上报和历史位置上报）", notes = "位置上报（包含：实时位置上报和历史位置上报）")
  @ApiImplicitParam(paramType = "path", name = "userId", value = "用户id", required = true, dataType = "string")
  @PostMapping(value = "/reportPosition/{userId}")
  public BaseResponse<String> reportPosition(@PathVariable("userId") String userId,
      @ApiParam(value = "位置点集合", allowMultiple = true) @RequestBody List<Position> positions) {
    BaseResponse<String> response = new BaseResponse<>();
    response.setData(positions.get(0).getBattery());
    LOG.info("positions size：{}.", positions.size());
    return response;
  }
}

package test.com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/hello")
    public String helloHtml(HashMap<String,Object> map){
        map.put("hello","hello");
        return"hello";
    }
	@RequestMapping("/get")
	@ResponseBody
	public Object getData() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("id", "2");
		map.put("name", "4");
		map.put("sex", "6");
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("id", "8");
		map2.put("name", "10");
		map2.put("sex", "12");
		List<Object> list = new ArrayList<Object>();
		list.add(map);
		list.add(map2);
		Map<String,Object> map3 = new HashMap<String,Object>();
		map3.put("code", "1");
		map3.put("data", list);
		return JSON.toJSONString(map3);
	}
}

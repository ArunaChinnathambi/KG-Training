package com.aruna;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Welcome")
public class TestController{

@RequestMapping(value = "/Get" , method = RequestMethod.GET)
@ResponseBody
public String getGet(){
return "This Is Get Method";
}

@RequestMapping(value = "/Post" , method = RequestMethod.POST)
@ResponseBody
public String getPost(){
return "This Is Post Method";
}

@RequestMapping(value = "/Header" , headers = "key=val" , method = RequestMethod.GET)
@ResponseBody
public String getHeader(){
return "This Is Header Method";
}

@RequestMapping(value = "/MultipleHeader" , headers = { "key1=val1" , "key2=val2" } , method = RequestMethod.GET)
@ResponseBody
public String getMultipleHeader(){
return "This Is MultipleHeader Method";
}

@RequestMapping(value = "/Consume" , headers = "Accept=application/json" , method = RequestMethod.GET)
@ResponseBody
public String getConsume(){
return "This Is Consume Method";
}

@RequestMapping(value = "/Produce" ,produces= "application/json" , method = RequestMethod.GET)
@ResponseBody
public String getProduce(){
return "This Is Produce Method";
}

@RequestMapping(value = "/MultipleProduce" , produces = { "application/json" , "application/xml" } , method = RequestMethod.GET)
@ResponseBody
public String getMultipleProduce(){
return "This Is MultipleProduce Method";
}

@RequestMapping(value = "/PathVariable/{id}" , method = RequestMethod.GET)
@ResponseBody
public String getPathVariable( @PathVariable("id") long id ){
return "This Is PathVariable Method" + id;
}

@RequestMapping(value = "/PathVariable1/{id}" , method = RequestMethod.GET)
@ResponseBody
public String getPathVariable1(@PathVariable String id){
return "This Is PathVariable1 Method" + id;
}

@RequestMapping(value = "/MultiplePathVariable/{id1}/{id2}" , method = RequestMethod.GET)
@ResponseBody
public String getMultiplePathVariable(@PathVariable long id1, @PathVariable long id2){
return "This Is MultiplePathVariable Method" + id1 +" " + id2;
}

@RequestMapping(value = "/PathVariableNumeric/{id:[\\d]+}" , method = RequestMethod.GET)
@ResponseBody
public String getPathVariableNumeric(@PathVariable long id){
return "This Is PathVariableNumeric Method" + id;
}

@RequestMapping(value = "/RequestParameter" , method = RequestMethod.GET)
@ResponseBody
public String getRequestParameter(@RequestParam("id") long id){
return "This Is RequestParameter Method" + id;
}

@RequestMapping(value = {"/MultiplePath1","/MultiplePath2"} , method = RequestMethod.GET)
@ResponseBody
public String getMultiplePath(){
return "This Is MultiplePath Method";
}

@RequestMapping(value = "/MultipleMethod", method = {RequestMethod.GET,RequestMethod.PUT})
@ResponseBody
public String getMultipleMethod(){
return "This Is MultipleMethod Method";
}

@RequestMapping(value = "*", method = {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@ResponseBody
public String getFallback(){
return "This Is Fallback Method";
}

@GetMapping("/NewGet")
public String getGet1() {
    return "New Get Method";
}

@PostMapping("/NewPost")
public String getPost1() {
    return "New Post Method";
}

@PutMapping("/NewPut")
public String getPut() {
    return "New Put Method";
}

@DeleteMapping("/NewDelete")
public String getDelete() {
    return "New Delete Method";
}

@PatchMapping("/NewPatch")
public String getPatch() {
    return "New Patch Method";
}

}

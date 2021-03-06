package com.dragon.study.springboot.tutorial.importpom;

import com.dragon.study.springboot.tutorial.importpom.bean.TutorialBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dragon on 2017/3/19.
 */
@RestController
@RequestMapping("/tutorials-01")
public class Controller {

  @Autowired
  private TutorialBean tutorialBean;

  @RequestMapping("/hello")
  public String helloWorld() {
    String str = "Hello World";
    System.out.println(str);
    return str;
  }

  @RequestMapping("/tutorialBean")
  public TutorialBean getTutorialBean() {
    System.out.println(tutorialBean.toString());
    return tutorialBean;
  }
}

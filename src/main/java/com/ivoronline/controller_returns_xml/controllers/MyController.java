package com.ivoronline.controller_returns_xml.controllers;

import com.ivoronline.controller_returns_xml.entities.PersonEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public PersonEntity hello() {

    //CREATE INSTANCE
    PersonEntity  personEntity      = new PersonEntity();
                  personEntity.id   = 1;
                  personEntity.name = "John";
                  personEntity.age  = 20;

    //RETURN INSTANCE AS XML
    return personEntity;
  }

}

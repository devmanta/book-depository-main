package com.devmanta.bd;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
   
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   
   @RequestMapping(value = "/test", method = RequestMethod.GET)
   public String home(Locale locale, Model model) {
      
      logger.info("aa");
      logger.debug("bb");
      logger.error("aa");
      
      return "/home";
   }
   
}
package com.example.review_backend;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController 
@CrossOrigin(origins = "*")  
public class SpringBootJdbcController { 

    @Autowired  
            JdbcTemplate jdbc; 
    
    @RequestMapping( path="/addReview", method = RequestMethod.POST)
    public String storeData(@RequestBody String request) throws IOException{
            ObjectMapper myMapper = new ObjectMapper();
            JsonNode extractedData = myMapper.readTree(request);
            String username = extractedData.get("username").asText();
            String reviewContent = extractedData.get("reviewContent").asText();
            String reviewProduct = extractedData.get("reviewProduct").asText();
            System.out.println(username);
            System.out.println(reviewContent);
            System.out.println(reviewProduct);
            // replace with your table query
            jdbc.execute("INSERT INTO `sys`.`all_items` (`item_id`, `item_title`, `item_price`) VALUES ("+username+", "+reviewContent+", "+reviewProduct+")");
            return"data inserted Successfully";  
        }
    

    // @Autowired  
    // JdbcTemplate jdbc;    
    // @RequestMapping("/insert")  
    // public String index(){  
    //     jdbc.execute("INSERT INTO `sys`.`all_items` (`item_id`, `item_title`, `item_price`) VALUES ('4', 'GAqgqg', '750')");
    //     return"data inserted Successfully";  
    // }  
}


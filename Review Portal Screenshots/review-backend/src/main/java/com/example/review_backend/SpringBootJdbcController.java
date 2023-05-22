package com.example.review_backend;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin(origins = "*")  
public class SpringBootJdbcController { 
    
    @RequestMapping( path="/addReview", method = RequestMethod.POST)
    public String storeData(@RequestBody String request) throws IOException{
            System.out.print(request);
            return request;
        }
    // ObjectMapper mapper = new ObjectMapper();
            // JsonNode extractedData = mapper.readTree(request);
            // String username = extractedData.get("username").asText();
            // System.out.print(username);

    // @Autowired  
    // JdbcTemplate jdbc;    
    // @RequestMapping("/insert")  
    // public String index(){  
    //     jdbc.execute("INSERT INTO `sys`.`all_items` (`item_id`, `item_title`, `item_price`) VALUES ('4', 'GAqgqg', '750')");
    //     return"data inserted Successfully";  
    // }  
}


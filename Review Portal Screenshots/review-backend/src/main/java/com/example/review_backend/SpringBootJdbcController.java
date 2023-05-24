package com.example.review_items;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
    @Autowired
    JdbcTemplate jdbc;

    @RequestMapping("/insert")
    public String index(){
        jdbc.execute("INSERT INTO `sys`.`all_items` (`item_title`, `item_price`) VALUES ('Narnia', '780');");
        return "Insertion successful";
    }    

    @RequestMapping(path = "/getItems", method = RequestMethod.GET)
    public List<Item> getItems() throws IOException{
        List<Item> items = jdbc.query("SELECT * FROM `sys`.`all_items`", new ItemMapper());
        return items;
    }


}



// http://localhost:8080/
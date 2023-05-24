package com.example.review_items;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ItemMapper implements RowMapper {
    
    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException{
        Item item = new Item();
        item.setItemID(rs.getString("item_id"));
        item.setItemPrice(rs.getString("item_price"));
        item.setItemTitle(rs.getString("item_title"));
        return item;
    }
}

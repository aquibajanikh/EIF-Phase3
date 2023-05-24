import { useEffect, useState } from "react";
import axios from "axios";

function ItemList(){
    const [allItems, setAllItems] = useState("");

    useEffect(()=>{
        axios.get("http://localhost:9000/getItems")
        .then((res)=>{setAllItems(res.data)})
    },[]);

    return(
        <>
        {
            allItems && allItems.map((item)=>(
                <div>{item.itemTitle}</div>
            ))
        }
        </>
    );
}

export default ItemList;
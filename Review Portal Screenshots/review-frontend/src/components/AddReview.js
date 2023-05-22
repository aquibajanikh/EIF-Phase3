import { useState } from "react";
import axios from "axios";

function AddReview(){

    const [username, setUsername] = useState("");
    const [reviewContent, setReviewContent] = useState("");
    const [reviewProduct, setReviewProduct] = useState("");

    return(
    <section>
        <form onSubmit={(e)=>{e.preventDefault();
            axios.post("http://localhost:3000/",{username, reviewContent, reviewProduct})}}>
            <div>
                <label htmlFor="username">Name : </label>
                <input value={username} onChange={(e)=>{setUsername(e.target.value); console.log(username);}} id="username" type="text" placeholder="Your name here"/>
            </div>
            <div>
                <label htmlFor="reviewContent">Review : </label>
                <input value={reviewContent} onChange={(e)=>{setReviewContent(e.target.value); console.log(reviewContent);}} id="reviewContent" type="text" placeholder="Your review here"/>
            </div>
            <div>
                <label htmlFor="reviewProduct">Product : </label>
                <input value={reviewProduct} onChange={(e)=>{setReviewProduct(e.target.value); console.log(reviewProduct);}} id="reviewProduct" type="text" placeholder="Product name here"/>
            </div>
            <input type="submit" value="Submit Review"/>
        </form>
        </section>);
}

export default AddReview;
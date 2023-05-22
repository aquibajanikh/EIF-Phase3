import { useState } from "react";

function AddReview(){

    const [username, setUsername] = useState("");
    const [reviewContent, setReviewContent] = useState("");
    const [reviewProduct, setReviewProduct] = useState("");

    return(
    <section>
        <form>
            <div>
                <label htmlFor="username">Name : </label>
                <input value={username} onChange={(e)=>{setUsername(e.target.value); console.log(username);}} id="username" type="text" placeholder="Your name here"/>
            </div>
            <div>
                <label htmlFor="reviewContent">Review : </label>
                <input id="reviewContent" type="text" placeholder="Your review here"/>
            </div>
            <div>
                <label htmlFor="reviewProduct">Product : </label>
                <input id="reviewProduct" type="text" placeholder="Product name here"/>
            </div>
            <input type="submit" value="Submit Review"/>
        </form>
        </section>);
}

export default AddReview;
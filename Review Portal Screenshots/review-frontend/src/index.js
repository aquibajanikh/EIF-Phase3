import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Header from './components/Header';
import ItemInfo from './components/ItemInfo';
import ItemReviews from './components/ItemReviews';
import Footer from './components/Footer';
import AddReview from './components/AddReview';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <AddReview/>
    {/* <Header/>
    <ItemInfo/>
    <ItemReviews/>
    <Footer/> */}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

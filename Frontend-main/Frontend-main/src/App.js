import React, { useRef, useState } from "react";
import "./App.css";
import apiClient from "./http-common";


function App() {
 

  const post_name = useRef(null);
  const post_age = useRef(null);
  const post_gender = useRef(null);
  const post_location = useRef(null);
  const post_orderHistory = useRef(null);
  const [tableData, setTableData] = useState([]);




  const [getResult, setGetResult] = useState(null);
  const [postResult, setPostResult] = useState(null);
 

  const fortmatResponse = (res) => {
    return JSON.stringify(res, null, 2);
  };

  async function getAllData() {
    try {
      const res = await apiClient.get("http://localhost:8080/view");

      const result = {

        data: res.data,
        

      };

      setGetResult(fortmatResponse(result));
    } catch (err) {
      setGetResult(fortmatResponse(err.response?.data || err));
    }
  }

  async function postData() {

    const testPostData ={
      person: {
        age: post_age.current.value,
        name: post_name.current.value,
        gender: post_gender.current.value,
        location: post_location.current.value,
        orderHistory: post_orderHistory.current.value,
      },
      allProducts: []
  }

    try {
      const res = await apiClient.post("http://localhost:8080/sugestionValue/value", testPostData, {
        headers: {
          "x-access-token": "token-value",

        },
      });

      const result = {
        data: res.data,

      };

      setPostResult(fortmatResponse(result));
      setTableData(()=>res.data.response.recommendedProducts)
    } catch (err) {
      setPostResult(fortmatResponse(err.response?.data || err));
    }
  }

  function Table({ data }) {
    return (
      <table className="table">
        <thead>
          <tr style={{backgroundColor:'#04AA6D'}}>
            <th>product</th>
            <th>size</th>
            <th>color</th>
            <th>price</th>
            <th>cateogory</th>
          </tr>
        </thead>
        <tbody>
          {data.map((item, index) => (
            <tr key={index}>
              <td>{item.product}</td>
              <td>{item.size}</td>
              <td>{item.color}</td>
              <td>{item.price}</td>
              <td>{item.cateogory}</td>
            </tr>
          ))}
        </tbody>
      </table>
    );
  }

  const clearGetOutput = () => {
    setGetResult(null);
  };

  const clearPostOutput = () => {
    setPostResult(null);
  };

  return (

    <>
   
    <div id="app" className="container mw-5">
        <div class="row">
        <div class="col">
        <div style={{ margin: '100px' }}>
    </div>
      <h1 style={{textAlign:'center'}} > SHOPPING APPLICATION</h1>
      
      
      <div className="App">
      
    </div>

     <h5 style={{textAlign:'center'}}> PLEASE ENTER THE FILTERS</h5>

        <div className="input-group input-group-sm">  
        </div>
            <div id="app" className="container mx-1">

        
        </div>
      </div>
      </div>

      <div className="card mt-1">
        <div >
           </div>
        <div className="card-body">

             
          
         
          <div className="form-group">

            <input type="text" className="form-control" ref={post_age} placeholder="Age"  />

          </div>
          <div className="form-group">
            <input type="text" className="form-control" ref={post_gender} placeholder="Gender" />
          </div>
          <div className="form-group">
            <input type="text" className="form-control" ref={post_location} placeholder="State" />
          </div>
          <div className="form-group">
            <input type="text" className="form-control" ref={post_orderHistory} placeholder="Order History"
             />
          </div>
        
           <div className="form-group">
          <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input type="text" className="form-control" ref={post_name} placeholder="Name" />
          </div>
         <button left={"left"} className=" btn btn-primary btn-block mb-4" onClick={postData}>Submit</button>
         
        </div>
      </div>
      </div>
      <br />
    <div style={{width:"30%", margin: "auto" }}>
    {tableData.length > 0 && <Table data={tableData} />}
    </div>
      
    </>

 
  
  );
}


export default App;

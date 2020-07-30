<%@page import="com.books.model.BookExpert"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.books.model.*" %> 

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Books Suggestions JSP</title>
  </head>
  <style>
    h1{
      margin-top: 50px;
      color: white;
      text-align: center;
      font-size: 60px;
    }
    h3{
    color: red;
    font-size: 30px;
    font-family: Verdana, sans-serif;
    }
    body{
    background: url(books.jpg) no-repeat center center fixed;
    background-size: cover;
    }
    img{
    		height: 350px;
    		width: 200px;
    }
    p{
    	 	font-size: 20px;
    	 	font-weight: bold;
    }
  </style>
  <body>
    <h1 dislpay-2> We suggest the below books</h1>
    <br><br>
	
	<% 
		List<String> styles = (List<String>)request.getAttribute("styles");
		List<String> cardText = (List<String>)request.getAttribute("cardText");
		List<String> imagePath = (List<String>)request.getAttribute("imagePath");
		List<String> shopPath = (List<String>)request.getAttribute("shopPath");
	%> 
	
	<div class="container">
		<div class="row"> <!--Row 1--> 
        <div class="col-sm">
          <div class="col-sm">
                <div class="card card text-white bg-dark" style="width: 20rem;">    
                <img class="card-img-top" src="<% out.print(imagePath.get(0)); %>" alt="<% out.print(styles.get(0)); %>">     
                    <div class="card-body text-center">
                      <h3 class="card-title"> <% out.print(styles.get(0)); %> </h3>
                      <p class="card-text"><% out.print(cardText.get(0)); %></p>
                        <a href="<% out.print(shopPath.get(0)); %>" class="btn btn-success">Shop Now</a> 
                    </div>
                </div>
          </div>
        </div>
        <div class="col-sm">
          <div class="col-sm">
                <div class="card card text-white bg-dark" style="width: 20rem;"> 
                <img class="card-img-top" src="<% out.print(imagePath.get(1)); %>" alt="<% out.print(styles.get(1)); %>">                  
                    <div class="card-body text-center">
                      <h3 class="card-title"> <% out.print(styles.get(1)); %> </h3>
                      <p class="card-text"><% out.print(cardText.get(1)); %></p>
                      <a href="<% out.print(shopPath.get(1)); %>" class="btn btn-success">Shop Now</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm">
          <div class="col-sm">
                <div class="card card text-white bg-dark" style="width: 20rem;"> 
                <img class="card-img-top" src="<% out.print(imagePath.get(2)); %>" alt="<% out.print(styles.get(2)); %>">
                    <div class="card-body text-center">
                      <h3 class="card-title"> <% out.print(styles.get(2)); %> </h3>
                      <p class="card-text"><% out.print(cardText.get(2)); %></p>
                      <a href="<% out.print(shopPath.get(2)); %>" class="btn btn-success">Shop Now</a>
                    </div>
                </div>
            </div>
          </div>
   </div>
 </div>
 
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>

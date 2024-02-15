<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

<style>
	.container{
		background-color: rgb(204, 229, 255); 
		border-radius: 5px;
		width: 60%;
		height:100px;
	}
	
	.input-container{
		display: inline-flex;
	}
	.flights-container{
		width: 60%;
		background-color: rgb(204, 229, 255); 
		margin: 20px auto;
		align-items: center;
		border-radius: 5px;
	}
	table{
		margin:auto;
	}
	th,tr,td{
		padding: 5px;
	}
	
</style>

<script type="text/javascript">
		function handleCabin(button){
			var name = button.getAttribute("name");
			var id = button.getAttribute("id")
			
			
			var xhr = new XMLHttpRequest();
	        
	        xhr.open("POST", "/getCabins/${id}", true);
	        xhr.setRequestHeader("Content-Type", "application/json");
	        
	        /* var data = {
	            cabinType: name
	        };
	        
	        var jsonData = JSON.stringify(data); */
	        
	        xhr.onload = function () {
	            if (xhr.status === 200) {
	                console.log(xhr.responseText); // Log the response from the controller
	            } else {
	                console.error("Request failed. Status: " + xhr.status);
	            }
	        };
	        
	        xhr.send(name);
	        
	        alert(name);
		}
</script>

</head>
<body style="text-align:center">
	<h1 style="color: rgb(0,102,204)">Search Flight</h1>
	
	
	<div class="container">
		<form action="/search" method="post">
			<div class="input-container">
				<input type="text" id="source" name="source" placeholder="From" class="form-control my-3 p-3" required>
				<input type="text" id="destination" name="destination" placeholder="To" class="form-control my-3 p-3" required>
				<input type="date" id="departureDate" name="departureDate" class="form-control my-3 p-3" required>
			</div>
			
			<button type="submit" class="btn btn-submit btn-primary">Search</button>
		</form>
	</div>
	
	<div class="flights-container">
		<div style="padding: 10px;">
			<table class="table table-striped">
		        <thead>
		            <tr>
		                <th>Flight Number</th>
		                <th>Airlines</th>
		                <th>Source</th>
		                <th>Destination</th>
		                <th>Departure date & time</th>
		                <th>duration</th>
		                <th>Book Tickets</th>
		            </tr>
		        </thead>
		        <tbody>
		            <c:forEach var="flight" items="${flights}">
		                <tr>
		                    <td>${flight.getFlightNumber()}</td>
		                    <td>${flight.getAirLines()}</td>
		                    <td>${flight.getSource()}</td>
		                    <td>${flight.getDestination()}</td>
		                    <td>${flight.getDepartureDate()}</td>
		                    <td>${flight.getDuration()}</td>
		                    <td>
		                    	<button class="btn btn-warning">Book</button>
		                    </td>
		                </tr>
		                <tr style="border-bottom: 20px solid white">
			           		<td colspan="2">
			           			<button class="btn btn-primary" name="Economy" id="${flight.getFlightId()}" onclick="handleCabin(this)">Economy</button>
			           		<p>${cabin.getTotalSeats()}</p>
			           		</td>
			           		
			           		<td colspan="2">
			           			<button class="btn btn-primary" name="PremiumEconomy" id="${flight.getFlightId()}" onclick="handleCabin(this)">Premium Economy</button>
			           		</td>
			           		<td>
			           			<button class="btn btn-primary" name="Business" id="${flight.getFlightId()}" onclick="handleCabin(this)">Business</button>
			           		</td>
			           		<td>
			           			<button class="btn btn-primary" name="First" id="${flight.getFlightId()}" onclick="handleCabin(this)">First</button>
			           		</td>
			           </tr>
		                
			           
		            </c:forEach>
		           	
		        </tbody>
    		</table>
		</div>
	</div>
	
</body>
</html>
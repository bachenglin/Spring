$(document).ready(function() {
	console.log("jQuery is loaded!");
	
	$("#btn").click(function() {
		console.log("btn clicked!")
		var zipCode = $("#zip").val();
		$.ajax({
		
			url: "https://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + ",us&appid=a30ebb5af6b78e566e1797db9855606e"
			
		}).then(function(data) {
			console.log(data);
			
			var info = "<h3>";
			info += "CITY: " + data.name + "<br/>";
			info += "MIN: " + data.main.temp_min + "<br/>";
			info += "MAX: " + data.main.temp_max + "<br/>";
			info += "</h3>";
			
			$("#content").append(info);
		})
	})
	
	$("#geobtn").click(function() {
	
		$.ajax({
		
			url: "https://api.openweathermap.org/data/2.5/find?lat=54.5&lon=37.5&cnt=20&appid=a30ebb5af6b78e566e1797db9855606e",
			dataType: 'json',
			success: function(data) {
				$.each(data.list, function(idx) {
					console.log(data.list[idx].name);
					
				})
			},
			error: function(req, status, err) {
				console.log("Error in API: " + err);
			}
			
		})
		
	})
	
})

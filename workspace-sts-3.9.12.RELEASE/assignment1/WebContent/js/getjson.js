$(function(){
  $.ajax({
    type: 'get',
    url: 'https://api.github.com/users',
    dataType: 'json',
    jsonp: "jsoncallback", 
    success: function(data) {
    	
    	
     	
     	
     	var item = data
     	for(var i=0;i<30;i++)
     		{
     		
     		var y = item[i].login;
     		
     		$(".name"+i).append(item[i].login);
     		$(".img"+i).attr("src",item[i].avatar_url);
     		//console.log(i);
     		var j = 0
     		$.ajax({	
     			type: 'get',
     	        url: 'https://api.github.com/users/'+item[i].login,
     	        dataType: 'json',
     	        jsonp: "jsoncallback", 
     	        success: function(data1) {
     	        	//console.log(data1.id -1);
     	        	//console.log(data1);
     	        	//console.log(j);
     	        	$(".followers"+j).append(data1.followers);
     	        	
     	        	$(".public_repos"+j).append(data1.public_repos);
     	        	console.log(data1.public_repos);
     	        	//$(".public_repos1").append(i);
     	        	j = j + 1;
     	     
     	        	//$(".public_repos"+i ).append(item1.public_repos);}
     	 			
     	        }});
     		
     		}
    }
 
  });
  
})


 
  
  
